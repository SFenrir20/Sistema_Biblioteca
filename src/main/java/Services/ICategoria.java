/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Services;

import Model.Categorias_US;
import java.util.List;

/**
 *
 * @author santi
 */
public interface ICategoria {
    
    List<Categorias_US> GetAll();
    
    List<Categorias_US> getAllCategoria();
    void addCategoria(Categorias_US gen);
    void removeCategoria(Categorias_US gen);
    void updateCategoria(Categorias_US gen);
    List<Categorias_US> BuscarCatXCodigo(int codigo);
    int NewCategoria();
    
}
