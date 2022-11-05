/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.java.data.Dao;

import com.java.data.Database;
import com.java.logic.Verificacion;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Dell
 */
public class VerificacionDao {
    
    public List<Verificacion> listarVerificaciones() throws Exception {
        List<Verificacion> r = new ArrayList<>();
        String sql = "select * from verificacion;";
        try {
            PreparedStatement stm = Database.instance().prepareStatement(sql);
            ResultSet rs = Database.instance().executeQuery(stm);
            while (rs.next()) {
                r.add(from(rs));
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return r;
    }
    
    public void create(String nombre,String cedula,String correo,String telefono,String nombreEmpresa,String telefonoEmpresa,String direccionEmpresa) throws Exception{
        String sql="insert into verificacion(nombre,cedula,correo,telefono,nombreEmpresa,telefonoEmpresa,"+
                "direccionEmpresa) values(?,?,?,?,?,?,?)";

        try {
            PreparedStatement stm = Database.instance().prepareStatement(sql);
          
            stm.setString(1,nombre);
            stm.setString(2, cedula);
            stm.setString(3,correo );
            stm.setString(4,telefono );
            stm.setString(5, nombreEmpresa);
            stm.setString(6, telefonoEmpresa);
            stm.setString(7,direccionEmpresa);
        Database.instance().executeUpdate(stm);
        } catch (Exception e) {
            e.printStackTrace();
        }
        

    }
    
    
    public Verificacion from(ResultSet rs) throws Exception {
        Verificacion verificacion = new Verificacion();
        try {
            verificacion.setId(rs.getInt("id"));
            verificacion.setNombre(rs.getString("nombre"));
            verificacion.setCedula(rs.getString("cedula"));
            verificacion.setCorreo(rs.getString("correo"));
            verificacion.setTelefono(rs.getString("telefono"));
            verificacion.setNombreEmpresa(rs.getString("nombreEmpresa"));
            verificacion.setTelefonoEmpresa(rs.getString("telefonoEmpresa"));
            verificacion.setDireccionEmpresa(rs.getString("direccionEmpresa"));
            return verificacion;
        } catch (SQLException ex) {
            return null;
        }
    }
}
