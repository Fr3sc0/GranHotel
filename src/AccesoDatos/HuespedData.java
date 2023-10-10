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

public class HuespedData {

    private Connection con = null;

    public HuespedData() {
        con = Conexion.getConexion();
    }

    public void agregarHuesped(Huesped huesped) {
        String sql = "INSERT INTO huesped(dni, nombre, domicilio, correo, celular)"
                + "VALUE(?, ?, ?, ?, ?)";

        try {

            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, huesped.getDni());
            ps.setString(2, huesped.getNombre());
            ps.setString(3, huesped.getDomicilio());
            ps.setString(4, huesped.getCorreo());
            ps.setInt(5, huesped.getCelular());
            int exito= ps.executeUpdate();
            
            if (exito==1) {
                JOptionPane.showMessageDialog(null, "Huesped agregado correctamente.");
            }
            ps.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Huesped.");
        }

    }

    public void modificarHuesped(Huesped hues) {
        String sql = "UPDATE huesped SET nombre=?, domicilio=?, correo=?, celular=? WHERE dni = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, hues.getNombre());
            ps.setString(2, hues.getDomicilio());
            ps.setString(3, hues.getCorreo());
            ps.setInt(4, hues.getCelular());
            ps.setInt(5, hues.getDni());
            int exito = ps.executeUpdate();
            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Exito al modificar al huespued.");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Huesped");
        }
    }
    
    public void eliminarHuesped(int dni){
        String sql="DELETE FROM huesped WHERE dni=?";
        try{
            PreparedStatement ps=con.prepareStatement(sql);
            ps.setInt(1, dni);
            int exito = ps.executeUpdate();
            if(exito==1){
             JOptionPane.showMessageDialog(null, "Se ha eliminado al huesped.");
            }
            ps.close();
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla huesped.");
        }
    }
    
    public Huesped buscarHuesped(int dni){
        String sql="SELECT nombre, domicilio, correo, celular FROM huesped WHERE dni = ?";
        Huesped hues=null;
        try{
            PreparedStatement ps= con.prepareStatement(sql);
            ps.setInt(1, dni);
            ResultSet rs=ps.executeQuery();
            if(rs.next()){
                hues=new Huesped();
                hues.setDni(dni);
                hues.setNombre(rs.getString("nombre"));
                hues.setDomicilio(rs.getString("domicilio"));
                hues.setCorreo(rs.getString("correo"));
                hues.setCelular(rs.getInt("celular"));
            }else{
                JOptionPane.showMessageDialog(null, "Huesped no encontrado.");
            }
            ps.close();
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla huesped.");
        }
        return hues;
    }
    
    public List<Huesped> listarHuesped(){
        String sql="SELECT dni,nombre,domicilio,correo,celular FROM huesped";
        ArrayList<Huesped> huespedes=new ArrayList<>();
        
        try{
            PreparedStatement ps=con.prepareStatement(sql);
            ResultSet rs=ps.executeQuery();
            while(rs.next()){
                Huesped hue=new Huesped();
                hue.setDni(rs.getInt("dni"));
                hue.setNombre(rs.getString("nombre"));
                hue.setDomicilio(rs.getString("domicilio"));
                hue.setCorreo(rs.getString("correo"));
                hue.setCelular(rs.getInt("celular"));
                huespedes.add(hue);
            }
          ps.close();                   
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla huesped.");
        }
        return huespedes;
    }
}
