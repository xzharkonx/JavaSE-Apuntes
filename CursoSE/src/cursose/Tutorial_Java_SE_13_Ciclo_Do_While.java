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
public class Tutorial_Java_SE_13_Ciclo_Do_While {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        String contrasena;//De esta forma no es necesario asignarle un valor
        //Si fuera con un while, si es necesario declararla en blanco
        //String contrasena = "";
        do{
            System.out.println("Ingresa la contrasenia");
            contrasena = sc.next();
            
        }while(!contrasena.equals("1234"));
        
        System.out.println("Ingresa tu nombre");
        String texto = sc.next();
        String textoMayuscula= texto.toUpperCase();
        System.out.println("Bienvenido "+textoMayuscula);
    }
}
