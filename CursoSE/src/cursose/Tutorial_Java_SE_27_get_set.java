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
public class Tutorial_Java_SE_27_get_set {
   public static void main (String[] args){
       celular3_27 cel = new celular3_27();
       cel.setNombre("LG");
       cel.setColor("Negro");
       //cel.setSerie("12345");
       
      String nombre = cel.getNombre(),color = cel.getColor(),serie = cel.getSerie();
      System.out.println("Nombre: "+nombre+"\nColor: "+color+"\nSerie: "+serie);
       
   }
}
