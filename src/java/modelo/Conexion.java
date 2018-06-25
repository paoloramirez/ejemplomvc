/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import modelo.Entity.Usuario;

/**
 *
 * @author bash
 */
public class Conexion {
    
    private static Connection con=null;
    
    public Conexion() {
        
    }
    
    public static Connection getConnection(){
      try{
         if( con == null ){
            String classfor="oracle.jdbc.driver.OracleDriver";
            String url="jdbc:oracle:thin:@localhost:1521:xe";
            String usuario="paolo";
            String clave="paolo";
            Class.forName(classfor);
            con = DriverManager.getConnection(url, usuario, clave);
            
            System.out.println("Conexion Realizada");
         }
     }
     catch(Exception ev) {
            System.out.println(ev.toString());
        }
     return con;
   }
}
