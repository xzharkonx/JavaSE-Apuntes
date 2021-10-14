/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cursose;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Eduardo
 */
public class Tutorial_Java_SE_49_Conexion_a_Base_de_Datos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException {
        //final String JDBC_DRIVER ="org.postgresql.Driver";//Para postgresql
        final String JDBC_DRIVER ="com.mysql.jdbc.Driver"; //Para Mysql
        final String DB_URL = "jdbc:postgresql://localhost:5432/ejemplojava";//Para postgresql
        //final String DB_URL = "jdbc:mysql://localhost:3306/ejemplo";//Para Mysql
        
        // base de datos credenciales
        final String USER = "estudiante";
        final String PASS = "zelda1234";
        //Definimos la conexión y la librería: java.sql.Connection;
        //Recuerda descargar el conector o librería de acuerdo a la
        //versión de la base de datos y añadirla en biblioteca
        
        //Definimos un objeto de la clase Connecion
        //Connection conexion = null;//Comentada ya que esta ya se defini en el
        //trywithresourses
        try( Connection conexion = DriverManager.getConnection(DB_URL, USER, PASS)){
            Class.forName(JDBC_DRIVER);
           
            // Preparamos la sentencia
            PreparedStatement st = conexion.prepareStatement("INSERT INTO PERSONA (nombre) values ('Godzilla')");
            //PreparedStatement stUpdate = conexion.prepareStatement("UPDATE PERSONA SET nombre = ('Emperador Julio Cesar') WHERE id = 3");
            st.executeUpdate();
            System.out.println("Registro ingresado correctamente.");
            st.close();
        }catch(Exception e){
            System.out.println("A ocurriodo el siguiente error: "+e.getMessage());
        }
       /* try{
            Class.forName(JDBC_DRIVER);
            conexion = DriverManager.getConnection(DB_URL, USER, PASS);
            
            PreparedStatement st = conexion.prepareStatement("INSERT INTO PERSONA (nombre) values ('Emperador Mario')");
            st.executeUpdate();
            st.close();
        }catch(Exception e){
            System.out.println("El error causado es: "+e.getMessage());
        }finally{
            if(conexion != null){
                if(!conexion.isClosed()){
                    conexion.close();
                }
            }
        }*/
    }
    
}
