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
public class Persona {
    private  String nombre;
    private  int edad;
    //private static String nombre;
    //private static int edad;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    public void mostrarDeInstancia(){
        System.out.println("Método de instancia");
        System.out.println("Nombre: "+this.nombre+"\nEdad: "+this.edad);
    }
    
    public static void mostrarDeClase(){
        // Se pueden definir las variables como estáticas, static.
        
        // Las variables que son estáticas no pueden ser referenciadas en un 
        //contexto estatico:
        //System.out.println(this.nombre + ", "+ this.edad);
        // o esta otra, dentro del objeto:
        //System.out.println(nombre + ", "+ edad);
        
        System.out.println("Método de clase");
    }
}
