/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cursose;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

/**
 *
 * @author Eduardo
 */
public class Tutorial_Java_SE_50_Insercion_a_base_de_datos_con_parametros {
    public String solicitarValores(){
    System.out.println("Ingresa tu nombre: ");
    Scanner sc = new Scanner(System.in);
    String nombre = sc.next();
    return nombre;
}
    public void registrarBD(String nombre){
        final String JDBC_DRIVER = "org.postgresql.Driver";
        final String DB_URL = "jdbc:postgresql://localhost:5432/ejemplojava";
        final String USER = "estudiante";
        final String PASS = "zelda1234";
        
        try(Connection conexion = DriverManager.getConnection(DB_URL, USER, PASS)){
            PreparedStatement st = conexion.prepareStatement("INSERT INTO persona(nombre) values (?)");
            //Si tuvieramos más valores se colocarían más ? separados por , de la siguiente forma:
            //PreparedStatement st = conexion.prepareStatement("INSERT INTO persona(nombre) values (?,?,?)");
            //Le decimos que al primer signo de interrogación (No. 1) le va a colocar
            //el valor de nombre, y como es de tipo String, se utiliza el método
            //.setString, pero existe uno para cada tipo.
            st.setString(1, nombre);
            st.executeUpdate();
            st.close();
        }catch(Exception e){
            System.out.println("A ocurrido el siguiente error: "+e.getMessage());
        }
        
    }
    public static void main (String[] args){
            Tutorial_Java_SE_50_Insercion_a_base_de_datos_con_parametros curso = new Tutorial_Java_SE_50_Insercion_a_base_de_datos_con_parametros();
            String nombre = curso.solicitarValores();
            if(nombre != null){
                curso.registrarBD(nombre);
            }
            System.out.println("Continuamos con el codigo...");
        }
}
