
package com.java.data.Dao;

import com.java.data.Database;
import com.java.logic.Patentado;
import com.java.logic.Patente;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Dell
 */
public class PatenteDao {
    
    
    public void create(int idPatente, int patentado,String ubicacion, String cedJuridica ) throws Exception{
        String sql="insert into patente(idPatente, patentado,ubicacion, cedulaJuridica) "+
                "values(?,?,?,?)";
        PreparedStatement stm = Database.instance().prepareStatement(sql);
        stm.setInt(1, idPatente);
        stm.setInt(2, patentado);
        stm.setString(3, ubicacion);
        stm.setString(4, cedJuridica);
        Database.instance().executeUpdate(stm);

    }
    
    
    public Patente traerPatentexId(int idPatente) throws Exception{
        Patente r = null;
        String sql = "select * from patente where idPatente=?";
        PreparedStatement stm = Database.instance().prepareStatement(sql);
        stm.setInt(1, idPatente);
        ResultSet rs =  Database.instance().executeQuery(stm);           
        if (rs.next()) {
            return from(rs);
        }
        else{
            return null;
        }
    }
            
    public Patente traerPatentexIdPatentado(int patentado) throws Exception{
        Patente r = null;
        String sql = "select * from patente where patentado=?";
        PreparedStatement stm = Database.instance().prepareStatement(sql);
        stm.setInt(1, patentado);
        ResultSet rs =  Database.instance().executeQuery(stm);           
        if (rs.next()) {
            return from(rs);
        }
        else{
            return null;
        }
    }
    
    public Patente traerPatenteCedJuridica(String cedJuridica) throws Exception{
        Patente r = null;
        String sql = "select * from patente where cedulaJuridica=?";
        PreparedStatement stm = Database.instance().prepareStatement(sql);
        stm.setString(1, cedJuridica);
        ResultSet rs =  Database.instance().executeQuery(stm);           
        if (rs.next()) {
            return from(rs);
        }
        else{
            return null;
        }
    }
    
    public List<Patente> listarPatentes() throws Exception{
        List<Patente> r = new ArrayList<>();
        String sql = "select * from patente;";
        try {
             PreparedStatement stm = Database.instance().prepareStatement(sql);
            ResultSet rs =  Database.instance().executeQuery(stm); 
            while (rs.next()) {
                r.add(from(rs));
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return r;
    }
        public List<Patente> listarPatentesxUbicacion(String ubicacion) throws Exception{
        List<Patente> r = new ArrayList<>();
        String sql = "select * from patente where ubicacion=?;";
        try {
        PreparedStatement stm = Database.instance().prepareStatement(sql);
        stm.setString(1, ubicacion);
        ResultSet rs =  Database.instance().executeQuery(stm);  
            while (rs.next()) {
                r.add(from(rs));
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return r;
    }
    
    public Patente from (ResultSet rs) throws Exception{
        Patentado paten = new Patentado();
        try {
            Patente patente= new Patente(); //creamos el objeto patente
            patente.setIdPatente(rs.getInt("idPatente"));
            PatentadoDao lol = new PatentadoDao();
            paten = lol.traerPatentado(rs.getInt("patentado"));
            patente.setPatentado(paten);
            patente.setUbicacion(rs.getString("ubicacion"));
            patente.setCedulaJuridica(rs.getString("cedulaJuridica"));
            return patente;
        } catch (SQLException ex) {
            return null;
        }
    }
}
