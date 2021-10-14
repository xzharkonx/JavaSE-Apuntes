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
public class Tutorial_Java_SE_9_Sentencia_if {
    
    public static int operacion(int val){
        return val+1;
    }
    
    public static void main (String[] args){
        int x = 10,y = 20;
        int mayor;
        if(x>y)
            mayor = x;
        else
            mayor = y;
        System.out.println("x: "+x+" y: "+y);
        System.out.println("El numero mayor es: "+mayor);
        x=x+11;
                     //Si - Si no
        mayor = (x>y) ? x : y ;//if en una sola línea
        System.out.println("x: "+x+" y: "+y);
        System.out.println("El numero mayor es: "+mayor);
        
        System.out.println("---------- Otra manera de hacer calculos ------------");
        
        // Creamos el metodo de operación y le pasamos el valor al cual le vamos
        // a sumar 1.
        mayor = (x>y) ? operacion(x) : operacion(y);//if en una sola línea
        System.out.println("x: "+x+" y: "+y);
        System.out.println("El numero mayor es: "+mayor);
        
    }
   
    
}
