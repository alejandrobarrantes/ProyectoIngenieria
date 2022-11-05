package com.example.springdemo.data.Dao;

import com.example.springdemo.logic.Patente;
import com.example.springdemo.logic.PatenteInformacion;
import com.example.springdemo.data.Database;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class PatenteInformacionDao {

    public List<PatenteInformacion> listarPatentesInfo() throws Exception {
        List<PatenteInformacion> r = new ArrayList<>();
        String sql = "select * from patente_informacion;";
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
    
    public void create(int idPatenteInformacion, int patente, String nombreComercial, String tipo, String descripcion, String sitioweb, String email, String telefono1, String telefono2, String direccionComercial, String urlTwitter, String urlFacebook, String urlWhatsapp, String urlInstagram, String coordenadas) throws Exception{
        String sql="insert into patente_informacion(idPatente_Informacion,patente,nombre_comercial,tipo,descripcion,sitio_web,email,telefono1,telefono2,direccion_comercial,url_whatsapp, url_facebook,url_instagram, url_twitter,coordenadas) "+
                "values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        PreparedStatement stm = Database.instance().prepareStatement(sql);
        stm.setInt(1,idPatenteInformacion);
        stm.setInt(2,patente);
        stm.setString(3, nombreComercial);
        stm.setString(4,tipo );
        stm.setString(5,descripcion );
        stm.setString(6, sitioweb);
        stm.setString(7, email);
        stm.setString(8,telefono1);
        stm.setString(9, telefono2);
        stm.setString(10, direccionComercial);
        stm.setString(11, urlWhatsapp);
        stm.setString(12, urlFacebook);
        stm.setString(13,urlInstagram);
        stm.setString(14, urlTwitter);
        stm.setString(15, coordenadas);
        Database.instance().executeUpdate(stm);

    }
    
    public List<PatenteInformacion> listarPatentesxTipo(String tipo) throws Exception {
        List<PatenteInformacion> r = new ArrayList<>();
        String sql = "select * from patente_informacion where tipo=?;";
        try {
            PreparedStatement stm = Database.instance().prepareStatement(sql);
            stm.setString(1, tipo);
            ResultSet rs = Database.instance().executeQuery(stm);
            while (rs.next()) {
                r.add(from(rs));
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return r;
    }

    public List<PatenteInformacion> listarPatentesxDireccion(String direccion) throws Exception {
        List<PatenteInformacion> r = new ArrayList<>();
        String sql = "select * from patente_informacion where direccion_comercial = ?;";
        try {
            PreparedStatement stm = Database.instance().prepareStatement(sql);
            stm.setString(1, direccion);
            ResultSet rs = Database.instance().executeQuery(stm);
            while (rs.next()) {
                r.add(from(rs));
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return r;
    }

    public PatenteInformacion traerPatenteInfoxId(int idPatente) throws Exception {
        PatenteInformacion r = null;
        String sql = "select * from patente_informacion where idPatente_Informacion=?";
        PreparedStatement stm = Database.instance().prepareStatement(sql);
        stm.setInt(1, idPatente);
        ResultSet rs = Database.instance().executeQuery(stm);
        if (rs.next()) {
            return from(rs);
        } else {
            return null;
        }
    }
        public PatenteInformacion traerPatenteInfoxNombre(String nombre) throws Exception {
        PatenteInformacion r = null;
        String sql = "select * from patente_informacion where nombre_comercial=?";
        PreparedStatement stm = Database.instance().prepareStatement(sql);
        stm.setString(1, nombre);
        ResultSet rs = Database.instance().executeQuery(stm);
        if (rs.next()) {
            return from(rs);
        } else {
            return null;
        }
    }

    public PatenteInformacion from(ResultSet rs) throws Exception {
        Patente paten = new Patente();
        try {
            PatenteDao lol = new PatenteDao();
            PatenteInformacion patenteInfo = new PatenteInformacion();
            patenteInfo.setIdPatenteInformacion(rs.getInt("idPatente_Informacion"));
            paten = lol.traerPatentexId(rs.getInt("patente"));
            patenteInfo.setPatente(paten);
            patenteInfo.setNombreComercial(rs.getString("nombre_comercial"));
            patenteInfo.setTipo(rs.getString("tipo"));
            patenteInfo.setDescripcion(rs.getString("descripcion"));
            patenteInfo.setEmail(rs.getString("email"));
            patenteInfo.setSitioWeb(rs.getString("sitio_web"));
            patenteInfo.setTelefono1(rs.getString("telefono1"));
            patenteInfo.setTelefono2(rs.getString("telefono2"));
            patenteInfo.setDireccionComercial(rs.getString("direccion_comercial"));
            return patenteInfo;
        } catch (SQLException ex) {
            return null;
        }
    }
}