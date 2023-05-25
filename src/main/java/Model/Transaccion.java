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
    private Date Fecha_Prestamo;
    private Date Fecha_Devolucion;
    private Date Fecha_Reserva;
    private double multa;
    private int Id_Libro;
    private int Id_Usuario;

    public Transaccion() {
    }

    public Transaccion(int codigo, String Estado, Date Fecha_Prestamo, Date Fecha_Devolucion, Date Fecha_Reserva, double multa, int Id_Libro, int Id_Usuario) {
        this.codigo = codigo;
        this.Estado = Estado;
        this.Fecha_Prestamo = Fecha_Prestamo;
        this.Fecha_Devolucion = Fecha_Devolucion;
        this.Fecha_Reserva = Fecha_Reserva;
        this.multa = multa;
        this.Id_Libro = Id_Libro;
        this.Id_Usuario = Id_Usuario;
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

    public Date getFecha_Prestamo() {
        return Fecha_Prestamo;
    }

    public void setFecha_Prestamo(Date Fecha_Prestamo) {
        this.Fecha_Prestamo = Fecha_Prestamo;
    }

    public Date getFecha_Devolucion() {
        return Fecha_Devolucion;
    }

    public void setFecha_Devolucion(Date Fecha_Devolucion) {
        this.Fecha_Devolucion = Fecha_Devolucion;
    }

    public Date getFecha_Reserva() {
        return Fecha_Reserva;
    }

    public void setFecha_Reserva(Date Fecha_Reserva) {
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
    
    
   
}
