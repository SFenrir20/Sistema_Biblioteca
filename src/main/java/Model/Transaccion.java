/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.Date;

/**
 *
 * @author santi
 */
public class Transaccion {
    
    private int codigo;
    private String Estado;
    private String Fecha_Prestamo;
    private String Fecha_Devolucion;
    private String Fecha_Reserva;
    private double multa;
    private int Id_Libro;
    private int Id_Usuario;
    private int Id_Estados;
    private int Num_Copias_Libro;

    public Transaccion() {
    }

    public Transaccion(int codigo, String Estado, String Fecha_Prestamo, String Fecha_Devolucion, String  Fecha_Reserva, double multa, int Id_Libro, int Id_Usuario,int Id_Estados, int Num_Copias_Libro) {
        this.codigo = codigo;
        this.Estado = Estado;
        this.Fecha_Prestamo = Fecha_Prestamo;
        this.Fecha_Devolucion = Fecha_Devolucion;
        this.Fecha_Reserva = Fecha_Reserva;
        this.multa = multa;
        this.Id_Libro = Id_Libro;
        this.Id_Usuario = Id_Usuario;
        this.Id_Estados = Id_Estados;
        this.Num_Copias_Libro = Num_Copias_Libro;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String Estado) {
        this.Estado = Estado;
    }

    public String getFecha_Prestamo() {
        return Fecha_Prestamo;
    }

    public void setFecha_Prestamo(String Fecha_Prestamo) {
        this.Fecha_Prestamo = Fecha_Prestamo;
    }

    public String getFecha_Devolucion() {
        return Fecha_Devolucion;
    }

    public void setFecha_Devolucion(String Fecha_Devolucion) {
        this.Fecha_Devolucion = Fecha_Devolucion;
    }

    public String getFecha_Reserva() {
        return Fecha_Reserva;
    }

    public void setFecha_Reserva(String Fecha_Reserva) {
        this.Fecha_Reserva = Fecha_Reserva;
    }

    public double getMulta() {
        return multa;
    }

    public void setMulta(double multa) {
        this.multa = multa;
    }

    public int getId_Libro() {
        return Id_Libro;
    }

    public void setId_Libro(int Id_Libro) {
        this.Id_Libro = Id_Libro;
    }

    public int getId_Usuario() {
        return Id_Usuario;
    }

    public void setId_Usuario(int Id_Usuario) {
        this.Id_Usuario = Id_Usuario;
    }

    public int getId_Estados() {
        return Id_Estados;
    }

    public void setId_Estados(int Id_Estados) {
        this.Id_Estados = Id_Estados;
    }

    public int getNum_Copias_Libro() {
        return Num_Copias_Libro;
    }

    public void setNum_Copias_Libro(int Num_Copias_Libro) {
        this.Num_Copias_Libro = Num_Copias_Libro;
    }
    
   
}
