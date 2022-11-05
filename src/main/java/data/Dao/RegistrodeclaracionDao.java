package data.Dao;

import logic.Patente;
import logic.Registrodeclaracion;
import data.Database;

import java.sql.PreparedStatement;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author adsc9
 */

public class RegistrodeclaracionDao {

    public Registrodeclaracion traerRegistroxId(int idRegistro) throws Exception {
        Registrodeclaracion r = null;
        String sql = "select * from registro_declaracion where idRegistro_Declaracion=?";
        PreparedStatement stm = Database.instance().prepareStatement(sql);
        stm.setInt(1, idRegistro);
        ResultSet rs = Database.instance().executeQuery(stm);
        if (rs.next()) {
            return from(rs);
        } else {
            return null;
        }
    }

    public List<Registrodeclaracion> listarRegistrosxPatente(int idPatente) throws Exception {
        List<Registrodeclaracion> r = new ArrayList<>();
        String sql = "select * from registro_declaracion where patente = ?;";
        try {
            PreparedStatement stm = Database.instance().prepareStatement(sql);
            stm.setInt(1, idPatente);
            ResultSet rs = Database.instance().executeQuery(stm);
            while (rs.next()) {
                r.add(from(rs));
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return r;
    }
    
    public List<Registrodeclaracion> listarRegistros() throws Exception {
        List<Registrodeclaracion> r = new ArrayList<>();
        String sql = "select * from registro_declaracion;";
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
        public List<Registrodeclaracion> listarRegistrosEntreFechas(Timestamp fechaIngre,Timestamp fechaSalida) throws Exception {
        List<Registrodeclaracion> r = new ArrayList<>();
        String sql = "select * from registro_declaracion where fecha_ingreso >= ? and fecha_salida <= ?";
        try {
            PreparedStatement stm = Database.instance().prepareStatement(sql);
            stm.setTimestamp(1, fechaIngre);
            stm.setTimestamp(2, fechaSalida);
            ResultSet rs = Database.instance().executeQuery(stm);
            while (rs.next()) {
                r.add(from(rs));
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return r;
    }

    public Registrodeclaracion from(ResultSet rs) throws Exception {
        Patente patente = new Patente();
        Registrodeclaracion registro = new Registrodeclaracion();
        try {
            registro.setIdRegistro_Declaracion(rs.getInt("idRegistro_Declaracion"));
            PatenteDao lol = new PatenteDao();
            patente = lol.traerPatentexId(rs.getInt("patente"));
            registro.setPatente(patente);
            registro.setFecha_ingreso(rs.getTimestamp("fecha_ingreso"));
            registro.setFecha_salida(rs.getTimestamp("fecha_salida"));
            registro.setEstado(rs.getString("estado"));
            registro.setFormulario_declaracion(rs.getString("formulario_declaracion"));
            registro.setDeclaracion_jurada(rs.getString("declaracion_jurada"));
            registro.setPersoneria_juridica(rs.getString("personeria_juridica"));
            registro.setNota_no_tributa(rs.getString("nota_no_tributa"));
            return registro;
        } catch (SQLException ex) {
            return null;
        }
    }

}
