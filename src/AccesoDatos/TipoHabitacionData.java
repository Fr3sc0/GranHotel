
package AccesoDatos;

import Entidades.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class TipoHabitacionData {
           

    private Connection con = null;

    public TipoHabitacionData() {
        con = Conexion.getConexion();
    } 
    
public void agregarTipoabitacion(TipoHabitacion th){ 
        String sql = "INSERT INTO tipohabitacion(codigo, cantPersonas, cantCamas, tipoCama ,precioNoche) VALUES (?,?,?,?,?)";
        try {
            PreparedStatement ps= con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, th.getCodigo());
            ps.setInt(2, th.getCantPersonas());
            ps.setInt(3, th.getCantCamas());
            ps.setString(4, th.getTipoCama());
            ps.setDouble(5,th.getPrecioNoche());
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                
                JOptionPane.showMessageDialog(null, "Se a agregado un tipo habitacion");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla tipo de habitacion.");
        }        
    }

public void modificarTh(TipoHabitacion th){
        String sql= "UPDATE tipohabitacion SET cantPersonas = ?,cantCamas = ?,tipoCama = ?,precioNoche =?  WHERE código =?";
        
        try {
            PreparedStatement ps= con.prepareStatement(sql);
            ps.setInt(1, th.getCantPersonas());
            ps.setInt(2, th.getCantCamas());
            ps.setString(3, th.getTipoCama());
            ps.setDouble(4,th.getPrecioNoche());
            int filas = ps.executeUpdate();
            if (filas>0) {
               JOptionPane.showMessageDialog(null, "Se ha modificado el tipo de habitacion correctamente.");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla tipo de habitacion.");
        }
    }

public void borrarInscripcion (String codigo){
        String sql = "DELETE FROM tipohabitacion WHERE codigo = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, codigo);            
            int filas= ps.executeUpdate();
            if (filas>0) {
            JOptionPane.showMessageDialog(null, "Se ha eliminado correctamente.");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Tipo habitacion.");
        }
        
        
    }

}



