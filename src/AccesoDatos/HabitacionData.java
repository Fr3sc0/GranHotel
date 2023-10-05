
package AccesoDatos;

import Entidades.Habitacion;
import Entidades.Huesped;
import Entidades.TipoHabitacion;
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

public void agregarHabitacion(Habitacion h){ 
        String sql = "INSERT INTO habitacion(nroHabitacion,tipoHabitacion,estado) VALUES (?,?,?)";
        try {
            PreparedStatement ps= con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, h.getNroHabitacion());
            ps.setString(2, h.getTipoHabitacion());
            ps.setBoolean(3, h.isEstado());
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                
                JOptionPane.showMessageDialog(null, "Se a agregado una habitacion");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla de habitacion.");
        }        
    }

public void modificarH(Habitacion h){
        String sql= "UPDATE habitacion SET tipoHabitacion  = ? WHERE nroHabitacion =? AND estado = 0 ";
        
        try {
            PreparedStatement ps= con.prepareStatement(sql);
            
            ps.setString(1,h.getTipoHabitacion());
            
            int filas = ps.executeUpdate();
            if (filas>0) {
               JOptionPane.showMessageDialog(null, "Se ha modificado la habitacion correctamente.");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla de habitacion.");
        }
    }

public void borrarInscripcion (int nroHabitacion){
        String sql = "DELETE FROM habitacion WHERE nroHabitacion = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1,nroHabitacion);            
            int filas= ps.executeUpdate();
            if (filas>0) {
            JOptionPane.showMessageDialog(null, "Se ha eliminado correctamente.");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla habitacion.");
        }
        
        
    }

public List<Habitacion> listarHabitacion(){
        String sql="SELECT nroHabitacion,tipoHabitacion,estado FROM habitacion";
        ArrayList<Habitacion> habitacion=new ArrayList<>();
        
        try{
            PreparedStatement ps=con.prepareStatement(sql);
            ResultSet rs=ps.executeQuery();
            while(rs.next()){
                Habitacion h=new Habitacion();
                h.setNroHabitacion(rs.getInt("nroHabitacion"));
                h.setTipoHabitacion(rs.getString("tipoHabitacion"));
                h.setEstado(rs.getBoolean("estado"));
                habitacion.add(h);
            }
          ps.close();                   
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla habitacion.");
        }
        return habitacion;
    }

}

   



