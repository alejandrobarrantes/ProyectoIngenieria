/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.springdemo.data.Dao;

import com.example.springdemo.data.Database;
import com.example.springdemo.logic.Patentado;
import com.example.springdemo.logic.Usuario;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author WendyLA
 */
public class PatentadoDao {
    
        public void create(int usuario, String nombre, String apellido, String cedula) throws Exception {
        String sql = "insert into patentado (usuario, nombre, apellido, cedula) "
                + "values(?,?,?,?)";
        PreparedStatement stm = Database.instance().prepareStatement(sql);
        stm.setInt(1, usuario);
        stm.setString(2, nombre);
        stm.setString(3, apellido);
        stm.setString(4, cedula);
        int count = Database.instance().executeUpdate(stm);
        if (count == 0) {
            throw new Exception("Patentado ya existe");
        }
    }
    
    
     public Patentado traerPatentado(int id) throws Exception {
        String sql = "select * from patentado where idPatentado=?";
        PreparedStatement stm = Database.instance().prepareStatement(sql);
        stm.setInt(1, id);
        ResultSet rs = Database.instance().executeQuery(stm);
        if (rs.next()) {

            return from(rs);
        } else {
            return null;
        }
    }
    
    
    
    public List<Patentado> listarPatentados() throws Exception {
        List<Patentado> r = new ArrayList<>();
        String sql = "select * from patentado";
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
    
    
    
     public Patentado from(ResultSet rs) throws Exception {
        Usuario usu = null;
        try {
            UsuarioDao lol = new UsuarioDao();
            Patentado r = new Patentado();
            r.setIdPatentado(rs.getInt("idPatentado"));
            r.setNombre(rs.getString("nombre"));
            r.setApellido(rs.getString("apellido"));
            r.setCedula(rs.getString("cedula"));
            usu = lol.traerUsuarioId(rs.getInt("usuario"));
            r.setUsuario(usu);
            return r;
        } catch (SQLException ex) {
            return null;
        }
    }

     
     
}
