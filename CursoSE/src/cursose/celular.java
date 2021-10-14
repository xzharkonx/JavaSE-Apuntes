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
public class celular {
    String marca;
    String color;
    public celular (String marca, String color){
        this.marca = marca;
        this.color = color;
    }
    public void llamando(){
        System.out.println(marca+"-"+color+" esta llamando...");
    }
    public void llamandoEspecial(celular cel){
        System.out.println(cel.marca+"-"+cel.color+" esta llamando...");
    }
}
