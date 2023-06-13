/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Services;

import Model.Estados;
import Util.Conexion;
import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author santi
 */
public class EstadosRepository implements IEstados {

    @Override
    public List<Estados> GetAll() {
        try {
            List<Estados> lstEs = new ArrayList<>();
            CallableStatement cs = Conexion.ObtenerConexion().prepareCall("{CALL ListarEstados}");
            ResultSet rs = cs.executeQuery();
            while(rs.next()){
                Estados objEst = new Estados();
                objEst.setId_Estados(rs.getInt("Id_Estados"));
                objEst.setNombre_estados(rs.getString("Nombre"));
                
                lstEs.add(objEst);
            }
            Conexion.ObtenerConexion().close();
            rs.close();
            return lstEs;
        } catch (Exception e) {
            System.out.println("Error al listar" + e.getMessage());
        }
        return null;
    }
    
}
