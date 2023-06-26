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

    @Override
    public void addTransaccionDebolucion(Transaccion transaccion) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
