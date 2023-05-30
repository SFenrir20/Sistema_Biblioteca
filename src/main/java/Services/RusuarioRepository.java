/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Services;

import Model.Usuario;
import Util.Conexion;
import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
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
            PreparedStatement ps = Conexion.ObtenerConexion().prepareCall("{CALL InsertarUs(?,?,?,?,?)}");
            ps.setInt(1, us.getCodigo());
            ps.setString(2, us.getNombre());
            ps.setString(3, us.getContraseña());
            ps.setString(4, us.getCategoria());
            ps.setString(5, us.getEmail());
            ps.executeQuery();
        } catch (Exception e) {
        }
    }

    @Override
    public void removeUsuario(Usuario us) {
        try {
            PreparedStatement ps = Conexion.ObtenerConexion().prepareCall("{CALL EliminarUs(?)}");
            ps.setInt(1, us.getCodigo());
            ps.execute();
        } catch (Exception e) {
        }
    }

    @Override
    public void updateUsuario(Usuario us) {
        try {
            PreparedStatement ps = Conexion.ObtenerConexion().prepareCall("{CALL UpdateUS}");
            ps.setInt(1, us.getCodigo());
            ps.setString(2, us.getNombre());
            ps.setString(3, us.getContraseña());
            ps.setString(4, us.getCategoria());
            ps.setString(5,us.getEmail());
            ps.execute();
        } catch (Exception e) {
        }
    }

    @Override
    public int getCorrelativo() {
        ResultSet rs = null;
        int count = 1;
        try {
            CallableStatement ct = Conexion.ObtenerConexion().prepareCall("{CALL GetCorrelativo}");
            rs = ct.executeQuery();
            
            while(rs.next()){
                count+=rs.getInt("Id_Usuario");
                
            }
            Conexion.ObtenerConexion().close();
            return count;
        } catch (Exception e) {
        }
        return 99;
    }

    @Override
    public List<Usuario> BuscarUsuarioXCodigo(int codigo) {
        try {
            List<Usuario> lstUsuario = new ArrayList<>();
            CallableStatement cs = Conexion.ObtenerConexion().prepareCall("{CALL BuscarUsuario(?)}");
            cs.setInt(1, codigo);
            ResultSet rs = cs.executeQuery();
            while(rs.next()){
                Usuario objUsuario = new Usuario();
                objUsuario.setCodigo(rs.getInt("Id_Usuario"));
                objUsuario.setNombre(rs.getString("nombre"));
                objUsuario.setCategoria(rs.getString("Categoria"));
                objUsuario.setEmail(rs.getString("Email"));
                
                lstUsuario.add(objUsuario);
                break;
            }
            Conexion.ObtenerConexion().close();
            rs.close();
            return lstUsuario;
        } catch (Exception ex) {
            ex.getMessage();
        }
        return null;
    }
    
}
