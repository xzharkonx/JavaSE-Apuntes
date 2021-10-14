/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cursose;

import java.io.File;

/**
 *
 * @author Eduardo
 */
public class Tutorial_Java_SE_45_File {
    public static void main(String[] args) throws Exception{
        File archivo = new File("F:\\Cursos\\Java\\Curso Java SE\\hola2.txt");
        // Ver si un archivo existe
        boolean respuesta = archivo.exists();
        System.out.println("Verificar existencia del archivo: "+respuesta);
        
        // Creará un nuevo directorio.
        File nuevoDirectorio = new File("F:\\Cursos\\Java\\Curso Java SE\\java\\");
        respuesta = nuevoDirectorio.mkdir();
        System.out.println("Crear carpeta de archivo: "+respuesta);// Saldrá false si ya existe o ya lo ha creado.
        
        
        // Crear multiples directorios uno dentro de otro.
        File nuevosDirectorios = new File("F:\\Cursos\\Java\\Curso Java SE\\java1\\java2");
        respuesta = nuevosDirectorios.mkdirs();
        System.out.println("Crear carpetas anidadas de archivos: "+respuesta);
        
        // Renombrar el archivo
        File renombrar = new File("F:\\Cursos\\Java\\Curso Java SE\\hola.txt");
        respuesta = renombrar.renameTo(new File("F:\\Cursos\\Java\\Curso Java SE\\hola2.txt"));
        System.out.println("Renombrar archivo, si no existe: "+respuesta);
        
        // Eliminar archivo
        File archivo2 = new File("F:\\Cursos\\Java\\Curso Java SE\\hola2.txt");
        respuesta = archivo2.delete();
        System.out.println("Eliminar archivo "+respuesta);
    }
}
