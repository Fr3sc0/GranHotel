
package Entidades;

import java.time.LocalDate;


public class Reserva {
   private Huesped huesped;
   private TipoHabitacion tipoHabitacion;
   private int cantPersonas;
   private LocalDate fechaEntrada;
   private LocalDate fechaSalida;
   private double importeTotal;

    public Reserva(Huesped huesped, TipoHabitacion tipoHabitacion, int cantPersonas, LocalDate fechaEntrada, LocalDate fechaSalida, double importeTotal) {
        this.huesped = huesped;
        this.tipoHabitacion = tipoHabitacion;
        this.cantPersonas = cantPersonas;
        this.fechaEntrada = fechaEntrada;
        this.fechaSalida = fechaSalida;
        this.importeTotal = importeTotal;
    }

    public Reserva() {
    }

    public Huesped getHuesped() {
        return huesped;
    }

    public void setHuesped(Huesped huesped) {
        this.huesped = huesped;
    }

    public TipoHabitacion getTipoHabitacion() {
        return tipoHabitacion;
    }

    public void setTipoHabitacion(TipoHabitacion tipoHabitacion) {
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

    @Override
    public String toString() {
        return "Huesped:" + huesped + " Tipo de Habitacion:" + tipoHabitacion + " Cantidad de Personas:" + cantPersonas + " Fecha de Entrada:" + fechaEntrada + " Fecha de Salida:" + fechaSalida + " Importe Total=" + importeTotal;
    }
   
   
}
