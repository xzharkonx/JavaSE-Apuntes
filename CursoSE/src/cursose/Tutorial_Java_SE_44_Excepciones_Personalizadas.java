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
public class Tutorial_Java_SE_44_Excepciones_Personalizadas {

//Si no queremos utilizar try/catch tenemos que añadir la excepción con
//throws y la clase de la Excepción
//public static void main(String[] args) throws EdadException{
        public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa tu edad: ");
        int edad = sc.nextInt();
        final int EDAD_MAXIMA  = 100;
        try{
        if(edad < EDAD_MAXIMA){
            System.out.println("Bienvenido");
        }else{
            // Aquí lanzamos la Excepción.
            throw new EdadException("Error");
        }
        }catch(EdadException e){
            System.out.println("Error catch: " + e.getMessage());
    }
    }
    
}
