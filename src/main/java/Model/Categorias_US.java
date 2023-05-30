/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author santi
 */
public class Categorias_US {
    private int id_Categoria;
    private String nombre_Categoria;
    private String des_Categoria;

    public Categorias_US() {
    }

    public Categorias_US(int id_Categoria, String nombre_Categoria, String des_Categoria) {
        this.id_Categoria = id_Categoria;
        this.nombre_Categoria = nombre_Categoria;
        this.des_Categoria = des_Categoria;
    }

    public int getId_Categoria() {
        return id_Categoria;
    }

    public void setId_Categoria(int id_Categoria) {
        this.id_Categoria = id_Categoria;
    }

    public String getNombre_Categoria() {
        return nombre_Categoria;
    }

    public void setNombre_Categoria(String nombre_Categoria) {
        this.nombre_Categoria = nombre_Categoria;
    }

    public String getDes_Categoria() {
        return des_Categoria;
    }

    public void setDes_Categoria(String des_Categoria) {
        this.des_Categoria = des_Categoria;
    }

}