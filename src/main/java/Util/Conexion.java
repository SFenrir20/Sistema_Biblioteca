/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Util;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author santi
 */
public class Conexion {
    public Conexion(){}
    public static Connection ObtenerConexion(){
                  Connection cn = null; //Creando la variable conexion
      try{
     Class.forName("com.mysql.jdbc.Driver");
     cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sis_biblioteca","root","");
      
      System.out.println("Conexion exitosa!!!");
      }
      catch(Exception ex){
          System.out.println("Error al conectar con la BD" + ex.getMessage());
      }
      return cn;//si hay una conexion
    }
}
