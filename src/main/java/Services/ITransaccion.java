/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Services;

import Model.Transaccion;
import java.util.List;

/**
 *
 * @author santi
 */
public interface ITransaccion {
    
    List<Transaccion> getAllTransaccions();
    void addTransaccionReseva(Transaccion transaccion);
    void addTransaccionPrestamo(Transaccion transaccion);
    void addTransaccionDebolucion(Transaccion transaccion);
    Transaccion transaccionPorId(int codigo);
    
    
    /*echo por val y carlos*/
    void updateEstadoTransaccion(Transaccion transaccion); 
    Transaccion getTransaccionPorNombre(String nom);

    
    int GetCorrelativo();
    
    
}
