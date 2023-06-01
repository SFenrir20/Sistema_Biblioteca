/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Services;

import Model.Generos;
import java.util.List;

/**
 *
 * @author santi
 */
public interface IGeneros {
    List<Generos> GetAll();
    
    List<Generos> getAllGeneros();
    void addGeneros(Generos gen);
    void removeGeneros(Generos gen);
    void updateGeneros(Generos gen);
    List<Generos> BuscarLibroXCodigo(int codigo);
    int NewGenero();
}
