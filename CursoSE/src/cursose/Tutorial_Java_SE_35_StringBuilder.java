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
public class Tutorial_Java_SE_35_StringBuilder {
    public static void main (String... args){
      String texto = "hola";
    texto +=" luis"+" eduardo";
    System.out.println(texto);   
    
    StringBuilder textoBuilder = new StringBuilder();
    textoBuilder.append("Hola ").append(" Eduardo");
    
    System.out.println(textoBuilder.toString());

    System.out.println("--------Concatenacion con Builder---------------------");
    
    long tiempo_inicio = System.nanoTime(); // Tiempo en nanosegundos.
   // long tiempo_inicio = System.currentTimeMillis(); // Tiempo en milisegundos.
    
    
    StringBuilder builder = new StringBuilder();
    
    for(int i = 0 ; i < 1000; i++){
        builder.append(i);
    }
    
    long tiempo_fin = System.nanoTime();
    // long tiempo_fin = System.currentTimeMillis(); // Tiempo en milisegundos.
    
    double diferiencia = tiempo_fin - tiempo_inicio;
    
    System.out.println(diferiencia);
    
     System.out.println("-----Concatenacion con Texto normal--------------------");
    
    long tiempo_inicio2 = System.nanoTime();
    // long tiempo_inicio2 = System.currentTimeMillis(); // Tiempo en milisegundos.
    
    String texto2 = "";
    
    for(int i = 0 ; i < 1000; i++){
        texto2 += i;
    }
    
    long tiempo_fin2 = System.nanoTime();
    // long tiempo_fin2 = System.currentTimeMillis(); // Tiempo en milisegundos.
    
    double diferiencia2 = tiempo_fin2 - tiempo_inicio2;
    System.out.println(diferiencia2);
    }
   
}
