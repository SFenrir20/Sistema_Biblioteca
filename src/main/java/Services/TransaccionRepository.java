/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Services;

import Model.Transaccion;
import Util.Conexion;
import com.mysql.cj.xdevapi.PreparableStatement;
import java.sql.CallableStatement;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;

/**
 *
 * @author santi
 */
public class TransaccionRepository implements ITransaccion {

    @Override
    public int GetCorrelativo() {
        int SgyNum = 0;
        try {
            CallableStatement cs = Conexion.ObtenerConexion().prepareCall("{CALL GetCorrelativoTrans}");
            ResultSet es = cs.executeQuery();
            while(es.next()){
                SgyNum = es.getInt(1)+1;
            }
             System.out.println("El Codigo es: " + SgyNum);
        } catch (Exception e) {
             System.out.println("El error es" + e.getMessage());
        }
        return SgyNum;
    }

    public Transaccion getTransaccionPorNombre(String nom){
        try {
             CallableStatement cs = Conexion.ObtenerConexion().prepareCall("{CALL transaccionPorNombre(?)}");
             cs.setString(1, nom);
             ResultSet rs = cs.executeQuery();
             Transaccion user = new Transaccion();
             while(rs.next()){
                user.setCodigo(rs.getInt("Id_Transaccion"));
                user.setFecha_Devolucion(rs.getString("Fecha_Devolucion"));
                user.setFecha_Reserva(rs.getString("Fecha_Reserva"));
                user.setFecha_Prestamo(rs.getString("Fecha_Prestamo"));
                user.setEstado(rs.getString("Estado"));
                user.setMulta(rs.getDouble("Multa"));
                user.setId_Libro(rs.getInt("Libro_Id_Libro"));
                user.setId_Usuario(rs.getInt("Usuario_Id_Usuario"));
                user.setId_Estados(rs.getInt("Estados_Id_estados"));
                break;
             }
             Conexion.ObtenerConexion().close();
             rs.close();
             return user;
             }
        catch (Exception e) {
             System.out.println("Error Bucar por nombre");
             e.getMessage();
        }
        return null;
    }
    
    
    @Override
    public List<Transaccion> getAllTransaccions() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void addTransaccionReseva(Transaccion transaccion) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void addTransaccionPrestamo(Transaccion transaccion) {
        try {
            PreparedStatement ps = Conexion.ObtenerConexion().prepareCall("{CALL AddTransaccionReserva(?,?,?,?,?,?,?,?,?,?)}");
            ps.setInt(1, transaccion.getCodigo());
          //  System.out.println("Error en add id");
            ps.setString(2,transaccion.getFecha_Devolucion());
          //  System.out.println("Error en add fechaDevolucion");
            ps.setString(3,  transaccion.getFecha_Reserva());
          //  System.out.println("Error en add fechareserva");
            ps.setString(4, transaccion.getFecha_Prestamo());
          //  System.out.println("Error en add fechaprestamo");
            ps.setString(5, transaccion.getEstado());
          //  System.out.println("Error en add estado");
            ps.setDouble(6, transaccion.getMulta());
          //  System.out.println("Error en add multa");
            ps.setInt(7, transaccion.getId_Libro());
          //  System.out.println("Error en add idLibro");
            ps.setInt(8, transaccion.getId_Usuario());
           // System.out.println("Error en add idUsuaro");
            ps.setInt(9, transaccion.getId_Estados());
          //  System.out.println("Error en add estados");        
            ps.setInt(10, transaccion.getNum_Copias_Libro());
           
            ps.executeQuery();
        } catch (Exception e) {
            System.out.println("Error en add prestamo" + e.getMessage());
        }
    }
    
    public Transaccion transaccionPorId(int codigo) {
        try {
            //List<Usuario> lstUsuario = new ArrayList<>();
            CallableStatement cs = Conexion.ObtenerConexion().prepareCall("{CALL datosTransaccion(?)}");
            cs.setInt(1, codigo);
            ResultSet rs = cs.executeQuery();
            Transaccion objUsuario = new Transaccion();
            while(rs.next()){
                objUsuario.setCodigo(rs.getInt("Id_Transaccion"));
                objUsuario.setFecha_Devolucion(rs.getString("Fecha_Devolucion"));
                objUsuario.setFecha_Reserva(rs.getString("Fecha_Reserva"));
                objUsuario.setFecha_Prestamo(rs.getString("Fecha_Prestamo"));
                objUsuario.setEstado(rs.getString("Estado"));
                objUsuario.setMulta(rs.getDouble("Multa"));
                objUsuario.setId_Libro(rs.getInt("Libro_Id_Libro"));
                objUsuario.setId_Usuario(rs.getInt("Usuario_Id_Usuario"));
                objUsuario.setId_Estados(rs.getInt("Estados_Id_estados"));
                
             //   objUsuario.setId_Cat(rs.getInt("Categoria_US_Id_Categoria"));
                
            //    lstUsuario.add(objUsuario);
                System.out.println("paso este dato usuario");
                break;
            }
            Conexion.ObtenerConexion().close();
            rs.close();
           // return lstUsuario;
           return objUsuario;
        } catch (Exception ex) {
            System.out.println("Error Bucar por codigo");
            ex.getMessage();
        }
        return null;
    }
    
        public void updateEstadoTransaccion(Transaccion us) {
        try {
            PreparedStatement ps = Conexion.ObtenerConexion().prepareStatement("{CALL alterarEstadoDeTransaccion(?,?)}");
            ps.setInt(1, us.getCodigo());
             System.out.println("Error 1");
            ps.setString(2, us.getEstado());
             System.out.println("Error 2");
        } catch (Exception e) {
            System.out.println("error al pasar los datos " + e.getMessage());
        }
    }
    

    
    
    @Override
    public void addTransaccionDebolucion(Transaccion transaccion) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
