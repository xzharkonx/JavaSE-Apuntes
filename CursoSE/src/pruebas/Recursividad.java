/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebas;

import java.util.Scanner;

/**
 *
 * @author Eduardo
 */
public class Recursividad {
    
    public static int recursiva(int i,int j){
        
        if (i>=j){
           // hasta aquí llega a ese op dato ingresado
           System.out.println(i);
           return i; 
        }
        System.out.println(i);
        return recursiva(i=i+1,j);    
        
    }
    
    public static void recursivaDetonadora(int i, int j){
             /**
             * Aquí puede continuar más codigo debajo - comienzo de la subida.
             */
             //System.out.println("->"+ String.valueOf(i));
        if(i>=j){
            System.out.println(i);
             /**
             * Aquí puede continuar más codigo debajo - final de la subida.
             */
             //System.out.println("->"+ String.valueOf(i));
        }else{
            System.out.println("Subida: "+ String.valueOf(i) );
            recursivaDetonadora(i=i+1,j);
            System.out.println("Bajada: "+ String.valueOf(i) );
            
            /**
             * Aquí puede continuar más codigo debajo - comienzo de la bajada.
             */
            //System.out.println("->"+ String.valueOf(i));
        }
        
            /**
             * Aquí puede continuar más codigo debajo - final de la bajada.
             */
            //System.out.println("->"+ String.valueOf(i));
    }
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa el número de recursividad");
        int op = sc.nextInt();
        int dato = recursiva(0,op);
        System.out.println(dato);
        recursivaDetonadora(0,op);
        
    }
}
