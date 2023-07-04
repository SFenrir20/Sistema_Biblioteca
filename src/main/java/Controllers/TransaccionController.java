/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controllers;

import Model.Transaccion;
import Services.TransaccionRepository;
import java.util.List;

/**
 *
 * @author santi
 */
public class TransaccionController {
    public int GetCorrelativoTController(){
        return new TransaccionRepository().GetCorrelativo();
    }
    
    public void AgregarTransaccionPrestamo(Transaccion trans){
        new TransaccionRepository().addTransaccionPrestamo(trans);
    }    
    
    public Transaccion ObtenerTransaccionPorId(int id){
        return new TransaccionRepository().transaccionPorId(id);
    }
    
    public void ActualizarEstadoDeTransaccion(Transaccion trans){
        new TransaccionRepository().updateEstadoTransaccion(trans);
    }
   
    public Transaccion getTransaccionPorNombre(String nom){
        return new TransaccionRepository().getTransaccionPorNombre(nom);
    }
    
}
