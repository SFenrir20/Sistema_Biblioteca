/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author santi
 */
public class Libro {
    
    private int codigo;
    private String titulo;
    private String autor;
    private int NumCopias;
    private String genero;
    private int Id_Genero;

    public Libro() {
    }

    public Libro(int codigo, String titulo, String autor, int NumCopias, String genero, int Id_Genero) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.autor = autor;
        this.NumCopias = NumCopias;
        this.genero = genero;
        this.Id_Genero = Id_Genero;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNumCopias() {
        return NumCopias;
    }

    public void setNumCopias(int NumCopias) {
        this.NumCopias = NumCopias;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getId_Genero() {
        return Id_Genero;
    }

    public void setId_Genero(int Id_Genero) {
        this.Id_Genero = Id_Genero;
    }
    
    
}
