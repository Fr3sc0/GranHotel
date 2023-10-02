
package Entidades;


public class TipoHabitacion {
    private String codigo;
    private int cantPersonas;
    private int cantCamas;
    private String tipoCama;
    private double precioNoche;
    private boolean estado;

    public TipoHabitacion(String codigo, int cantPersonas, int cantCamas, String tipoCama, double precioNoche, boolean estado) {
        this.codigo = codigo;
        this.cantPersonas = cantPersonas;
        this.cantCamas = cantCamas;
        this.tipoCama = tipoCama;
        this.precioNoche = precioNoche;
        this.estado = estado;
    }

    public TipoHabitacion() {
    }

    public TipoHabitacion(int cantPersonas, int cantCamas, String tipoCama, double precioNoche, boolean estado) {
        this.cantPersonas = cantPersonas;
        this.cantCamas = cantCamas;
        this.tipoCama = tipoCama;
        this.precioNoche = precioNoche;
        this.estado = estado;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public int getCantPersonas() {
        return cantPersonas;
    }

    public void setCantPersonas(int cantPersonas) {
        this.cantPersonas = cantPersonas;
    }

    public int getCantCamas() {
        return cantCamas;
    }

    public void setCantCamas(int cantCamas) {
        this.cantCamas = cantCamas;
    }

    public String getTipoCama() {
        return tipoCama;
    }

    public void setTipoCama(String tipoCama) {
        this.tipoCama = tipoCama;
    }

    public double getPrecioNoche() {
        return precioNoche;
    }

    public void setPrecioNoche(double precioNoche) {
        this.precioNoche = precioNoche;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Codigo:" + codigo + " Cantidad de Personas:" + cantPersonas + " Cantidad de Camas:" + cantCamas + " TipoCama:" + tipoCama + " PrecioxNoche:" + precioNoche + " Estado:" + estado;
    }
    
    
}
