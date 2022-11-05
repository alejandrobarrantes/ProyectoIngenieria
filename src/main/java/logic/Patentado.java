
package logic;

/**
 *
 * @author WendyLA
 */
public class Patentado {
    int idPatentado;
    Usuario usuario;
    String nombre;
    String apellido;
    String cedula;

    public Patentado(int idPatentado, Usuario usuario, String nombre, String apellido, String cedula) {
        this.idPatentado = idPatentado;
        this.usuario = usuario;
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
    }

    public Patentado() {
    }

    public int getIdPatentado() {
        return idPatentado;
    }

    public void setIdPatentado(int idPatentado) {
        this.idPatentado = idPatentado;
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

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    @Override
    public String toString() {
        return "Patentado{" + "idPatentado=" + idPatentado + ", usuario=" + usuario + ", nombre=" + nombre + ", apellido=" + apellido + ", cedula=" + cedula + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 83 * hash + this.idPatentado;
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
        final Patentado other = (Patentado) obj;
        return this.idPatentado == other.idPatentado;
    }
    
    
    
    
}
