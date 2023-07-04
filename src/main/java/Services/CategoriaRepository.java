/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Services;

import Model.Categorias_US;
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
public class CategoriaRepository implements ICategoria{

    @Override
    public List<Categorias_US> GetAll() {
        try {
            List<Categorias_US> lstCat = new ArrayList<>();
            CallableStatement cs = Conexion.ObtenerConexion().prepareCall("{CALL ListarCat}");
            ResultSet rs = cs.executeQuery();
            while(rs.next()){
                Categorias_US objCat = new Categorias_US();
                objCat.setId_Categoria(rs.getInt("Id_Categoria"));
                objCat.setNombre_Categoria(rs.getString("Nombres"));
                
                lstCat.add(objCat);
            }
            Conexion.ObtenerConexion().close();
            rs.close();
            return lstCat;
        } catch (Exception e) {
            System.out.println("Error al listar" + e.getMessage());
        }
        return null;
    }
    
    @Override
    public List<Categorias_US> getAllCategoria() {
        try {
             List<Categorias_US> lstGen = new ArrayList<>();
             CallableStatement cs = Conexion.ObtenerConexion().prepareCall("{CALL ListarGeneros}");
             ResultSet rs = cs.executeQuery();
             while(rs.next()){
                 Categorias_US obj = new Categorias_US();
                 obj.setId_Categoria(rs.getInt("Id_Categoria"));
                 obj.setNombre_Categoria(rs.getString("Nombre_Categoria"));
                 obj.setDes_Categoria(rs.getString("Des_Categoria"));
                 
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
    public void addCategoria(Categorias_US gen) {
        try {
            PreparedStatement ps = Conexion.ObtenerConexion().prepareCall("{CALL IngresarCategoria(?,?,?)}");
            ps.setInt(1, gen.getId_Categoria());
            ps.setString(2, gen.getNombre_Categoria());
            ps.setString(3, gen.getDes_Categoria());
          
            ps.executeQuery();
        } catch (Exception e) {
            System.out.println("Error en addGen");
        }
    }
    @Override
    public void removeCategoria(Categorias_US gen) {
        try {
            PreparedStatement ps = Conexion.ObtenerConexion().prepareCall("{CALL EliminarCategoria(?)}");
            ps.setInt(1, gen.getId_Categoria());
            ps.execute();
        } catch (Exception e) {
            System.out.println("Error remove Gen");
        }
    }

    @Override
    public void updateCategoria(Categorias_US gen) {
         try {
            PreparedStatement ps = Conexion.ObtenerConexion().prepareStatement("{CALL UpdateCategoria(?,?,?)}");
            ps.setInt(1, gen.getId_Categoria());
            ps.setString(2, gen.getNombre_Categoria());
            ps.setString(3, gen.getDes_Categoria());
           
            ps.executeUpdate();
        } catch (Exception e) {
            System.out.println("error al pasar los datos " + e.getMessage());
        }
    }

    @Override
    public List<Categorias_US> BuscarCatXCodigo(int codigo) {
        try {
            List<Categorias_US> lst = new ArrayList<>();
            CallableStatement cs = Conexion.ObtenerConexion().prepareCall("{CALL BuscarCategoria(?)}");
            cs.setInt(1, codigo);
            ResultSet rs = cs.executeQuery();
            while(rs.next()){
                Categorias_US obj = new Categorias_US();
                obj.setId_Categoria(rs.getInt("Id_Categoria"));
                obj.setNombre_Categoria(rs.getString("Nombre_Categoria"));
                obj.setDes_Categoria(rs.getString("Des_Categoria"));
                
                lst.add(obj);
                System.out.println("Paso dato");
                break;
            }
            Conexion.ObtenerConexion().close();
            rs.close();
            return lst;
        } catch (Exception e) {
             System.out.println("Error Bucar por codigo Categoria");
             e.getMessage();
        }
        return null;
    }

   
    public int NewCategoria() {
         int SgtNum = 0;
        try {
            CallableStatement cs = Conexion.ObtenerConexion().prepareCall("{CALL GetCorrelativoCategoria}");
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
