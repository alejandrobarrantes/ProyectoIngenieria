/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.springdemo.logic;

import java.util.Objects;

/**
 *
 * @author Andres Rojas
 */
public class Administrador {

    int idAdministrador;

    Usuario usuario;
    String nombre;
    String apellido;

    public int getIdAdministrador() {
        return idAdministrador;
    }

    public void setIdAdministrador(int idAdministrador) {
        this.idAdministrador = idAdministrador;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Administrador(int idAdministrador, Usuario usuarioid, String nombre, String apellido) {
        this.idAdministrador = idAdministrador;
        this.usuario = usuarioid;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public Administrador() {
    }

    @Override
    public String toString() {
        return "Administrador{" + "idAdministrador=" + idAdministrador + ", usuario=" + usuario + ", nombre=" + nombre + ", apellido=" + apellido + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + this.idAdministrador;
        hash = 97 * hash + Objects.hashCode(this.usuario);
        hash = 97 * hash + Objects.hashCode(this.nombre);
        hash = 97 * hash + Objects.hashCode(this.apellido);
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
        final Administrador other = (Administrador) obj;
        if (this.idAdministrador != other.idAdministrador) {
            return false;
        }
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        if (!Objects.equals(this.apellido, other.apellido)) {
            return false;
        }
        return Objects.equals(this.usuario, other.usuario);
    }
    
    
    

}
