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
public class Tutorial_Java_SE_47_Escritura_de_Archivos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // Declaramos las variables
        FileWriter archivo = null;
        PrintWriter printer = null; 
        
        // Se coloca un try por si hay errores como de que no se pueda crear 
        // el archivo.
        try{
                // Cargamos el arhivo y le colocamos true para indicarle que el 
                // archivo = new FileWriter("F:\\Cursos\\Java\\Curso Java SE\\hola.txt");
                // arhivo ya existe (porque si no lo recreará desde 0).

                archivo = new FileWriter("F:\\Cursos\\Java\\Curso Java SE\\hola.txt",true);
                printer = new PrintWriter(archivo);
                // Insertamos nuestro contenido.
                for(int i = 1; i<101;i++){
                    printer.println(i+".- "+"\nKonichiwa!!");  
                }
            }catch(Exception e){
                System.out.println("ErrorCatch - No se encuentra la ruta del archivo");
            }finally{
                if(archivo != null) {
                    archivo.close();
                }
            }
        }
    
}
