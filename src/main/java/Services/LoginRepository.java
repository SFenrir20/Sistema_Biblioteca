/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Services;

import Model.Sha256;
import Model.Usuario;
import Util.Conexion;
import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.Types;

/**
 *
 * @author santi
 */
public class LoginRepository implements ILogin{

    @Override
    public boolean verificarCredenciales(Usuario user) {
        ResultSet rs= null;
        try {
            CallableStatement ct = Conexion.ObtenerConexion().prepareCall("{Call GetUsuarioXNom(?)}");
            ct.setString(1,user.getNombre());
            rs = ct.executeQuery();
            if(rs.next()){
                if(user.getContraseña().equals(rs.getString("password"))){
                    user.setCodigo(rs.getInt("Id_Usuario"));
                    user.setCategoria(rs.getString("Categoria"));
                    user.setEmail(rs.getString("Email"));
                    user.setId_Cat(rs.getInt("Categoria_Us_Id_Categoria"));
                    return true;
                }
                return false;
            }
            Conexion.ObtenerConexion().close();
        } catch (Exception e) {
            e.printStackTrace();
           // return null;
        }
        return false;
    }
    
}
