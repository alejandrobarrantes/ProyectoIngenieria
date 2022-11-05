package com.example.springdemo.logic;

import java.util.Objects;


public class PatenteInformacion {
    public int idPatenteInformacion;
    public Patente patente;
    public String nombreComercial;
    public String tipo;
    public String descripcion;
    public String sitioWeb;
    public String email;
    public String telefono1;
    public String telefono2;
    public String direccionComercial;
    public String urlTwitter;   
    public String urlFacebook;
    public String urlWhatsapp;
    public String urlInstagram;
    public String coordenadas;

    public PatenteInformacion(int idPatenteInformacion, Patente patente, String nombreComercial, String tipo, String descripcion, String sitioWeb, String email, String telefono1, String telefono2, String direccionComercial, String urlTwitter, String urlFacebook, String urlWhatsapp, String urlInstagram, String coordenadas) {
        this.idPatenteInformacion = idPatenteInformacion;
        this.patente = patente;
        this.nombreComercial = nombreComercial;
        this.tipo = tipo;
        this.descripcion = descripcion;
        this.sitioWeb = sitioWeb;
        this.email = email;
        this.telefono1 = telefono1;
        this.telefono2 = telefono2;
        this.direccionComercial = direccionComercial;
        this.urlTwitter = urlTwitter;
        this.urlFacebook = urlFacebook;
        this.urlWhatsapp = urlWhatsapp;
        this.urlInstagram = urlInstagram;
        this.coordenadas = coordenadas;
    }
    
    public PatenteInformacion(){
        
    }

    public int getIdPatenteInformacion() {
        return idPatenteInformacion;
    }

    public void setIdPatenteInformacion(int idPatenteInformacion) {
        this.idPatenteInformacion = idPatenteInformacion;
    }

    public Patente getPatente() {
        return patente;
    }

    public void setPatente(Patente patente) {
        this.patente = patente;
    }

    public String getNombreComercial() {
        return nombreComercial;
    }

    public void setNombreComercial(String nombreComercial) {
        this.nombreComercial = nombreComercial;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getSitioWeb() {
        return sitioWeb;
    }

    public void setSitioWeb(String sitioWeb) {
        this.sitioWeb = sitioWeb;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefono1() {
        return telefono1;
    }

    public void setTelefono1(String telefono1) {
        this.telefono1 = telefono1;
    }

    public String getTelefono2() {
        return telefono2;
    }

    public void setTelefono2(String telefono2) {
        this.telefono2 = telefono2;
    }

    public String getDireccionComercial() {
        return direccionComercial;
    }

    public void setDireccionComercial(String direccionComercial) {
        this.direccionComercial = direccionComercial;
    }

    public String getUrlTwitter() {
        return urlTwitter;
    }

    public void setUrlTwitter(String urlTwitter) {
        this.urlTwitter = urlTwitter;
    }

    public String getUrlFacebook() {
        return urlFacebook;
    }

    public void setUrlFacebook(String urlFacebook) {
        this.urlFacebook = urlFacebook;
    }

    public String getUrlWhatsapp() {
        return urlWhatsapp;
    }

    public void setUrlWhatsapp(String urlWhatsapp) {
        this.urlWhatsapp = urlWhatsapp;
    }

    public String getUrlInstagram() {
        return urlInstagram;
    }

    public void setUrlInstagram(String urlInstagram) {
        this.urlInstagram = urlInstagram;
    }

    public String getCoordenadas() {
        return coordenadas;
    }

    public void setCoordenadas(String coordenadas) {
        this.coordenadas = coordenadas;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 59 * hash + this.idPatenteInformacion;
        hash = 59 * hash + Objects.hashCode(this.patente);
        hash = 59 * hash + Objects.hashCode(this.nombreComercial);
        hash = 59 * hash + Objects.hashCode(this.tipo);
        hash = 59 * hash + Objects.hashCode(this.descripcion);
        hash = 59 * hash + Objects.hashCode(this.sitioWeb);
        hash = 59 * hash + Objects.hashCode(this.email);
        hash = 59 * hash + Objects.hashCode(this.telefono1);
        hash = 59 * hash + Objects.hashCode(this.telefono2);
        hash = 59 * hash + Objects.hashCode(this.direccionComercial);
        hash = 59 * hash + Objects.hashCode(this.urlTwitter);
        hash = 59 * hash + Objects.hashCode(this.urlFacebook);
        hash = 59 * hash + Objects.hashCode(this.urlWhatsapp);
        hash = 59 * hash + Objects.hashCode(this.urlInstagram);
        hash = 59 * hash + Objects.hashCode(this.coordenadas);
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
        final PatenteInformacion other = (PatenteInformacion) obj;
        if (this.idPatenteInformacion != other.idPatenteInformacion) {
            return false;
        }
        if (!Objects.equals(this.nombreComercial, other.nombreComercial)) {
            return false;
        }
        if (!Objects.equals(this.tipo, other.tipo)) {
            return false;
        }
        if (!Objects.equals(this.descripcion, other.descripcion)) {
            return false;
        }
        if (!Objects.equals(this.sitioWeb, other.sitioWeb)) {
            return false;
        }
        if (!Objects.equals(this.email, other.email)) {
            return false;
        }
        if (!Objects.equals(this.telefono1, other.telefono1)) {
            return false;
        }
        if (!Objects.equals(this.telefono2, other.telefono2)) {
            return false;
        }
        if (!Objects.equals(this.direccionComercial, other.direccionComercial)) {
            return false;
        }
        if (!Objects.equals(this.urlTwitter, other.urlTwitter)) {
            return false;
        }
        if (!Objects.equals(this.urlFacebook, other.urlFacebook)) {
            return false;
        }
        if (!Objects.equals(this.urlWhatsapp, other.urlWhatsapp)) {
            return false;
        }
        if (!Objects.equals(this.urlInstagram, other.urlInstagram)) {
            return false;
        }
        if (!Objects.equals(this.coordenadas, other.coordenadas)) {
            return false;
        }
        return Objects.equals(this.patente, other.patente);
    }

    @Override
    public String toString() {
        return "PatenteInformacion{" + "idPatenteInformacion=" + idPatenteInformacion + ", patente=" + patente + ", nombreComercial=" + nombreComercial + ", tipo=" + tipo + ", descripcion=" + descripcion + ", sitioWeb=" + sitioWeb + ", email=" + email + ", telefono1=" + telefono1 + ", telefono2=" + telefono2 + ", direccionComercial=" + direccionComercial + ", urlTwitter=" + urlTwitter + ", urlFacebook=" + urlFacebook + ", urlWhatsapp=" + urlWhatsapp + ", urlInstagram=" + urlInstagram + ", coordenadas=" + coordenadas + '}';
    }
    
    
    
    
    
    
   
}