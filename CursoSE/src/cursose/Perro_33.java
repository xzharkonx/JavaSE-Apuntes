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
public class Perro_33 implements Animal_33, SerVivo_33{

    @Override
    public void mostrarTipoAnimal() {
       System.out.println("Soy un mamifero");
    }

    @Override
    public String nombre() {
       return "Lobo";
    }

    @Override
    public void vida() {
        System.out.println("Estoy 100% Vivo!!");
    }
    
    @Override
    public void energia() {
        System.out.println("Estoy 100% de energia =/!!");
    }
    
}
