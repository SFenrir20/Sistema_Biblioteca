/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author santi
 */
public class Historial {
     private List<Prestamo> prestamos;
     private List<Reserva> reservas;

    public Historial() {
          prestamos = new ArrayList<>();
          reservas = new ArrayList<>();
    }
     
     public void registrarPrestamo(Prestamo prestamo) {
        prestamos.add(prestamo);
    }
     
       public void registrarReserva(Reserva reserva) {
        reservas.add(reserva);
    }
     
}
