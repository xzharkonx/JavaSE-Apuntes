/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cursose;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Eduardo
 */
public class Tutorial_Java_SE_46_Lectura_de_Archivos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        // Hay que tener en cuenta que cuando estamos hablando de archivos y la lectura de estos,
        // debemos pensar en que tipo de archivo es.
        // Si estamos leyendo una imágen por ejemplo es muy común que se encuentre guardada
        // en una base de datos o en un repositorio en formato de bytes y para este tipo
        // de lecturas quiza convenga más una de tipo Stream.
        
        //Para este ejemplo veremos un fichero.
        //Utilizamos FileReader
        FileReader archivo = new FileReader("F:\\Cursos\\Java\\Curso Java SE\\hola.txt");
        // Nos va a permitir recorrer el contenido del archivo .txt
        BufferedReader buffer = new BufferedReader(archivo);
        String texto;
        //.readLine() leera linea por línea.
        while((texto = buffer.readLine()) != null){
            System.out.println(texto);
        }
        
        // Ahora utilizando InputStream
        FileInputStream in = new FileInputStream("F:\\Cursos\\Java\\Curso Java SE\\hola.txt");
        //Nos apoyamos de un Scanner
        Scanner sc = new Scanner(in,"UTF-8");
        // Así solo leeremos una línea del archivo.
        //texto = sc.next();
        //System.out.println(texto);
        
        // Para la lectura en Bytes de imagenes.
        //int respuesta = in.read();
        //if (respuesta != -1) {
        //    System.out.println(respuesta);
        //}
        //Comentar lo de abajo para utilizar esto de arriba.
        
        //De otra manerá más segura por si no está el archivo y para
        //poder ver todas las lineas del archivo.
        try{
        while((texto = sc.next()) != null){
            System.out.println(texto);
        }
        }catch(Exception e){
            System.out.println("Error causado: "+e.getMessage());
            
        }finally{
            System.out.println("Termino el ciclo :D");
        }
    }
    
}
