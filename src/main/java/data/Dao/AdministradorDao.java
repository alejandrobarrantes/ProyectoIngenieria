
package data.Dao;

import data.Database;
import logic.Administrador;
import logic.Usuario;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Andres Rojas
 */
public class AdministradorDao {

    public void create(int usuario, String nombre, String apellido) throws Exception {

        String sql = "insert into administrador (usuario, nombre, apellido) "
                + "values(?,?,?)";
        PreparedStatement stm = Database.instance().prepareStatement(sql);
        stm.setInt(1, usuario);
        stm.setString(2, nombre);
        stm.setString(3, apellido);

        int count = Database.instance().executeUpdate(stm);
        if (count == 0) {
            throw new Exception("Administrador ya existe");
        }
    }
    
    

    

    public List<Administrador> listarAdministradores() throws Exception {
        List<Administrador> r = new ArrayList<>();
        String sql = "select * from administrador";
        try {
            PreparedStatement stm = Database.instance().prepareStatement(sql);
            ResultSet rs = Database.instance().executeQuery(stm);
            while (rs.next()) {
                r.add(from(rs));
            }
        } catch (SQLException ex) {
        }
        return r;
    }

    public Administrador traeAdminxUsuario(int id) throws Exception {
//            este busca unicamente por el usuario
        String sql = "select * from administrador where usuario=?";
        PreparedStatement stm = Database.instance().prepareStatement(sql);
        stm.setInt(1, id);
        ResultSet rs = Database.instance().executeQuery(stm);
        if (rs.next()) {
            return from(rs);
        } else {
            return null;
        }
    }


    
    public Administrador traeAdminxId(int id) throws Exception {
//      Este lo busca por la pk
        String sql = "select * from administrador where idAdministrador=?";
        PreparedStatement stm = Database.instance().prepareStatement(sql);
        stm.setInt(1, id);
        ResultSet rs = Database.instance().executeQuery(stm);
        if (rs.next()) {
            return from(rs);
        } else {
            return null;
        }
    }

    public Administrador from(ResultSet rs) throws Exception {
        Usuario punterito = null;
        try {
            UsuarioDao prueba = new UsuarioDao();
            Administrador r = new Administrador(); //creamos el usuario
            r.setIdAdministrador(rs.getInt("idAdministrador"));
            punterito = prueba.traerUsuarioId(rs.getInt("usuario"));
            r.setUsuario(punterito);
            r.setNombre(rs.getString("nombre"));
            r.setApellido(rs.getString("apellido"));
            return r;
        } catch (SQLException ex) {
            return null;
        }
    }
    
}


