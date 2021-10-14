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
public class Tutorial_Java_SE_8_Strings {
    public static void main (String[] args){
        //Método charArt: Obteniendo letras de la cadena de texto
        //En la posicion indicada
        String texto1 = "Curso SE";
        char captura = texto1.charAt(0);
        System.out.println("La primera letra de la palabra es:\n"+captura);
        
        //Método compareTo: Comparando 1 cadena de texto
        //con otra, si son iguales devolvera 0, 
        //si no devolvera otro valor:
        // < 0 = Léxicamente menor.
        // 0 = Iguales.
        // > 0 = Léxicamente mayor.
        String texto2 = " OK!";
        int resultado = texto1.compareTo(texto2);//Incorrecto
        System.out.println(resultado);
        
        String texto3 = "Curso SE";
        resultado = texto1.compareTo(texto3);//Correcto
        System.out.println(resultado);
        
        String texto4 = "curso se";//Ignorando mayúsculas o minúsculas
        resultado = texto1.compareToIgnoreCase(texto4);//Correcto
        System.out.println(resultado);
        
        //Método concat: Concatenar texto
        String concatenado = texto1.concat(texto2);
        System.out.println(concatenado);
        
        //Método contains: Si la cadena de texto contiene una letra en especifico
        //Retornara un booleano
        boolean valor = texto1.contains("E");
        System.out.println(valor);
        
        //Método index.Of: Según la letra indicada
        //revelara la posicion de la cadena de texto
        //donde se encuentra esa letra
        //Inprimira -1 si es incorrecto y no se encuentra 
        //en la cadena
        int pos = texto1.indexOf("u");
        System.out.println(pos);
        
        //Con números también...
        String num = "124924";
        int pos2 = num.indexOf("9");
        System.out.println(pos2);
        
        
        //Método substring: Extraer una porción de la cadena
        //a partir a la posicion especificada
        String recorte = texto1.substring(3);
        System.out.println(recorte);
        
        //o bien en un rango de recorte
        String recorte2 = texto1.substring(0,5);
        System.out.println(recorte2);
        
        //Método lentght: Sirve para determinar el tamaño
        //de la cadena de texto
        int cantidad = texto1.length();
        System.out.println(cantidad);
        
        //Agregar más métodos abajo, para estudiar y aprender más
    }
    
}
