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
import java.util.ArrayList;
import java.util.List;

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
    
}
