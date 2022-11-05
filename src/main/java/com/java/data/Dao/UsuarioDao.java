/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.java.data.Dao;

import com.java.data.Database;
import com.java.logic.Usuario;

import java.util.ArrayList;
import java.util.List;

import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.SQLException;
/**
 *
 * @author adsc9
 */
public class UsuarioDao {
    
        public void create(String usuario, String clave, int rol ) throws Exception{
        String sql="insert into usuario (usuario, contrasena, rol) "+
                "values(?,?,?)";
        PreparedStatement stm = Database.instance().prepareStatement(sql);
        stm.setString(1, usuario);
        stm.setString(2, clave);
        stm.setInt(3, rol);
      
        int count=Database.instance().executeUpdate(stm);
        if (count==0){
            throw new Exception("Usuario ya existe");
        }
    }
        
     public void cambiarStatus(String estado, int id) throws Exception{
        try {
            String sql = "update usuario set estado = ? where idUsuario = ?";
            PreparedStatement stm = Database.instance().prepareStatement(sql);
            stm.setString(1, estado);
            stm.setInt(2, id);
            Database.instance().executeUpdate(stm);
        } catch (SQLException ex) {
            throw new Exception("Usuario no existe");

        }
    }

        public List<Usuario> listarUsuarios() throws Exception{
        List<Usuario> r = new ArrayList<>();
        String sql = "select * from usuario";
        try {
             PreparedStatement stm = Database.instance().prepareStatement(sql);
            ResultSet rs =  Database.instance().executeQuery(stm); 
            while (rs.next()) {
                r.add(from(rs));
            }
        } catch (SQLException ex) {
        }
        return r;
    }
        
        public Usuario traerUsuario(int id,String cla) throws Exception{
        String sql="select * from usuario where idUsuario=? AND contrasena=?";
        PreparedStatement stm = Database.instance().prepareStatement(sql);
        stm.setInt(1, id);
        stm.setString(2, cla);
        ResultSet rs =  Database.instance().executeQuery(stm);           
        if (rs.next()) {
            return from(rs);
        }
        else{
            return null;
        }
    }
        
         public Usuario traerUsuario(String usuario,String contrasena) throws Exception{
        String sql="select * from usuario where usuario=? AND contrasena=?";
        PreparedStatement stm = Database.instance().prepareStatement(sql);
        stm.setString(1, usuario);
        stm.setString(2, contrasena);
        ResultSet rs =  Database.instance().executeQuery(stm);           
        if (rs.next()) {
            return from(rs);
        }
        else{
            return null;
        }
    }
         
        public Usuario traerUsuarioId(int id) throws Exception{
        String sql="select * from usuario where idUsuario=?";
        PreparedStatement stm = Database.instance().prepareStatement(sql);
        stm.setInt(1, id);
        ResultSet rs =  Database.instance().executeQuery(stm);           
        if (rs.next()) {
            
            return from(rs);
        }
        else{
            return null;
        }
    }

        public Usuario from (ResultSet rs){
        try {
            Usuario r= new Usuario(); //creamos el usuario
            r.setRol(rs.getInt("rol"));
            r.setId(rs.getInt("idUsuario"));
            r.setUsuario(rs.getString("usuario"));
            r.setContrasena(rs.getString("contrasena"));
            r.setEstado(rs.getString("estado"));
            return r;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return null;
        }
    }
            
            
    
}
