/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Services;

import Model.Estados;
import java.util.List;

/**
 *
 * @author santi
 */
public interface IEstados {
    List<Estados> GetAll();
    
    List<Estados> getAllEstados();
    void addEstados(Estados gen);
    void removeEstados(Estados gen);
    void updateEstados(Estados gen);
    List<Estados> BuscarEstadoXCodigo(int codigo);
    int NewEstados();
}
