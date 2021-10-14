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
public class Tutorial_Java_SE_15_Vectores_Paralelos {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        String[] nombre = new String[3];
        int[] edad = new int[3];
        for(int i = 0; i < 3; i++){
            System.out.println("Ingresa el nombre: ");
            nombre[i]=sc.next();
            System.out.println("Ingresa la edad: ");
            edad[i]=sc.nextInt();
        }
        System.out.println("-----------------------");
       for(int i = 0; i <3;i++){
           if(edad[i] == 24){
              System.out.println(i+".- Nombre "+nombre[i]+", Edad "+edad[i]);    
              //Filtrando por la edad en todo el arreglo
           }
       }
    }
}
