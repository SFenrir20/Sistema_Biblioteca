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
public class Usuario {
    
    private String nombre;
    private String password;
    private List<Libro> historialPrestamo;  

    public Usuario(String nombre, String password, List<Libro> historialPrestamo) {
        this.nombre = nombre;
        this.password = password;
        historialPrestamo = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<Libro> getHistorialPrestamo() {
        return historialPrestamo;
    }

    public void setHistorialPrestamo(List<Libro> historialPrestamo) {
        this.historialPrestamo = historialPrestamo;
    }
    
    
    
    
    
}
