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
public class Tutorial_Java_SE_6_Numeros {
    public static void main (String[] args){
        // Declarar tipos de datos así es un poco engorroso
        Number x = new Integer("9");
        Number y = new Integer(96);
        
        System.out.println(x);
        System.out.println(y);
        
        // Utilizando datos prmitivos
        
        String x1 = "99";
        int y1 = 1;
        
        // Cambiamos con Integer.parseInt(valor_String) de String a número.
        int suma = Integer.parseInt(x1) + y1;
        System.out.println("La suma es: "+suma+"\n");
    }
}
