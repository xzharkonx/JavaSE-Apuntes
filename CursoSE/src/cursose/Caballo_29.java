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
public class Caballo_29 extends Animal_29 {
    
    public Caballo_29(String nombre,String tipo_alimentacion,int edad){
        super(nombre,tipo_alimentacion,edad);
    }
    
    @Override
    public void alimentarse() {
      System.out.println("Me alimento de hiervas");
    }
}
