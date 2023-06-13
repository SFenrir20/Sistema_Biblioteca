/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controllers;

import Model.Estados;
import Services.EstadosRepository;
import java.util.List;

/**
 *
 * @author santi
 */
public class EstadosController {
    public List<Estados> GetAllEstadosController(){
        return new EstadosRepository().GetAll();
    }
    
    public Estados GetEstadosXNombre(String nom){
        List<Estados> lst = GetAllEstadosController();
        for(Estados est:lst){
            if(est.getNombre_estados().equalsIgnoreCase(nom)){
                return  est;
            }
        }
        return null;
    }
    
}
