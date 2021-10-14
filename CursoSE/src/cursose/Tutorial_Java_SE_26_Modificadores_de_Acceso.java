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
public class Tutorial_Java_SE_26_Modificadores_de_Acceso {
    public static void main (String[] args){
          //Llamado de la clase con el constructor default
        celular3 ce = new celular3();
        
        System.out.println("Marca: "+ce.marca);
        //Llamado de la clase con 1 valor en el constructor
        celular3 ce3 = new celular3("Samsung");
        ce3.llamar("Sonic");
        //Llamado de la clase con 2 valores en el constructor
        ce3.llamar2("Zte", "Blanco");
    }
    
}
