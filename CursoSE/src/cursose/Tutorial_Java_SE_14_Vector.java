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
 * Truco: Seleccionando una palabra y presionando Ctrl + R podemos seleccionar
 * todas esas mismas palabras
 */
public class Tutorial_Java_SE_14_Vector {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingres el tamanio del arreglo");
        int tamanio = sc.nextInt();
        
        // Si ingresamos más datos que los del tamaño del Vector/Array nos dara
        // un error.
        
        // Declaración del Vector/Array
        String[] vector = new String[tamanio];
                
        
        for(int i = 0; i < vector.length; i++){
            System.out.println("Ingresa el dato en la posicion n°"+i+" :");
            vector[i]=sc.next();
        }
        
        System.out.println("-----------------------");
        int i = 0;
        
        for(String dato : vector){
            System.out.println(i+".-: "+dato);
            i++;
        }
        
        
    }
}
