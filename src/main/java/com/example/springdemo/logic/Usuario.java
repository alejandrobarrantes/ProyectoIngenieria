/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.springdemo.logic;

/**
 *
 * @author adsc9
 */
public class Usuario {
    
    int id;
    String usuario;
    String contrasena;
    int rol;
    String estado;

    public Usuario(int id, String usuario, String contrasena, int rol, String estado) {
        this.id = id;
        this.usuario = usuario;
        this.contrasena = contrasena;
        this.rol = rol;
        this.estado = estado;
    }


    public Usuario() {
    }

    
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public int getRol() {
        return rol;
    }

    public void setRol(int rol) {
        this.rol = rol;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Usuario{" + "id=" + id + ", usuario=" + usuario + ", contrasena=" + contrasena + ", rol=" + rol + ", estado=" + estado + '}';
    }
    
}
