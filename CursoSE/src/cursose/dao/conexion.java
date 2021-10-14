/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cursose.dao;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Eduardo
 */
public class conexion {
    protected Connection conexion =null;
    final String JDBC_DRIVER = "org.postgresql.Driver";
    final String DB_URL = "jdbc:postgresql://localhost:5432/ejemplo";
    final String USER = "java";
    final String PASS = "java";
    
    public void conectar() throws Exception{
        try{
        conexion = DriverManager.getConnection(DB_URL, USER, PASS);
        Class.forName(JDBC_DRIVER);            
        }catch(Exception e){
            e.getMessage();
        }

    }
    public void cerrar() throws Exception {
       
            if(conexion != null){
                if(!conexion.isClosed()){
                    conexion.close();
                }
            }
        
    }
}
