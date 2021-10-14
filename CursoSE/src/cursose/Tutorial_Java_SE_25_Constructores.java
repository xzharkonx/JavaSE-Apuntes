/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cursose;

/**
 *
 * @author Eduardo
 */
public class Tutorial_Java_SE_25_Constructores {
    public static void main (String[] args){
        //Llamado de la clase con el constructor default
        celular2 ce = new celular2();
        //Llamado de la clase con 1 valor en el constructor
        celular2 ce2 = new celular2("Samsung");
        System.out.println("---------------");
        ce2.llamar("Sonic");
        //Llamado de la clase con 2 valores en el constructor
        ce2.llamar2("Zte", "Blanco");
    }
}
