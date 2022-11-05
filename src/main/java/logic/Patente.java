/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.app to edit this template
 */
package logic;

import java.util.Objects;

/**
 *
 * @author Dell
 */
public class Patente {
    int idPatente;
    Patentado patentado;
    String ubicacion;
    String cedulaJuridica;

    public Patente(int idPatente, Patentado patentado, String ubicacion, String cedulaJuridica) {
        this.idPatente = idPatente;
        this.patentado = patentado;
        this.ubicacion = ubicacion;
        this.cedulaJuridica = cedulaJuridica;
    }



    public Patente() {
    }

    public int getIdPatente() {
        return idPatente;
    }

    public void setIdPatente(int idPatente) {
        this.idPatente = idPatente;
    }

    public Patentado getPatentado() {
        return patentado;
    }

    public void setPatentado(Patentado patentado) {
        this.patentado = patentado;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public String getCedulaJuridica() {
        return cedulaJuridica;
    }

    public void setCedulaJuridica(String cedulaJuridica) {
        this.cedulaJuridica = cedulaJuridica;
    }

    @Override
    public String toString() {
        return "Patente{" + "idPatente=" + idPatente + ", patentado=" + patentado + ", ubicacion=" + ubicacion + ", cedulaJuridica=" + cedulaJuridica + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 17 * hash + this.idPatente;
        hash = 17 * hash + Objects.hashCode(this.patentado);
        hash = 17 * hash + Objects.hashCode(this.ubicacion);
        hash = 17 * hash + Objects.hashCode(this.cedulaJuridica);
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
        final Patente other = (Patente) obj;
        if (this.idPatente != other.idPatente) {
            return false;
        }
        if (!Objects.equals(this.ubicacion, other.ubicacion)) {
            return false;
        }
        if (!Objects.equals(this.cedulaJuridica, other.cedulaJuridica)) {
            return false;
        }
        return Objects.equals(this.patentado, other.patentado);
    }
    
    

    
    
    
    
}
