/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cursose;

import java.util.Scanner;

/**
 *
 * @author Eduardo
 */
public class Tutorial_Java_SE_11_Ciclo_While {
    public static void main (String[] args){
        
    
    Scanner input = new Scanner(System.in);
    String usuario = "";
    String nombre = "Luis";
   
    // Se repetira porque la condición se cumple (esto puede variar
    //según nuestra lógica), de lo contrario termina.
    while(!usuario.equals(nombre)){
         
        System.out.println("Ingresa tu usuario"); 
        usuario = input.next();
       
    }
    System.out.println("Bienvenido "+usuario);
}
}
