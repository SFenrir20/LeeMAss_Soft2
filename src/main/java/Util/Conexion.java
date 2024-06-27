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
    public static Connection ObtenerConnection(){
                  Connection cn = null;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bd_leemass", "root", "");
            
            System.out.println("Conexion esitosa!!");
        }catch(Exception ex){
            System.out.println("Error al conectar con la BD" + ex.getMessage());
        }
        return cn;
    }
}
