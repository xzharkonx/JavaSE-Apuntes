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
public class Tutorial_Java_SE_31_Metodos_de_Instancia_y_Metodos_de_Clase_static {
    public static void main (String[] args){
    
        Persona per = new Persona();
        per.setNombre("Luis");   
        per.setEdad(25);
        per.mostrarDeInstancia();
        System.out.println("--------------");
        Persona.mostrarDeClase();
    }

}
