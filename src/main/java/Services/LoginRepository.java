/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Services;

import Model.Usuario;
import Util.Conexion;
import java.sql.CallableStatement;
import java.sql.Types;

/**
 *
 * @author santi
 */
public class LoginRepository implements ILogin{

    @Override
    public boolean verificarCredenciales(String username, String password) {
        try {
            CallableStatement ct = Conexion.ObtenerConexion().prepareCall("{Call VerificarCredenciales(?,?,?)}");
            ct.setString(1, username);
            ct.setString(2, password);
            ct.registerOutParameter(3,Types.BOOLEAN);
            ct.execute();
            
            boolean CredecialesValidad = ct.getBoolean(3);
            Conexion.ObtenerConexion().close();
            return CredecialesValidad;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
    
}
