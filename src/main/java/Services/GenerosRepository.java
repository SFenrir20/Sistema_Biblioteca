/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Services;

import Model.Categorias_US;
import Model.Generos;
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
public class GenerosRepository implements IGeneros{

    @Override
    public List<Generos> GetAll() {
         try {
            List<Generos> lst = new ArrayList<>();
            CallableStatement cs = Conexion.ObtenerConexion().prepareCall("{CALL ListarGen}");
            ResultSet rs = cs.executeQuery();
            while(rs.next()){
                Generos objGen = new Generos();
                objGen.setId_Genero(rs.getInt("Id_Generos"));
                objGen.setNombre_gen(rs.getString("Generos"));
                
                lst.add(objGen);
            }
            Conexion.ObtenerConexion().close();
            rs.close();
            return lst;
        } catch (Exception e) {
            System.out.println("Error al listar" + e.getMessage());
        }
        return null;
    }

    @Override
    public List<Generos> getAllGeneros() {
        try {
             List<Generos> lstGen = new ArrayList<>();
             CallableStatement cs = Conexion.ObtenerConexion().prepareCall("{CALL ListarGeneros}");
             ResultSet rs = cs.executeQuery();
             while(rs.next()){
                 Generos obj = new Generos();
                 obj.setId_Genero(rs.getInt("Id_Generos"));
                 obj.setNombre_gen(rs.getString("Nombre_Gen"));
                 obj.setDes_gen(rs.getString("Des_Gen"));
                 
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
    public void addGeneros(Generos gen) {
        try {
            PreparedStatement ps = Conexion.ObtenerConexion().prepareCall("{CALL IngresarGeneros(?,?,?)}");
            ps.setInt(1, gen.getId_Genero());
            ps.setString(2, gen.getNombre_gen());
            ps.setString(3, gen.getDes_gen());
          
            ps.executeQuery();
        } catch (Exception e) {
            System.out.println("Error en addGen");
        }
    }

    @Override
    public void removeGeneros(Generos gen) {
        try {
            PreparedStatement ps = Conexion.ObtenerConexion().prepareCall("{CALL EliminarGeneros(?)}");
            ps.setInt(1, gen.getId_Genero());
            ps.execute();
        } catch (Exception e) {
            System.out.println("Error remove Gen");
        }
    }

    @Override
    public void updateGeneros(Generos gen) {
         try {
            PreparedStatement ps = Conexion.ObtenerConexion().prepareStatement("{CALL UpdateGeneros(?,?,?)}");
            ps.setInt(1, gen.getId_Genero());
            ps.setString(2, gen.getNombre_gen());
            ps.setString(3, gen.getDes_gen());
           
            ps.executeUpdate();
        } catch (Exception e) {
            System.out.println("error al pasar los datos " + e.getMessage());
        }
    }

    @Override
    public List<Generos> BuscarLibroXCodigo(int codigo) {
        try {
            List<Generos> lst = new ArrayList<>();
            CallableStatement cs = Conexion.ObtenerConexion().prepareCall("{CALL BuscarGeneros(?)}");
            cs.setInt(1, codigo);
            ResultSet rs = cs.executeQuery();
            while(rs.next()){
                Generos obj = new Generos();
                obj.setId_Genero(rs.getInt("Id_Generos"));
                obj.setNombre_gen(rs.getString("Nombre_Gen"));
                obj.setDes_gen(rs.getString("Des_Gen"));
                
                lst.add(obj);
                System.out.println("Paso dato");
                break;
            }
            Conexion.ObtenerConexion().close();
            rs.close();
            return lst;
        } catch (Exception e) {
             System.out.println("Error Bucar por codigo");
             e.getMessage();
        }
        return null;
    }

    @Override
    public int NewGenero() {
         int SgtNum = 0;
        try {
            CallableStatement cs = Conexion.ObtenerConexion().prepareCall("{CALL GetCorrelativoGen}");
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
