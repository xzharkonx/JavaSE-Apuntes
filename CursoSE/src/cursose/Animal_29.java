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

// * Declarámos esta clasa com oabstracta 
// * anteponiendo abstract antes de la Clase.

// ? De esta forma solo podrá ser declarada como tipo de variable,
// ? pero no podrá ser instanciada y los métodos 
// ? que declaremos como abstractos solo serán declarados y podrán
// ? ser sobreescritos en las clases que hereden de esta Clase Abstracta.

public abstract class Animal_29 {
    private String nombre;
    private String tipo_alimentacion;
    private int edad;
    String texto = "Hola,luis";
    /*30 Encapsulamiento*/
    private String[] vector = texto.split(",");
    //public Animal(){
        
    //}
    public Animal_29 (String nombre,String tipo_alimentacion,int edad){
        this.nombre = nombre;
        this.tipo_alimentacion = tipo_alimentacion;
        this.edad = edad;
    }
    
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    public String getNombre(){
        return nombre;
    }

    public String getTipo_alimentacion() {
        return tipo_alimentacion;
    }

    public void setTipo_alimentacion(String tipo_alimentacion) {
        this.tipo_alimentacion = tipo_alimentacion;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    public abstract void alimentarse();
    public void moverse(){
        System.out.println("El animal se esta moviendo");
    }
/*30 Encapsulamiento*/
    public String[] getVector() {
        return vector;
    }

    public void setVector(String[] vector) {
        this.vector = vector;
    }
    
   
}
