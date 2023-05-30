/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author santi
 */
public class Generos {
    private int Id_Genero;
    private String nombre_gen;
    private String des_gen;

    public Generos() {
    }

    public Generos(int Id_Genero, String nombre_gen, String des_gen) {
        this.Id_Genero = Id_Genero;
        this.nombre_gen = nombre_gen;
        this.des_gen = des_gen;
    }

    public int getId_Genero() {
        return Id_Genero;
    }

    public void setId_Genero(int Id_Genero) {
        this.Id_Genero = Id_Genero;
    }

    public String getNombre_gen() {
        return nombre_gen;
    }

    public void setNombre_gen(String nombre_gen) {
        this.nombre_gen = nombre_gen;
    }

    public String getDes_gen() {
        return des_gen;
    }

    public void setDes_gen(String des_gen) {
        this.des_gen = des_gen;
    }
    
    
}
