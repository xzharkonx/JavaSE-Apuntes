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
public class Tutorial_Java_SE_21_Clases {
    private String nombre;
    private int edad;
    
    public void saludar(){
        nombre = "Luis";
        edad = 24;
        System.out.println("Hola "+nombre);
        System.out.println("Edad "+edad);
    }
    public static void main (String[] args){
       Tutorial_Java_SE_21_Clases saludo = new Tutorial_Java_SE_21_Clases();
       saludo.saludar();
    }
}
