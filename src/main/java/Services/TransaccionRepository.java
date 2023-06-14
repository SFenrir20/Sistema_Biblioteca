/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Services;

import Util.Conexion;
import java.sql.CallableStatement;
import java.sql.ResultSet;

/**
 *
 * @author santi
 */
public class TransaccionRepository implements ITransaccion {

    @Override
    public int GetCorrelativo() {
        int SgyNum = 0;
        try {
            CallableStatement cs = Conexion.ObtenerConexion().prepareCall("{CALL GetCorrelativoTrans}");
            ResultSet es = cs.executeQuery();
            while(es.next()){
                SgyNum = es.getInt(1)+1;
            }
             System.out.println("El Codigo es: " + SgyNum);
        } catch (Exception e) {
             System.out.println("El error es" + e.getMessage());
        }
        return SgyNum;
    }
    
}
