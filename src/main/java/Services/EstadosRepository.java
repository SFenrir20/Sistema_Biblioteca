/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Services;

import Model.Estados;
import Util.Conexion;
import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author santi
 */
public class EstadosRepository implements IEstados {

    @Override
    public List<Estados> GetAll() {
        try {
            List<Estados> lstEs = new ArrayList<>();
            CallableStatement cs = Conexion.ObtenerConexion().prepareCall("{CALL ListarEstados}");
            ResultSet rs = cs.executeQuery();
            while(rs.next()){
                Estados objEst = new Estados();
                objEst.setId_Estados(rs.getInt("Id_estados"));
                objEst.setNombre_estados(rs.getString("Nombre"));
                
                lstEs.add(objEst);
            }
            Conexion.ObtenerConexion().close();
            rs.close();
            return lstEs;
        } catch (Exception e) {
            System.out.println("Error al listar" + e.getMessage());
        }
        return null;
    }
    
    @Override
    public List<Estados> getAllEstados() {
        try {
             List<Estados> lstGen = new ArrayList<>();
             CallableStatement cs = Conexion.ObtenerConexion().prepareCall("{CALL ListarEstados}");
             ResultSet rs = cs.executeQuery();
             while(rs.next()){
                 Estados obj = new Estados();
                 obj.setId_Estados(rs.getInt("Id_estados"));
                 obj.setNombre_estados(rs.getString("Nombre_estados"));
                 obj.setDes_estados(rs.getString("Des_estados"));
                 
                 lstGen.add(obj);
                 System.out.println("paso los datos");
             }
             Conexion.ObtenerConexion().close();
             rs.close();
             return lstGen;
        } catch (Exception e) {
            System.out.println("error al pasar los datos"+ e.getMessage());
        }
        return null;
    }

    @Override
    public void addEstados(Estados gen) {
        try {
            PreparedStatement ps = Conexion.ObtenerConexion().prepareCall("{CALL IngresarEstado(?,?,?)}");
            ps.setInt(1, gen.getId_Estados());
            ps.setString(2, gen.getNombre_estados());
            ps.setString(3, gen.getDes_estados());
          
            ps.executeQuery();
        } catch (Exception e) {
            System.out.println("Error en addEstado");
        }
    }
    
    @Override
    public void removeEstados(Estados gen) {
        try {
            PreparedStatement ps = Conexion.ObtenerConexion().prepareCall("{CALL EliminarEstado(?)}");
            ps.setInt(1, gen.getId_Estados());
            ps.execute();
        } catch (Exception e) {
            System.out.println("Error remove Estado");
        }
    }

    @Override
    public void updateEstados(Estados gen) {
         try {
            PreparedStatement ps = Conexion.ObtenerConexion().prepareStatement("{CALL UpdateEstados(?,?,?)}");
            ps.setInt(1, gen.getId_Estados());
            ps.setString(2, gen.getNombre_estados());
            ps.setString(3, gen.getDes_estados());
           
            ps.executeUpdate();
        } catch (Exception e) {
            System.out.println("error al pasar los datos " + e.getMessage());
        }
    }

    @Override
    public List<Estados> BuscarEstadoXCodigo(int codigo) {
        try {
            List<Estados> lst = new ArrayList<>();
            CallableStatement cs = Conexion.ObtenerConexion().prepareCall("{CALL BuscarEstado(?)}");
            cs.setInt(1, codigo);
            ResultSet rs = cs.executeQuery();
            while(rs.next()){
                Estados obj = new Estados();
                obj.setId_Estados(rs.getInt("Id_estados"));
                obj.setNombre_estados(rs.getString("Nombre_estados"));
                obj.setDes_estados(rs.getString("Des_estados"));
                
                lst.add(obj);
                System.out.println("Paso dato");
                break;
            }
            Conexion.ObtenerConexion().close();
            rs.close();
            return lst;
        } catch (Exception e) {
             System.out.println("Error Bucar por codigo Estados");
             e.getMessage();
        }
        return null;
    }

    @Override
    public int NewEstados() {
         int SgtNum = 0;
        try {
            CallableStatement cs = Conexion.ObtenerConexion().prepareCall("{CALL GetCorrelativoEstados}");
            ResultSet rs = cs.executeQuery();
            while(rs.next()){
                SgtNum = rs.getInt(1) + 1 ;
            }
            System.out.println("El número es: " + SgtNum);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        return SgtNum;
    }
}
