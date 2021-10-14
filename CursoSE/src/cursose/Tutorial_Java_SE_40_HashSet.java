/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cursose;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Eduardo
 */
public class Tutorial_Java_SE_40_HashSet {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            Set<String> lista = new HashSet<String>();
            lista.add("a");
            lista.add("b");
            lista.add("c");
            lista.add("a");
            lista.add("b");
            lista.add("e");
            lista.add("d");
            for(String s : lista){
                System.out.println(s);
            }
    }
    
}
