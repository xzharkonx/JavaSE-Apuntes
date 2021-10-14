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
public class Perro_29 extends Animal_29{
      private String raza;
    
    public Perro_29 (String nombre,String tipo_alimentacion,int edad, String raza){
    super(nombre,tipo_alimentacion,edad);
    this.raza = raza;
}
    
    public void setRaza(String raza){
        this.raza = raza;
    }
    public String getRaza(){
        return raza;
    }
    public void mostrar(){
        System.out.println("Nombre: "+getNombre()+"\nTipo de alimentación: "+getTipo_alimentacion()+"\nRaza: "+getRaza());
    }

    @Override
    public void alimentarse() {
      System.out.println("Me alimento de carne");
    }
    
}
