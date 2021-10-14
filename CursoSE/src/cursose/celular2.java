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
public class celular2 {
    String marca;
    String color;
    public celular2(){
        System.out.println("Hola soy un contructor default");
    }
    public celular2(String marca){
       this.marca = marca;
       System.out.println("Hola soy un contructor con 1 valor");
       System.out.println("- Marca: "+marca);
    }
    public celular2(String marca,String color){
       this.marca = marca;
       this.color = color;
    }
    public void llamar(String marca){
       System.out.println(marca+" esta llamando..."); 
    }
        public void llamar2(String marca,String color){
       System.out.println(marca+"-"+color+"esta llamando..."); 
    }
}
