/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.springdemo.logic;

/**
 *
 * @author Dell
 */
public class Verificacion {
    int id;
    String nombre;
    String cedula;
    String correo ; 
    String telefono ; 
    String nombreEmpresa ;
    String telefonoEmpresa ;
    String direccionEmpresa;

    public Verificacion() {
    }

    
    public Verificacion(int id, String nombre, String cedula, String correo, String telefono, String nombreEmpresa, String telefonoEmpresa, String direccionEmpresa) {
        this.id = id;
        this.nombre = nombre;
        this.cedula = cedula;
        this.correo = correo;
        this.telefono = telefono;
        this.nombreEmpresa = nombreEmpresa;
        this.telefonoEmpresa = telefonoEmpresa;
        this.direccionEmpresa = direccionEmpresa;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }

    public String getTelefonoEmpresa() {
        return telefonoEmpresa;
    }

    public void setTelefonoEmpresa(String telefonoEmpresa) {
        this.telefonoEmpresa = telefonoEmpresa;
    }

    public String getDireccionEmpresa() {
        return direccionEmpresa;
    }

    public void setDireccionEmpresa(String direccionEmpresa) {
        this.direccionEmpresa = direccionEmpresa;
    }

    @Override
    public String toString() {
        return "Verificacion{" + "id=" + id + ", nombre=" + nombre + ", cedula=" + cedula + ", correo=" + correo + ", telefono=" + telefono + ", nombreEmpresa=" + nombreEmpresa + ", telefonoEmpresa=" + telefonoEmpresa + ", direccionEmpresa=" + direccionEmpresa + '}';
    }
    
    
    
    
}
