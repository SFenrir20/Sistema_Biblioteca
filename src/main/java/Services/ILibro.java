/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Services;

import Model.Libro;
import java.util.List;

/**
 *
 * @author santi
 */
public interface ILibro {
    List<Libro> getAllLibros();
    void addLibros(Libro li);
    void removeLibro(Libro li);
    void updateLibro(Libro li);
    List<Libro> BuscarLibroXCodigo(int codigo);
    int NewLibro();
    
    List<Libro> GetNomLibros();
    List<Libro> GetAutor();
    List<Libro> GetCat();
    
    
    List<Libro> GetNumLibros(String nomLi);
}
