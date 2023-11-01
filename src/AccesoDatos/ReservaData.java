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
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class ReservaData {

    private Connection con = null;
    TipoHabitacionData thd = new TipoHabitacionData();
    HabitacionData hd=new HabitacionData();

    public ReservaData() {

        con = Conexion.getConexion();

    }

    public void crearReserva(Reserva Reser) {
        String sql = "INSERT INTO reserva(huesped, habitacion, tipoHabitacion, cantPersonas, fechaEntrada, fechaSalida, importeTotal, estado)VALUES (?,?,?,?,?,?,?,?)";

        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, Reser.getHuesped());
            ps.setInt(2, Reser.getHabi().getNroHabitacion());
            ps.setString(3, Reser.getHabi().getTipoHabitacion());
            ps.setInt(4, Reser.getCantPersonas());
            ps.setDate(5, Date.valueOf(Reser.getFechaEntrada()));
            ps.setDate(6, Date.valueOf(Reser.getFechaSalida()));
            ps.setDouble(7, calcularMontoEstadia(thd.buscarTH(Reser.getHabi().getTipoHabitacion()), Reser.getFechaEntrada(), Reser.getFechaSalida()));
            ps.setBoolean(8, true);
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
    
    public void modificarReserva(Reserva Reser) {
        String sql = "UPDATE reserva SET habitacion=?, tipoHabitacion=?, cantPersonas=?, fechaEntrada=?, fechaSalida=?, importeTotal=? WHERE huesped = ?";

        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, Reser.getHabi().getNroHabitacion());
            ps.setString(2, Reser.getHabi().getTipoHabitacion());
            ps.setInt(3, Reser.getCantPersonas());
            ps.setDate(4, Date.valueOf(Reser.getFechaEntrada()));
            ps.setDate(5, Date.valueOf(Reser.getFechaSalida()));
            ps.setDouble(6, calcularMontoEstadia(thd.buscarTH(Reser.getHabi().getTipoHabitacion()), Reser.getFechaEntrada(), Reser.getFechaSalida()));
            ps.setInt(7, Reser.getHuesped());
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

    public Reserva buscarReservaHuesped(int huesped) {
        String sql = "SELECT habitacion, cantPersonas, fechaEntrada, fechaSalida, importeTotal FROM reserva WHERE huesped=? AND estado=1";
        Reserva reser = null;
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, huesped);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                reser = new Reserva();
                reser.setHuesped(huesped);
                reser.setHabi(hd.buscarHabitacion(rs.getInt("habitacion")));
                reser.setCantPersonas(rs.getInt("cantPersonas"));
                reser.setFechaEntrada(rs.getDate("fechaEntrada").toLocalDate());
                reser.setFechaSalida(rs.getDate("fechaSalida").toLocalDate());
                reser.setImporteTotal(rs.getDouble("importeTotal"));
                reser.setEstado(true);

            } else {
                JOptionPane.showMessageDialog(null, "Reserva no encontrada.");
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla reserva.");
        }
        return reser;
    }

    public Reserva busquedaReservasFecha(LocalDate fechaEntrada) {
        String sql = "SELECT huesped, habitacion, cantPersonas, fechaSalida, importeTotal FROM reserva WHERE fechaEntrada=? AND estado=1";
        Reserva reser = null;
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setDate(1, Date.valueOf(fechaEntrada));
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                reser = new Reserva();
                reser.setFechaEntrada((fechaEntrada));
                reser.setHabi(hd.buscarHabitacion(rs.getInt("habitacion")));
                reser.setCantPersonas(rs.getInt("cantPersonas"));
                reser.setFechaSalida(rs.getDate("fechaSalida").toLocalDate());
                reser.setImporteTotal(rs.getDouble("importeTotal"));
                reser.setEstado(true);

            } else {
                JOptionPane.showMessageDialog(null, "Reserva no encontrada.");
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla reserva.");
        }
        return reser;
    }

    public void cancelarReserva(int huesped) {
        String sql = "UPDATE reserva SET estado = 0 WHERE huesped = ?";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, huesped);
            int exito = ps.executeUpdate();
            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Se ha cancelado la reserva.");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla reserva.");
        }
    }

    public double calcularMontoEstadia(TipoHabitacion th, LocalDate fe, LocalDate fs) {
        long dias = ChronoUnit.DAYS.between(fe, fs);
        double monto = th.getPrecioNoche();
        return (monto * dias);
    }

    public void finReserva(int huesped,LocalDate fechaEntrada,int nroHabitacion) {
        String sql = "UPDATE reserva set estado = 0 WHERE huesped = ? AND fechaEntrada=?";
        String sql2= "UPDATE habitacion SET estado = 0 WHERE nroHabitacion = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, huesped);
            ps.setDate(2, Date.valueOf(fechaEntrada));
            int exito = ps.executeUpdate();
            
            ps = con.prepareStatement(sql2);
            ps.setInt(1, nroHabitacion);
            ps.executeUpdate();
            exito += ps.executeUpdate();
            if (exito >0) {
                JOptionPane.showMessageDialog(null, "Se ha cancelado la reserva.");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla reserva.");
        }
    }

    public List<Reserva> listarRes() {
        List<Reserva> reservas = new ArrayList<>();
        String sql = "SELECT * FROM reserva WHERE estado=1";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Reserva reser = new Reserva();
                reser.setHuesped(rs.getInt("huesped"));
                reser.setHabi(hd.buscarHabitacion(rs.getInt("habitacion")));
                reser.setCantPersonas(rs.getInt("cantPersonas"));
                reser.setFechaEntrada(rs.getDate("fechaEntrada").toLocalDate());
                reser.setFechaSalida(rs.getDate("fechaSalida").toLocalDate());
                reser.setImporteTotal(rs.getDouble("importeTotal"));
                reservas.add(reser);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla reserva.");
        }
        return reservas;
    }
    public Reserva busquedaReservasDyF(int huesped,LocalDate fechaEntrada) {
        String sql = "SELECT habitacion, cantPersonas, fechaSalida, importeTotal FROM reserva WHERE huesped=? and fechaEntrada=? AND estado=1";
        Reserva reser = null;
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, huesped);
            ps.setDate(2, Date.valueOf(fechaEntrada));
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                reser = new Reserva();
                reser.setHuesped(huesped);
                reser.setFechaEntrada((fechaEntrada));
                reser.setHabi(hd.buscarHabitacion(rs.getInt("habitacion")));
                reser.setCantPersonas(rs.getInt("cantPersonas"));
                reser.setFechaEntrada(fechaEntrada);
                reser.setFechaSalida(rs.getDate("fechaSalida").toLocalDate());
                reser.setImporteTotal(rs.getDouble("importeTotal"));
                reser.setEstado(true);

            } else {
                JOptionPane.showMessageDialog(null, "Reserva no encontrada.");
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla reserva.");
        }
        return reser;
    }
}
