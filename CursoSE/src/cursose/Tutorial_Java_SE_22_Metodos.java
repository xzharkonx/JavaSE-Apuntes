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
public class Tutorial_Java_SE_22_Metodos {
    private String nombre;
    private int edad;
    
    public void saludar(String nombre,int edad){//Método llamado saludar
        
        System.out.println("Hola "+nombre);
        System.out.println("Edad "+edad);
    }
     public void despedir(String nombre,int edad){//Método llamado despedir
        
        System.out.println("Adios "+nombre);
        System.out.println("Edad "+edad);
    }
     public String saludar_retorno(String nombre,int edad){
         return nombre + edad;
     }
    public static void main (String[] args){
       Tutorial_Java_SE_22_Metodos saludo = new Tutorial_Java_SE_22_Metodos();
       saludo.saludar("Eduardo",24);
       saludo.despedir("Luis",23);
       String saludar = saludo.saludar_retorno("Luis Eduardo ",25);
       System.out.println("Los valores son: "+ saludar);
    }
}
