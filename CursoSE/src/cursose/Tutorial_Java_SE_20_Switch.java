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
public class Tutorial_Java_SE_20_Switch {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa un nombre de usuario");
        String condicion = sc.next();
        
        switch(condicion){
            case "Luis":
                System.out.println("Hola "+condicion);
            break;
            case "Eduardo":
                System.out.println("Hola "+condicion);
            break;
            case "admin":
                System.out.println("Hola "+condicion);
            break;
            default:
                 System.out.println("Su dato: "+condicion+" es incorrecto.");
            break;
        }
    }
}
