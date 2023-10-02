
package Entidades;


public class Huesped {
    
    private int dni;
    private String nombre;
    private String domicilio;
    private String correo;
    private int celular;

    public Huesped() {
    }

    public Huesped(int dni, String nombre, String domicilio, String correo, int celular) {
        this.dni = dni;
        this.nombre = nombre;
        this.domicilio = domicilio;
        this.correo = correo;
        this.celular = celular;
    }

    public Huesped(String nombre, String domicilio, String correo, int celular) {
        this.nombre = nombre;
        this.domicilio = domicilio;
        this.correo = correo;
        this.celular = celular;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public int getCelular() {
        return celular;
    }

    public void setCelular(int celular) {
        this.celular = celular;
    }

    @Override
    public String toString() {
        return "dni:" + dni + " Nombre:" + nombre + " Domicilio:" + domicilio + " Correo:" + correo + " Celular:" + celular;
    }
    
    
}
