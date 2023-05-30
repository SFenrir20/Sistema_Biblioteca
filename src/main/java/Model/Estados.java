/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author santi
 */
public class Estados {
    private int Id_Estados;
    private String nombre_estados;
    private String Des_estados;

    public Estados() {
    }

    public Estados(int Id_Estados, String nombre_estados, String Des_estados) {
        this.Id_Estados = Id_Estados;
        this.nombre_estados = nombre_estados;
        this.Des_estados = Des_estados;
    }

    public int getId_Estados() {
        return Id_Estados;
    }

    public void setId_Estados(int Id_Estados) {
        this.Id_Estados = Id_Estados;
    }

    public String getNombre_estados() {
        return nombre_estados;
    }

    public void setNombre_estados(String nombre_estados) {
        this.nombre_estados = nombre_estados;
    }

    public String getDes_estados() {
        return Des_estados;
    }

    public void setDes_estados(String Des_estados) {
        this.Des_estados = Des_estados;
    }
    
    
}
