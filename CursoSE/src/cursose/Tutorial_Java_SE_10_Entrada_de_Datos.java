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
 * Más documentación: https://www.tutorialesprogramacionya.com/javaya/detalleconcepto.php?codigo=86&punto=&inicio=
 * Consejo:
 * Cuando se ingresa una cadena con caracteres en blanco debemos tener en cuenta
 * en llamar al método nextLine() Una dificultad se presenta si llamamos al 
 * método nextLine() y previamente hemos llamado al método nextInt(), esto 
 * debido a que luego de ejecutar el método nextInt() queda almacenado en el 
 * objeto de la clase Scanner el caracter "Enter" y si llamamos inmediatamente
 * al método nextLine() este almacena dicho valor de tecla y continúa con el
 * flujo del programa. Para solucionar este problema debemos generar un código 
 * similar a:

        System.out.print("Ingrese edad:");
        edad1=teclado.nextInt();
        System.out.print("Ingrese el apellido y el nombre:");
        teclado.nextLine();
        apenom2=teclado.nextLine();

 */

public class Tutorial_Java_SE_10_Entrada_de_Datos {
    public static void main (String[] args){
        Scanner input = new Scanner (System.in);
        String nombre ="";
        int edad;
        
        System.out.println("Ingresa tu nombre: ");
        nombre = input.next(); // Si colocamos un espaciado tirara error.
        //nombre = input.nextLine(); // Ya no tirara error.
        System.out.println("Ingresa tu edad: ");
        edad = input.nextInt();
        System.out.println("Tu nombre es: "+nombre+", tu edad es: "+edad);
    }
}
