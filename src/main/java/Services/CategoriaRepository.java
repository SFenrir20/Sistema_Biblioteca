/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Services;

import Model.Categorias_US;
import Util.Conexion;
import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author santi
 */
public class CategoriaRepository implements ICategoria{

    @Override
    public List<Categorias_US> GetAll() {
        try {
            List<Categorias_US> lstCat = new ArrayList<>();
            CallableStatement cs = Conexion.ObtenerConexion().prepareCall("{CALL ListarCat}");
            ResultSet rs = cs.executeQuery();
            while(rs.next()){
                Categorias_US objCat = new Categorias_US();
                objCat.setId_Categoria(rs.getInt("Id_Categoria"));
                objCat.setNombre_Categoria(rs.getString("Nombre_Categoria"));
                
                lstCat.add(objCat);
            }
            Conexion.ObtenerConexion().close();
            rs.close();
            return lstCat;
        } catch (Exception e) {
            System.out.println("Error al listar" + e.getMessage());
        }
        return null;
    }
    
}
