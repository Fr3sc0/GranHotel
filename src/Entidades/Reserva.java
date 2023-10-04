
package Entidades;

import java.time.LocalDate;


public class Reserva {
   private int huesped;
   private String tipoHabitacion;
   private int cantPersonas;
   private LocalDate fechaEntrada;
   private LocalDate fechaSalida;
   private double importeTotal;
   private boolean estado;

    public Reserva() {
    }

    public Reserva(int huesped, String tipoHabitacion, int cantPersonas, LocalDate fechaEntrada, LocalDate fechaSalida, double importeTotal, boolean estado) {
        this.huesped = huesped;
        this.tipoHabitacion = tipoHabitacion;
        this.cantPersonas = cantPersonas;
        this.fechaEntrada = fechaEntrada;
        this.fechaSalida = fechaSalida;
        this.importeTotal = importeTotal;
        this.estado = estado;
    }

    public int getHuesped() {
        return huesped;
    }

    public void setHuesped(int huesped) {
        this.huesped = huesped;
    }

    public String getTipoHabitacion() {
        return tipoHabitacion;
    }

    public void setTipoHabitacion(String tipoHabitacion) {
        this.tipoHabitacion = tipoHabitacion;
    }

    public int getCantPersonas() {
        return cantPersonas;
    }

    public void setCantPersonas(int cantPersonas) {
        this.cantPersonas = cantPersonas;
    }

    public LocalDate getFechaEntrada() {
        return fechaEntrada;
    }

    public void setFechaEntrada(LocalDate fechaEntrada) {
        this.fechaEntrada = fechaEntrada;
    }

    public LocalDate getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(LocalDate fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    public double getImporteTotal() {
        return importeTotal;
    }

    public void setImporteTotal(double importeTotal) {
        this.importeTotal = importeTotal;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Reserva:" + " Huesped:" + huesped + " TipoHabitacion:" + tipoHabitacion + " CantPersonas=" + cantPersonas + "  FechaEntrada=" + fechaEntrada + " FechaSalida=" + fechaSalida + "  ImporteTotal=" + importeTotal + " Estado=" + estado;
    }
   
   

       
}
