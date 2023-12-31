package AccesoDatos;

import Entidades.Habitacion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class HabitacionData {

    private Connection con = null;

    public HabitacionData() {
        con = Conexion.getConexion();

    }

    public void agregarHabitacion(Habitacion h) {
        String sql = "INSERT INTO habitacion(nroHabitacion,tipoHabitacion,estado) VALUES (?,?,?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, h.getNroHabitacion());
            ps.setString(2, h.getTipoHabitacion());
            ps.setBoolean(3, h.isEstado());
            int exito = ps.executeUpdate();

            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Se a agregado una habitacion");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla de habitacion.");
        }
    }

    public void modificarH(Habitacion h) {
        String sql = "UPDATE habitacion SET tipoHabitacion=?, estado=? WHERE nroHabitacion=? ";

        try {
            PreparedStatement ps = con.prepareStatement(sql);

            ps.setString(1, h.getTipoHabitacion());
            ps.setBoolean(2, h.isEstado());
            ps.setInt(3, h.getNroHabitacion());
            int filas = ps.executeUpdate();
            if (filas > 0) {
                JOptionPane.showMessageDialog(null, "Se ha modificado la habitacion correctamente.");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla de habitacion.");
        }
    }

    public void borrarHabitacion(int nroHabitacion) {
        String sql = "DELETE FROM habitacion WHERE nroHabitacion=?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, nroHabitacion);
            int filas = ps.executeUpdate();
            if (filas > 0) {
                JOptionPane.showMessageDialog(null, "Se ha eliminado correctamente.");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla habitacion.");
        }
    }

    public Habitacion buscarHabitacion(int nroHabitacion) {
        String sql = "SELECT tipoHabitacion,estado FROM habitacion WHERE nroHabitacion=?";
        Habitacion habi = null;
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, nroHabitacion);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                habi = new Habitacion();
                habi.setNroHabitacion(nroHabitacion);
                habi.setTipoHabitacion(rs.getString("tipoHabitacion"));
                habi.setEstado(rs.getBoolean("estado"));
            } else {
                JOptionPane.showMessageDialog(null, "Habitacion no encontrada.");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla habitacion.");
        }
        return habi;
    }

    public List<Habitacion> listarHabitacion() {
        String sql = "SELECT nroHabitacion,tipoHabitacion,estado FROM habitacion";
        ArrayList<Habitacion> habitacion = new ArrayList<>();

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Habitacion h = new Habitacion();
                h.setNroHabitacion(rs.getInt("nroHabitacion"));
                h.setTipoHabitacion(rs.getString("tipoHabitacion"));
                h.setEstado(rs.getBoolean("estado"));
                habitacion.add(h);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla habitacion.");
        }
        return habitacion;
    }

    public void actEst(Habitacion h) {
        String sql = "UPDATE habitacion SET estado=? WHERE nroHabitacion=? ";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setBoolean(1, !h.isEstado());
            ps.setInt(2, h.getNroHabitacion());
            ps.executeUpdate();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla de habitacion.");
        }
    }
}
