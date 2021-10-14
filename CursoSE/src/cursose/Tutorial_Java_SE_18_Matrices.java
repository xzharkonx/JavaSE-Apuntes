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
public class Tutorial_Java_SE_18_Matrices {
    public static void main (String[] args){
        //Filas y Columnas.
        int[][] numeros = new int[3][3];
        Scanner sc = new Scanner(System.in);
        for(int i = 0 ; i<3;i++){
            for(int j = 0; j<3;j++){
                System.out.println("Ingresa el numero");
                numeros[i][j]=sc.nextInt();
            }
        }
         System.out.println("\n");
         for(int i = 0 ; i<3;i++){
            for(int j = 0; j<3;j++){
                System.out.print(numeros[i][j]+"\t");              
            }
            System.out.println("\n");
        }
    }
}
