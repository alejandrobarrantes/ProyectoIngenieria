
package com.example.springdemo.logic;

import java.util.Objects;

import java.sql.*;

/**
 *
 * @author adsc9
 */

public class Registrodeclaracion {
    
    int idRegistro_Declaracion;
    Patente patente;
    Timestamp fecha_ingreso;
    Timestamp fecha_salida;
    String estado;
    String formulario_declaracion;
    String declaracion_jurada;
    String personeria_juridica;
    String nota_no_tributa;
    

    public Registrodeclaracion(int idRegistro_Declaracion, Patente patente, Timestamp fecha_ingreso, Timestamp fecha_salida, String estado, String formulario_declaracion, String declaracion_jurada, String personeria_juridica, String nota_no_tributa) {
        this.idRegistro_Declaracion = idRegistro_Declaracion;
        this.patente = patente;
        this.fecha_ingreso = fecha_ingreso;
        this.fecha_salida = fecha_salida;
        this.estado = estado;
        this.formulario_declaracion = formulario_declaracion;
        this.declaracion_jurada = declaracion_jurada;
        this.personeria_juridica = personeria_juridica;
        this.nota_no_tributa = nota_no_tributa;
    }

    public Registrodeclaracion() {
        
    }
    public Registrodeclaracion(int idRegistro_Declaracion, Patente patente, Timestamp fecha_ingreso) {
        this.idRegistro_Declaracion = idRegistro_Declaracion;
        this.patente = patente;
        this.fecha_ingreso = fecha_ingreso;
        this.fecha_salida = null;
        this.estado = "pendiente";
        this.formulario_declaracion = null;
        this.declaracion_jurada = null;
        this.personeria_juridica = null;
        this.nota_no_tributa = null;
    }

    public Registrodeclaracion(int idRegistro_Declaracion, Patente patente, Timestamp fecha_ingreso, String formulario_declaracion, String declaracion_jurada, String personeria_juridica, String nota_no_tributa) {
        this.idRegistro_Declaracion = idRegistro_Declaracion;
        this.patente = patente;
        this.fecha_ingreso = fecha_ingreso;
        this.formulario_declaracion = formulario_declaracion;
        this.declaracion_jurada = declaracion_jurada;
        this.personeria_juridica = personeria_juridica;
        this.nota_no_tributa = nota_no_tributa;
    }
    
    
    public int getIdRegistro_Declaracion() {
        return idRegistro_Declaracion;
    }

    public void setIdRegistro_Declaracion(int idRegistro_Declaracion) {
        this.idRegistro_Declaracion = idRegistro_Declaracion;
    }

    public Patente getPatente() {
        return patente;
    }

    public void setPatente(Patente patente) {
        this.patente = patente;
    }


    public Timestamp getFecha_ingreso() {
        return fecha_ingreso;
    }

    public void setFecha_ingreso(Timestamp fecha_ingreso) {
        this.fecha_ingreso = fecha_ingreso;
    }

    public Timestamp getFecha_salida() {
        return fecha_salida;
    }

    public void setFecha_salida(Timestamp fecha_salida) {
        this.fecha_salida = fecha_salida;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getFormulario_declaracion() {
        return formulario_declaracion;
    }

    public void setFormulario_declaracion(String formulario_declaracion) {
        this.formulario_declaracion = formulario_declaracion;
    }

    public String getDeclaracion_jurada() {
        return declaracion_jurada;
    }

    public void setDeclaracion_jurada(String declaracion_jurada) {
        this.declaracion_jurada = declaracion_jurada;
    }

    public String getPersoneria_juridica() {
        return personeria_juridica;
    }

    public void setPersoneria_juridica(String personeria_juridica) {
        this.personeria_juridica = personeria_juridica;
    }

    public String getNota_no_tributa() {
        return nota_no_tributa;
    }

    public void setNota_no_tributa(String nota_no_tributa) {
        this.nota_no_tributa = nota_no_tributa;
    }

    @Override
    public String toString() {
        return "Registrodeclaracion{" + "idRegistro_Declaracion=" + idRegistro_Declaracion + ", patente=" + patente + ", fecha_ingreso=" + fecha_ingreso + ", fecha_salida=" + fecha_salida + ", estado=" + estado + ", formulario_declaracion=" + formulario_declaracion + ", declaracion_jurada=" + declaracion_jurada + ", personeria_juridica=" + personeria_juridica + ", nota_no_tributa=" + nota_no_tributa + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 31 * hash + this.idRegistro_Declaracion;
        hash = 31 * hash + Objects.hashCode(this.patente);
        hash = 31 * hash + Objects.hashCode(this.fecha_ingreso);
        hash = 31 * hash + Objects.hashCode(this.fecha_salida);
        hash = 31 * hash + Objects.hashCode(this.estado);
        hash = 31 * hash + Objects.hashCode(this.formulario_declaracion);
        hash = 31 * hash + Objects.hashCode(this.declaracion_jurada);
        hash = 31 * hash + Objects.hashCode(this.personeria_juridica);
        hash = 31 * hash + Objects.hashCode(this.nota_no_tributa);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Registrodeclaracion other = (Registrodeclaracion) obj;
        if (this.idRegistro_Declaracion != other.idRegistro_Declaracion) {
            return false;
        }
        if (!Objects.equals(this.estado, other.estado)) {
            return false;
        }
        if (!Objects.equals(this.formulario_declaracion, other.formulario_declaracion)) {
            return false;
        }
        if (!Objects.equals(this.declaracion_jurada, other.declaracion_jurada)) {
            return false;
        }
        if (!Objects.equals(this.personeria_juridica, other.personeria_juridica)) {
            return false;
        }
        if (!Objects.equals(this.nota_no_tributa, other.nota_no_tributa)) {
            return false;
        }
        if (!Objects.equals(this.patente, other.patente)) {
            return false;
        }
        if (!Objects.equals(this.fecha_ingreso, other.fecha_ingreso)) {
            return false;
        }
        return Objects.equals(this.fecha_salida, other.fecha_salida);
    }
    
    


    
    
    
}
