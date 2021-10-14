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
public class Tutorial_Java_SE_17_Vectores_Ordenamiento_Burbuja {
     public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        String[] nombre = new String[4];
        int[] edad = new int[4];
        for(int i = 0; i < 4; i++){
            System.out.println("Ingresa el nombre: ");
            nombre[i]=sc.next();
            System.out.println("Ingresa la edad: ");
            edad[i]=sc.nextInt();
        }
        System.out.println("-----------------------");
        
        /**
         * Ordenamiento de Edades.
         */
        
        int aux;
        for(int i=0; i<3; i++){//Avanza 4 posiciones
           // El j<3-1 quiere decir que ya no recorrerá hasta el final
           // si no que irá reduciendo lo que recorrera del arreglo porque
           // los números mayores se iran aventando al final y ya no tendrá
           // caso ir a ordenar al final porque ya se iran acomodando.
           for(int j=0; j<3-i; j++){//Avanza j = 4 posiciones desde i = 0
                                    //Avanza j = 3 posociones desde 1 = 1
                                    //por que como i es un contendor
                                    //j le va dando pasadas para ordenarlo
                                    //Cada pasada recorre menos j
                                    //e i se completa ordenando todo
               // Aquí hace el intercambio de posiciones.
               if(edad[j]> edad[j+1]){
                aux = edad[j];
                edad[j]=edad[j+1];
                edad[j+1]=aux;
               }
           }
       }
        for(Integer valor : edad){
            System.out.println(valor);
        }
        
        /**
         * Ordenamiento de Nombres.
         */
        
        
        nombre = new String[4];
        edad = new int[4];
        for(int i = 0; i < 4; i++){
            System.out.println("Ingresa el nombre: ");
            nombre[i]=sc.next();
            System.out.println("Ingresa la edad: ");
            edad[i]=sc.nextInt();
        }
        
        String aux2;
        for(int i=0; i<3; i++){//Avanza 4 posiciones
           // El j<3-1 quiere decir que ya no recorrerá hasta el final
           // si no que irá reduciendo lo que recorrera del arreglo porque
           // los números mayores se iran aventando al final y ya no tendrá
           // caso ir a ordenar al final porque ya se iran acomodando.
           for(int j=0; j<3-i; j++){//Avanza j = 4 posiciones desde i = 0
                                    //Avanza j = 3 posociones desde 1 = 1
                                    //por que como i es un contendor
                                    //j le va dando pasadas para ordenarlo
                                    //Cada pasada recorre menos j
                                    //e i se completa ordenando todo
               // Aquí hace el intercambio de posiciones.
               if(nombre[j].compareTo(nombre[j + 1]) > 0){
                aux2 = nombre[j];
                nombre[j]=nombre[j+1];
                nombre[j+1]=aux2;
               }
           }
       }
        for(String valor : nombre){
            System.out.println(valor);
        }
        
        
        
        /*System.out.println("-----------------------");
        for(int k=0; k<3; k++){
              System.out.println(k);
            for(int l=0; l<3-k; l++){
            System.out.println(l);
        }
        }*/
}
}
