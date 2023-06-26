/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Services;

import Model.Sha256;
import Model.Usuario;
import Util.Conexion;
import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author santi
 */
public class RusuarioRepository implements IRusuario {

    @Override
    public List<Usuario> getAllUsuario() {
        try {
            List<Usuario> lstus = new ArrayList<>();
            CallableStatement cs = Conexion.ObtenerConexion().prepareCall("{CALL ListarUsuarios}");
            ResultSet  rs = cs.executeQuery();
            while(rs.next()){
                Usuario obj = new Usuario();
                obj.setCodigo(rs.getInt("Id_Usuario"));
                obj.setNombre(rs.getString("nombre"));
                obj.setCategoria(rs.getString("Categoria"));
                obj.setEmail(rs.getString("Email"));
                
                lstus.add(obj);
                System.out.println("el dato paso");
            }
            Conexion.ObtenerConexion().close();
            rs.close();
            return lstus;
        } catch (Exception e) {
            System.out.println("error al pasar los datos " + e.getMessage());
        }
        return null;
    }

    @Override
    public void addUsuarios(Usuario us) {
        try {
            PreparedStatement ps = Conexion.ObtenerConexion().prepareCall("{CALL InsertarUs(?,?,?,?,?,?)}");
            ps.setInt(1, us.getCodigo());
            ps.setString(2, us.getNombre());
            ps.setString(3, Sha256.sha256(us.getContraseña()));
            ps.setString(4, us.getCategoria());
            ps.setString(5, us.getEmail());
            ps.setInt(6, us.getId_Cat());
            ps.executeQuery();
        } catch (Exception e) {
            System.out.println("Error en addUsuario");
        }
    }

    @Override
    public void removeUsuario(Usuario us) {
        try {
            PreparedStatement ps = Conexion.ObtenerConexion().prepareCall("{CALL EliminarUs(?)}");
            ps.setInt(1, us.getCodigo());
            ps.execute();
        } catch (Exception e) {
            System.out.println("Error removeUsuario");
        }
    }

    @Override
    public void updateUsuario(Usuario us) {
        try {
            PreparedStatement ps = Conexion.ObtenerConexion().prepareStatement("{CALL UpdateUS(?,?,?,?,?,?)}");
            ps.setInt(1, us.getCodigo());
             System.out.println("Error 1");
            ps.setString(2, us.getNombre());
             System.out.println("Error 2");
            ps.setString(3, Sha256.sha256(us.getContraseña()));
             System.out.println("Error 3");
            ps.setString(4, us.getCategoria());
             System.out.println("Error 4");
            ps.setString(5,us.getEmail());
             System.out.println("Error 5");
            ps.setInt(6, us.getId_Cat());
             System.out.println("Error 6");
            ps.executeUpdate();
             System.out.println("Error Aqui");
        } catch (Exception e) {
            System.out.println("error al pasar los datos " + e.getMessage());
        }
    }

    @Override
    public int getCorrelativo() {
        int SgtNum = 0;
        try {
            CallableStatement cs = Conexion.ObtenerConexion().prepareCall("{CALL GetCorrelativo}");
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
    public Usuario BuscarUsuarioXCodigo(int codigo) {
        try {
            //List<Usuario> lstUsuario = new ArrayList<>();
            CallableStatement cs = Conexion.ObtenerConexion().prepareCall("{CALL BuscarUsuario(?)}");
            cs.setInt(1, codigo);
            ResultSet rs = cs.executeQuery();
            Usuario objUsuario = new Usuario();
            while(rs.next()){
                objUsuario.setCodigo(rs.getInt("Id_Usuario"));
                objUsuario.setNombre(rs.getString("nombre"));
                objUsuario.setContraseña(rs.getString("password"));
                objUsuario.setCategoria(rs.getString("Categoria"));
                objUsuario.setEmail(rs.getString("Email"));
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

    @Override
    public List<Usuario> GetAllAlumos() {
         try {
            List<Usuario> lstus = new ArrayList<>();
            CallableStatement cs = Conexion.ObtenerConexion().prepareCall("{CALL ListarAlumnos}");
            ResultSet  rs = cs.executeQuery();
            while(rs.next()){
                Usuario obj = new Usuario();
                obj.setCodigo(rs.getInt("Id_Usuario"));
                obj.setNombre(rs.getString("nombre"));
                obj.setCategoria(rs.getString("Categoria"));
                obj.setEmail(rs.getString("Email"));
                
                lstus.add(obj);
                System.out.println("el dato paso");
            }
            Conexion.ObtenerConexion().close();
            rs.close();
            return lstus;
        } catch (Exception e) {
            System.out.println("error al pasar los datos " + e.getMessage());
        }
        return null;
    }

    @Override
    public int GerIdXNombreUsuario(String nom) {
        try {
             CallableStatement cs = Conexion.ObtenerConexion().prepareCall("{CALL GetIdXNom(?)}");
             cs.setString(1, nom);
             ResultSet rs = cs.executeQuery();
             Usuario user = new Usuario();
             while(rs.next()){
             user.setCodigo(rs.getInt("Id_Usuario"));
             
             System.out.println("paso este dato Objusuario");
             break;
             }
             Conexion.ObtenerConexion().close();
             rs.close();
             return user.getCodigo();
             }
        catch (Exception e) {
             System.out.println("Error Bucar por nombre");
             e.getMessage();
        }
        return 0;
    }
    
}
