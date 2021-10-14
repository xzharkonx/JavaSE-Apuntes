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
public class celular3 {
    public String marca; //Modificador de acceso publico,
    //se accede desde cualquier parte a esta variable
    
    private String color;//Modificador de acceso privado,
    //solo se accesa de forma especial
    protected String serie;//Modificador de acceso protegido,
    //solo se accesa mediante la herencia a estas variables
    String fecha;//Modificador de acceso package (default),
    //A estras variables solo se les puede acceder dentro del paquete
    public celular3(){
        System.out.println("Hola soy un contructor default");
    }
    public celular3(String marca){
       this.marca = marca;
    }
    public celular3(String marca,String color){
       this.marca = marca;
       this.color = color;
    }
    public void llamar(String marca){
       System.out.println(marca+"esta llamando..."); 
    }
        public void llamar2(String marca,String color){
       System.out.println(marca+"-"+color+"esta llamando..."); 
    }
}
