        /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controllers;

import Model.Categorias_US;
import Services.CategoriaRepository;
import java.util.List;

/**
 *
 * @author santi
 */
public class CategoriaController {
    public List<Categorias_US> GetAllCategroiaController(){
        return new CategoriaRepository().GetAll();
    }
    
    public Categorias_US GetCategoriaXNombre(String nom){
        List<Categorias_US> lst = GetAllCategroiaController();
        for(Categorias_US cat:lst){
            if(cat.getNombre_Categoria().equalsIgnoreCase(nom)){
                return cat;
            }
        }
        return null;
    }
}
