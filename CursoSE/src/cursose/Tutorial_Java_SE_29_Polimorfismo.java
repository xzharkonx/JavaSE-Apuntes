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
public class Tutorial_Java_SE_29_Polimorfismo {
    public static void main(String[] args){
        
        Animal_29 p = new Perro_29("Lobo","Carnivoro",1,"Electrico");
        p.alimentarse();
        
        // ! No puedo acceder a los métodos propios 
        // ! de la Clase Perro como mostrar().
        
        // ? Ya que mi objeto es de tipo Animal, 
        // ? por ello solo toma los recursos de esta clase Abstracta.
        
        System.out.println(p.getNombre());
        p.setNombre("Pompeo");
        System.out.println("Me cambie el nombre a: "+p.getNombre());
        
        Animal_29 c = new Caballo_29("Helios","Hervivoro",1);
        c.alimentarse();
        
        p.moverse();
        c.moverse();
        
        /*30 Encapsulamiento*/
       for(int i = 0; i<p.getVector().length;i++){
           System.out.println(i+".- "+p.getVector()[i]);
       }
       
       for (String s : p.getVector()) {
           System.out.println(s);
       }           
        
    }
    
   
}
