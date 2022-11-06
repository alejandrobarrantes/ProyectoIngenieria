package rest;

import data.Dao.UsuarioDao;
import logic.Usuario;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@RestController
@RequestMapping(path = "api/login")
public class Login {

    static HttpSession session;
    @CrossOrigin(origins = {"http://localhost:8080","http://localhost:63342"})
    @PostMapping()
    public Usuario login(@RequestBody Usuario usuario,HttpServletRequest request) throws Exception {

            Usuario logged=new Usuario(); 
            UsuarioDao usuarioDao=new UsuarioDao();
            try {

                logged= usuarioDao.traerUsuario(usuario.getUsuario(), usuario.getContrasena());
                logged.setContrasena("");
                session=request.getSession();
                session.setAttribute("user", logged);
                return logged;
            } catch (Exception ex) {
                
            }
        return null;
    }
    
   @GetMapping("/user")
   public Usuario prueba(){
       //HttpSession session = request.getSession(true);
        return (Usuario) session.getAttribute("user");
   }
    
    @DeleteMapping
    public void logout() {
        //HttpSession session = request.getSession(true);
        session.removeAttribute("user");
        session.invalidate();
    }
}
