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
public class CursoSEchar {
    public static void main(String[] args){
    
    
    //Solo puedes almacenar un caracter en particular.
    //Si colocamos:
    //char car = "A"; 
    //Nos dará error porque la 
    //doble comilla está reservada 
    //para vatiables de tipo String.
    //
    //Por lo que lo hacemos solo con estas comillas ''.
    char car;
        car = 'A';
    System.out.println(car);
    
    //Otra forma instanciando por medio de una clase Wrapper, en este
    //caso Character.
    //Character car = new Character('A'); 
    //Character car //otra forma clase Wrapper
    //Está forna no es tan convencional
    
    
    //Secuencia de escape con \
    //Una forma especial donde nosotros podemos decirle al lenguaje que si o si
    //tenemos que imprimir esa letra/caracter en nuestra pantalla.
    System.out.println("Hola \t\"Mundo\" !!!");
    
    //\n: salto de línea
    //\t: tabulador.
    //\caracter: Escapamos el caracter
    
    }
 
       
}
