package rest;

import data.Dao.UsuarioDao;
import logic.Usuario;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@RestController
@RequestMapping(path = "api")
public class UsuarioRest {

    HttpServletRequest request;

    @CrossOrigin(origins = {"http://localhost:8080","http://localhost:63342"})
    @PostMapping("/login")
    public Usuario login(@RequestBody Usuario usuario) throws Exception {
        System.out.println("entraLogin");
            Usuario logged=new Usuario(); 
            UsuarioDao usuarioDao=new UsuarioDao();
            try {
                logged= usuarioDao.traerUsuario(usuario.getUsuario(), usuario.getContrasena());
                logged.setContrasena("");
                //request.getSession(true).setAttribute("user", logged);
                return logged;
            } catch (Exception ex) {
                
            }
        return null;
    }
    
   @GetMapping("/user")
   public Usuario prueba(){
       HttpSession session = request.getSession(true);
        return (Usuario) session.getAttribute("user");
   }
    
    @DeleteMapping
    public void logout() {  
        HttpSession session = request.getSession(true);
        session.removeAttribute("user");
        session.invalidate();
    }
}
