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
public class Biblioteca {
    private List<Libro> libros;  

    public Biblioteca() {
        libros = new ArrayList<>();
    }
    
    public void agregarLibro(Libro objLibro){
        libros.add(objLibro);
    }
    
    public void eliminarLibro(Libro objLibro){
        libros.remove(objLibro);
    }
    
    public List<Libro> buscarPorTitulo(String titulo){
        List<Libro> resultados = new ArrayList<>();
        for(Libro libro : libros){
            if(libro.getTitulo().equalsIgnoreCase(titulo)){
                resultados.add(libro);
            }
        }
        return resultados;
    }
}
