/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cursose;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author Eduardo
 */
public class Tutorial_Java_SE_48_try_with_resources {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        PrintWriter printer = null; 
        
        // try with resourses, está alternativa que nos brida poder acceder
        // a recursos y que estos recursos sean gestionados internamente por
        // Java.
        
        // En el bloque try vamos a colocar el recurso al que necesitamos
        // acceder  que posteriormente se va a gestionar para la finalización
        try(FileWriter archivo = new FileWriter("F:\\Cursos\\Java\\Curso Java SE\\hola.txt",true)){
            printer = new PrintWriter(archivo);
            for(int i = 1; i<10;i++){
                printer.println(i+".- "+"\nTutorial_Java_SE_48_try_with_resources!!");  
            }
        }catch(Exception e){
            System.out.println("Error: "+e.getMessage());
        }
        // Está parte del finally ya se gestionaria de forma aútomatica
        // porque se gestionaria el archivo y en este caso se cerraria de forma
        // automática.
//        finally{
//            if(archivo != null) {
//                archivo.close();
//            }
//        }
    }
    
}
