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
}
