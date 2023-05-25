/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Services;

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
    public boolean verificarCredenciales(String username, String password) {
        ResultSet rs= null;
        try {
            CallableStatement ct = Conexion.ObtenerConexion().prepareCall("{Call verificarCredenciales(?,?)}");
            ct.setString(1, username);
            ct.setString(2, password);
            rs = ct.executeQuery();
            if(rs.next()){
                return true;
            }
            Conexion.ObtenerConexion().close();
        } catch (Exception e) {
            e.printStackTrace();
           // return null;
        }
        return false;
    }
    
}
