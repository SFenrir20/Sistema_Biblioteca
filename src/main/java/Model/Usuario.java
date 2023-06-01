/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author santi
 */
public class Usuario {
    private int codigo;
    private String nombre;
    private String Contraseña;
    private String Categoria;
    private String email;
    private int Id_Cat;

    public Usuario() {
    }

    public Usuario(int codigo, String nombre, String Contraseña, String Categoria, String email, int Id_Cat) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.Contraseña = Contraseña;
        this.Categoria = Categoria;
        this.email = email;
        this.Id_Cat = Id_Cat;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getContraseña() {
        return Contraseña;
    }

    public void setContraseña(String Contraseña) {
        this.Contraseña = Contraseña;
    }

    public String getCategoria() {
        return Categoria;
    }

    public void setCategoria(String Categoria) {
        this.Categoria = Categoria;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getId_Cat() {
        return Id_Cat;
    }

    public void setId_Cat(int Id_Cat) {
        this.Id_Cat = Id_Cat;
    }
    
    
    
}
