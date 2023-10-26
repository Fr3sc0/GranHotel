
package AccesoDatos;

import Entidades.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class TipoHabitacionData {
           

    private Connection con = null;

    public TipoHabitacionData() {
        con = Conexion.getConexion();
    } 
    
public void agregarTipoHabitacion(TipoHabitacion th){ 
        String sql = "INSERT INTO tipohabitacion(codigo, cantPersonas, cantCamas, tipoCama ,precioNoche) VALUES (?,?,?,?,?)";
        try {
            PreparedStatement ps= con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, th.getCodigo());
            ps.setInt(2, th.getCantPersonas());
            ps.setInt(3, th.getCantCamas());
            ps.setString(4, th.getTipoCama());
            ps.setDouble(5,th.getPrecioNoche());
            int exito=ps.executeUpdate();
            
            if (exito==1) {
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

public void borrarTipoHabitacion (String codigo){
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
public TipoHabitacion buscarTH(String codigo){
        String sql="SELECT cantPersonas, cantCamas, tipoCama, precioNoche FROM tipoHabitacion WHERE codigo = ?";
        TipoHabitacion th=null;
        try{
            PreparedStatement ps= con.prepareStatement(sql);
            ps.setString(1, codigo);
            ResultSet rs=ps.executeQuery();
            if(rs.next()){
                th=new TipoHabitacion();
                th.setCodigo(codigo);
                th.setCantPersonas(rs.getInt("cantPersonas"));
                th.setCantCamas(rs.getInt("cantCamas"));
                th.setTipoCama(rs.getString("tipoCama"));
                th.setPrecioNoche(rs.getDouble("precioNoche"));
            }else{
                JOptionPane.showMessageDialog(null, "El tipo de habitacion no ha sido encontrada.");
            }
            ps.close();
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla tipo habitacion.");
        }
        return th;
    }
public List<TipoHabitacion> listarTipoHabitacion(){
        String sql="SELECT * FROM tipoHabitacion";
        ArrayList<TipoHabitacion> tipoHabitacion=new ArrayList<>();
        
        try{
            PreparedStatement ps=con.prepareStatement(sql);
            ResultSet rs=ps.executeQuery();
            while(rs.next()){
                TipoHabitacion th=new TipoHabitacion();
                th.setCodigo(rs.getString("codigo"));
                th.setCantPersonas(rs.getInt("cantPersonas"));
                th.setCantCamas(rs.getInt("cantCamas"));
                th.setTipoCama(rs.getString("tipoCama"));
                th.setPrecioNoche(rs.getDouble("precioNoche"));
                tipoHabitacion.add(th);
            }
          ps.close();                   
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla habitacion.");
        }
        return tipoHabitacion;
    }

}
