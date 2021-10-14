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
public class Tutorial_Java_SE_41_Excepciones {

    /**
     * @param args the command line arguments
     */
    private void division (){
        int a = 7;
        int b = 0;
        int divicion = a/b;
        System.out.println(divicion);
    }
    public static void main(String[] args) {
        try{
            Tutorial_Java_SE_41_Excepciones divicion = new Tutorial_Java_SE_41_Excepciones();
            divicion.division();
        }catch(Exception e){
            System.out.println("El error es: "+e);
        }finally{
            System.out.println("Eso es todo");
        }
        
        
        // Opciones sobre como poner try catch finall
        ////////////////////// FORMA Original
        try{
            // Proceso 1
            
        }catch(Exception e){
            // Manejo de la excepcion
        }finally{
            // se ejecuta sí o sí
        }
        
        ////////////////////// FORMA 1
        try{
            
        }finally{
            
        }
        
        ////////////////////// FORMA 2
        try{
            
        }catch(Exception e){
            
        }
        
    }
    
}
