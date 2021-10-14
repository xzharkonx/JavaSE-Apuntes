
import java.io.File;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Eduardo
 */
public class Tutorial_Java_SE_45_File {
    public static void main(String[] args){
           //File archivo = new File("C:\\Users\\Eduardo\\Cursos\\Java\\Curso Java SE\\hola");
            //File archivo = new File("C:\\Users\\Eduardo\\Cursos\\Java\\Curso Java SE\\hola\\adios");
           //Crear directorio
           //archivo.mkdir();
           //archivo.mkdirs();//Directorios
           //File archivo = new File("C:\\Users\\Eduardo\\Cursos\\Java\\Curso Java SE\\hola.txt");          
           //archivo.exists()
           //Si el archivo existe
           //File archivo = new File("C:\\Users\\Eduardo\\Cursos\\Java\\Curso Java SE\\hola.txt");          
           //archivo.renameTo(new File("C:\\Users\\Eduardo\\Cursos\\Java\\Curso Java SE\\hola_jeje.txt"))
           //renombrar archivos
           File archivo = new File("C:\\Users\\Eduardo\\Cursos\\Java\\Curso Java SE\\hola_jeje.txt");          
           //archivo.delete()
           //Eliminar archivo
           System.out.println(archivo.delete()); 
    }
}
