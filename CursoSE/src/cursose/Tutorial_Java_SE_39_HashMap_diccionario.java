/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cursose;

import java.util.HashMap;

/**
 *
 * @author Eduardo
 */
public class Tutorial_Java_SE_39_HashMap_diccionario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        HashMap diccionario = new HashMap();
        diccionario.put("usuario", "Luis");
        diccionario.put("java", "SE");
        String valor = diccionario.get("usuario").toString();
        System.out.println(valor);
        boolean respuesta =  diccionario.containsKey("java");
        System.out.println(respuesta);
        
    }
    
}
