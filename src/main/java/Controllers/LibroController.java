/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controllers;

import Model.Libro;
import Services.LibroRepository;
import java.util.List;

/**
 *
 * @author santi
 */
public class LibroController {
    public List<Libro> getLstLibrosController(){
        return new LibroRepository().getAllLibros();
    }
    
    public void InsertarLibrosController(Libro li){
        new LibroRepository().addLibros(li);
    }
    
    public void EliminarLibrosController(Libro li){
        new LibroRepository().removeLibro(li);
    }
    
    public void ActualizarLibrosController(Libro li){
        new LibroRepository().updateLibro(li);
    }
    
    public int GetCorrelativoController(){
        return new LibroRepository().NewLibro();
    }
    
    public List<Libro> BuscarCodigoController(int codigo){
        return new LibroRepository().BuscarLibroXCodigo(codigo);
    }
}
