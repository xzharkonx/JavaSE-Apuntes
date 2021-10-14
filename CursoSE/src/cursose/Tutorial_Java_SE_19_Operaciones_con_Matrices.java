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
public class Tutorial_Java_SE_19_Operaciones_con_Matrices {
        public static void main (String[] args){
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
         
          System.out.println("\n-------Diagonal----------------");
         for(int i = 0 ; i<3;i++){
            for(int j = 0; j<3;j++){
               if(j==i){
                     System.out.print(numeros[i][j]+"\t");              
                }else{
                     System.out.print(0+"\t");              
                }      
            }
            System.out.println("\n");
        }
          System.out.println("\n------Columna 1 Vertical-----------------");
         for(int i = 0 ; i<3;i++){
            for(int j = 0; j<3;j++){
               if(j==0){
                     System.out.print(numeros[i][j]+"\t");              
                }else{
                     System.out.print(0+"\t");              
                }      
            }
            System.out.println("\n");
        }
          System.out.println("\n-----Fila 1 Horizontal------------------");
         for(int i = 0 ; i<3;i++){
            for(int j = 0; j<3;j++){
               if(i==0){
                     System.out.print(numeros[i][j]+"\t");              
                }else{
                     System.out.print(0+"\t");              
                }      
            }
            System.out.println("\n");
        }
          System.out.println("\n----Datos diagonales pero en una sola fila----");
         for(int i = 0 ; i<3;i++){
            
                     System.out.print(numeros[i][i]+"\t");              
                
        }
         
    }
   
}