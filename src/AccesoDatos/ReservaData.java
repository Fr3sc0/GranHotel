
package AccesoDatos;

import Entidades.*;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import javax.swing.JOptionPane;


public class ReservaData {
    
     private Connection con = null;
     
     public ReservaData(){
         
         con = Conexion.getConexion();
         
     }
     public void crearReserva (Reserva Reser){
         String sql = "INSERT INTO reserva(huesped, tipoHabitacion, cantPersonas, fechaEntrada, fechaSalida, importeTotal, estado)VALUES (?,?,?,?,?,?,?)";
         TipoHabitacionData thd=new TipoHabitacionData();

         try {
             PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
             ps.setInt(1, Reser.getHuesped());
             ps.setString(2, Reser.getTipoHabitacion());
             ps.setInt(3, Reser.getCantPersonas());
             ps.setDate(4, Date.valueOf(Reser.getFechaEntrada()));
             ps.setDate(5, Date.valueOf(Reser.getFechaSalida()));
             ps.setDouble(6, calcularMontoEstadia(thd.buscarTH(Reser.getTipoHabitacion()), Reser.getFechaEntrada(), Reser.getFechaSalida()));
             ps.setBoolean(7, true);
             ps.executeUpdate();
             ResultSet rs = ps.getGeneratedKeys();
             
             if (rs.next()) {
                JOptionPane.showMessageDialog(null, "Reserva agregada correctamente.");
            }
            ps.close();
            
         } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Reserva.");
         }
         
     }     
     
     public Reserva buscarReservaHuesped (int huesped){
         String sql="SELECT tipoHabitacion, cantPersonas, fechaEntrada, fechaSalida, importeTotal FROM reserva WHERE huesped=? AND estado=1";
         Reserva reser=null;
         try {
             PreparedStatement ps= con.prepareStatement(sql);
             ps.setInt(1, huesped);
             ResultSet rs=ps.executeQuery();
             if(rs.next()){
                 reser = new Reserva();
                 reser.setHuesped(huesped);
                 reser.setTipoHabitacion(rs.getString("tipoHabitacion"));
                 reser.setCantPersonas(rs.getInt("cantPersonas"));
                 reser.setFechaEntrada(rs.getDate("fechaEntrada").toLocalDate());
                 reser.setFechaSalida(rs.getDate("fechaSalida").toLocalDate());
                 reser.setImporteTotal(rs.getDouble("importeTotal"));
                 reser.setEstado(true);
                
             }else{
                JOptionPane.showMessageDialog(null, "Reserva no encontrada.");
            }
            ps.close(); 
             
         } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null, "Error al acceder a la tabla reserva.");
         }
         return reser;
     }
     
     public Reserva busquedaReservasFecha (LocalDate fechaEntrada){
         String sql="SELECT huesped, tipoHabitacion, cantPersonas, fechaSalida, importeTotal FROM reserva WHERE fechaEntrada=? AND estado=1";
         Reserva reser=null;
         try {
             PreparedStatement ps= con.prepareStatement(sql);
             ps.setDate(1, Date.valueOf(fechaEntrada));
             ResultSet rs=ps.executeQuery();
             if(rs.next()){
                 reser = new Reserva();
                 reser.setFechaEntrada((fechaEntrada));
                 reser.setTipoHabitacion(rs.getString("tipoHabitacion"));
                 reser.setCantPersonas(rs.getInt("cantPersonas"));
                 reser.setFechaEntrada(rs.getDate("fechaEntrada").toLocalDate());
                 reser.setFechaSalida(rs.getDate("fechaSalida").toLocalDate());
                 reser.setImporteTotal(rs.getDouble("importeTotal"));
                 reser.setEstado(true);
                
             }else{
                JOptionPane.showMessageDialog(null, "Reserva no encontrada.");
            }
            ps.close(); 
             
         } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null, "Error al acceder a la tabla reserva.");
         }
         return reser;
     }
     
     public void cancelarReserva (int huesped){
         String sql="UPDATE reserva SET estado = 0 WHERE huesped = ?";
         
         try {
             PreparedStatement ps=con.prepareStatement(sql);
             ps.setInt(1, huesped);
             int exito = ps.executeUpdate();
            if(exito==1){
             JOptionPane.showMessageDialog(null, "Se ha cancelado la reserva.");
            }
            ps.close();
         } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null, "Error al acceder a la tabla reserva.");
         }
     }
     

     
     public double calcularMontoEstadia (TipoHabitacion th, LocalDate fe,LocalDate fs){
         long dias= ChronoUnit.DAYS.between(fe, fs);
         double monto=th.getPrecioNoche();
         return monto*dias;
     }
     
     public void finReserva (int huesped){
        String sql= "UPDATE reserva AND habitacion set estado = 0 WHERE huesped = ?";
        try {
             PreparedStatement ps=con.prepareStatement(sql);
             ps.setInt(1, huesped);
             int exito = ps.executeUpdate();
            if(exito==1){
             JOptionPane.showMessageDialog(null, "Se ha cancelado la reserva.");
            }
            ps.close();
         } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null, "Error al acceder a la tabla reserva.");
         }
        
         
     }
     
    
}
