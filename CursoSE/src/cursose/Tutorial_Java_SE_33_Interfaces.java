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
public class Tutorial_Java_SE_33_Interfaces {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Perro_33 per = new Perro_33();
        per.mostrarTipoAnimal();
        
        String nombre = per.nombre();
        System.out.println(nombre);
        
        // per.vida();
        
        
        // ! Ahora definiremos la variable con el tipo de la interfaz.
        // * Mira que pasandole distintas instancias cambiará nuestro resultado.
        
        SerVivo_33 ser1 = new Perro_33();
        ser1.vida(); // 100% de vida
        ser1 = new Perro_33_MedioVivo();
        ser1.vida(); // Estoy a medio vida =/
        
        
        Animal_33 a = new Perro_33();
        System.out.println(a.nombre());
        a.mostrarTipoAnimal();
        
    }
    
}
