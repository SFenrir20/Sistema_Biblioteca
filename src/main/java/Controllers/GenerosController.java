/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controllers;

import Model.Generos;
import Services.GenerosRepository;
import java.util.List;

/**
 *
 * @author santi
 */
public class GenerosController {
    public List<Generos> GetAllGenerosController(){
        return new GenerosRepository().GetAll();
    }
    
     public Generos GetCategoriaXNombre(String nom){
        List<Generos> lst = GetAllGenerosController();
        for(Generos gen:lst){
            if(gen.getNombre_gen().equalsIgnoreCase(nom)){
                return gen;
            }
        }
        return null;
    }
     
     public List<Generos> getLstGenerosController(){
        return new GenerosRepository().getAllGeneros();
    }
    
    public void InsertarLibrosController(Generos gen){
        new GenerosRepository().addGeneros(gen);
    }
    
    public void EliminarLibrosController(Generos gen){
        new GenerosRepository().removeGeneros(gen);
    }
    
    public void ActualizarGenerosController(Generos gen){
        new GenerosRepository().updateGeneros(gen);
    }
    
    public int GetCorrelativoController(){
        return new GenerosRepository().NewGenero();
    }
    
    public List<Generos> BuscarCodigoController(int codigo){
        return new GenerosRepository().BuscarLibroXCodigo(codigo);
    }
     
}
