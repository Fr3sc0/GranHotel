
package Entidades;


public class Habitacion {
    private int nroHabitacion;
    private String tipoHabitacion;
    private boolean estado;

    public Habitacion() {
    }

    public Habitacion(int nroHabitacion, String tipoHabitacion) {
        this.nroHabitacion = nroHabitacion;
        this.tipoHabitacion = tipoHabitacion;
    }

    public Habitacion(int nroHabitacion, String tipoHabitacion, boolean estado) {
        this.nroHabitacion = nroHabitacion;
        this.tipoHabitacion = tipoHabitacion;
        this.estado = estado;
    }

    public int getNroHabitacion() {
        return nroHabitacion;
    }

    public void setNroHabitacion(int nroHabitacion) {
        this.nroHabitacion = nroHabitacion;
    }

    public String getTipoHabitacion() {
        return tipoHabitacion;
    }

    public void setTipoHabitacion(String tipoHabitacion) {
        this.tipoHabitacion = tipoHabitacion;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return nroHabitacion + "-" + tipoHabitacion ;
    }
    
    
}
