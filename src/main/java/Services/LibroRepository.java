/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Services;

import Model.Libro;
import Model.Usuario;
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
public class LibroRepository implements ILibro{

    @Override
    public List<Libro> getAllLibros() {
        try {
             List<Libro> lstLi = new ArrayList<>();
             CallableStatement cs = Conexion.ObtenerConexion().prepareCall("{CALL ListarLibros}");
             ResultSet rs = cs.executeQuery();
             while(rs.next()){
                 Libro obj = new Libro();
                 obj.setCodigo(rs.getInt("Id_Libro"));
                 obj.setTitulo(rs.getString("Titulo"));
                 obj.setAutor(rs.getString("Autor"));
                 obj.setGenero(rs.getString("Genero"));
                 obj.setNumCopias(rs.getInt("Num_Copias"));
                 
                 lstLi.add(obj);
                 System.out.println("paso los datos");
             }
             Conexion.ObtenerConexion().close();
             rs.close();
             return lstLi;
        } catch (Exception e) {
            System.out.println("error al pasar los datos"+ e.getMessage());
        }
        return null;
    }

    @Override
    public void addLibros(Libro li) {
        try {
            PreparedStatement ps = Conexion.ObtenerConexion().prepareCall("{CALL IngresarLibros(?,?,?,?,?,?)}");
            ps.setInt(1, li.getCodigo());
            ps.setString(2, li.getTitulo());
            ps.setString(3, li.getAutor());
            ps.setString(4, li.getGenero());
            ps.setInt(5, li.getNumCopias());
            ps.setInt(6, li.getId_Genero());
            ps.executeQuery();
        } catch (Exception e) {
            System.out.println("Error en addLibros");
        }
    }

    @Override
    public void removeLibro(Libro li) {
        try {
            PreparedStatement ps = Conexion.ObtenerConexion().prepareCall("{CALL EliminarLibros(?)}");
            ps.setInt(1, li.getCodigo());
            ps.execute();
        } catch (Exception e) {
            System.out.println("Error remove Libros");
        }
    }

    @Override
    public void updateLibro(Libro li) {
        try {
            PreparedStatement ps = Conexion.ObtenerConexion().prepareStatement("{CALL UpdateLibros(?,?,?,?,?,?)}");
            ps.setInt(1, li.getCodigo());
            ps.setString(2, li.getTitulo());
            ps.setString(3, li.getAutor());
            ps.setString(4, li.getGenero());
            ps.setInt(5, li.getNumCopias());
            ps.setInt(6, li.getId_Genero());
            ps.executeUpdate();
        } catch (Exception e) {
            System.out.println("error al pasar los datos " + e.getMessage());
        }
    }

    @Override
    public List<Libro> BuscarLibroXCodigo(int codigo) {
        try {
            List<Libro> lstLibro = new ArrayList<>();
            CallableStatement cs = Conexion.ObtenerConexion().prepareCall("{CALL BuscarLibros(?)}");
            cs.setInt(1, codigo);
            ResultSet rs = cs.executeQuery();
            while(rs.next()){
                Libro objLibro = new Libro();
                objLibro.setCodigo(rs.getInt("Id_Libro"));
                objLibro.setTitulo(rs.getString("Titulo"));
                objLibro.setAutor(rs.getString("Autor"));
                objLibro.setGenero(rs.getString("Genero"));
                objLibro.setNumCopias(rs.getInt("Num_Copias"));
              //  objLibro.setId_Genero(rs.getInt("Generos_Id_Generos"));
                
                
                lstLibro.add(objLibro);
                System.out.println("paso dato libros");
                break;
            }
            Conexion.ObtenerConexion().close();
            rs.close();
            return lstLibro;
        } catch (Exception e) {
             System.out.println("Error Bucar por codigo Libros");
             e.getMessage();
        }
        return null;
    }

    @Override
    public int NewLibro() {
          int SgtNum = 0;
        try {
            CallableStatement cs = Conexion.ObtenerConexion().prepareCall("{CALL GetCorrelativoLi}");
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

    @Override
    public List<Libro> GetNomLibros() {
        try {
            List<Libro> lst = new ArrayList<>();
            CallableStatement cs = Conexion.ObtenerConexion().prepareCall("{CALL ListarLi}");
            ResultSet rs = cs.executeQuery();
            while(rs.next()){
                Libro obj = new Libro();
                obj.setCodigo(rs.getInt("Id_Libro"));
                obj.setTitulo(rs.getString("Nombre_Libro"));
                
                lst.add(obj);
            }
            Conexion.ObtenerConexion().close();
            rs.close();
            return lst;
        } catch (Exception e) {
            System.out.println("Error al listar Libros" + e.getMessage());
        }
        return null;
    }

    @Override
    public List<Libro> GetNumLibros(String NomLi) {
        try {
            List<Libro> lst = new ArrayList<>();
            CallableStatement cs = Conexion.ObtenerConexion().prepareCall("{CALL NumLibrosxNom(?)}");
            cs.setString(1, NomLi);
            ResultSet rs = cs.executeQuery();
            while(rs.next()){
                Libro obj = new Libro();
                obj.setNumCopias(rs.getInt("Num_Copias"));
                
                lst.add(obj);
            }
            Conexion.ObtenerConexion().close();
            rs.close();
            return lst;
        } catch (Exception e) {
             System.out.println("error aqui "+ e.getMessage());
        }
        return null;
    }

    @Override
    public List<Libro> GetAutor() {
        try {
            List<Libro> lst = new ArrayList<>();
            CallableStatement cs = Conexion.ObtenerConexion().prepareCall("{CALL ListarAutor}");
            ResultSet rs = cs.executeQuery();
            while(rs.next()){
                Libro obj = new Libro();
                obj.setCodigo(rs.getInt("Id_libro"));
                obj.setAutor(rs.getString("Autores"));
                
                lst.add(obj);
            }
            Conexion.ObtenerConexion().close();
            rs.close();
            return lst;
        } catch (Exception e) {
            System.out.println("Error al listar autores" + e.getMessage());
        }
        return null;
    }

    @Override
    public List<Libro> GetCat() {
        try {
            List<Libro> lst = new ArrayList<>();
            CallableStatement cs = Conexion.ObtenerConexion().prepareCall("{CALL ListarCatLibro}");
            ResultSet rs = cs.executeQuery();
            while(rs.next()){
                Libro obj = new Libro();
                obj.setCodigo(rs.getInt("Id_libro"));
                obj.setGenero(rs.getString("Cat_Libro"));
                
                lst.add(obj);
            }
            Conexion.ObtenerConexion().close();
            rs.close();
            return lst;
        } catch (Exception e) {
            System.out.println("Error al listar libros Cat" + e.getMessage());
        }
        return null;
    }

 
}
