/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cursose;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Eduardo
 */
public class Tutorial_Java_SE_37_ArrayList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List lista = new ArrayList();//Lista sin tamaño declarado es mas lenta
        //Para listas enormes
        long inicio1 = System.currentTimeMillis();//Tiempo de inicio
        for(int i = 0 ;i < 100000;i++){
            lista.add(i);
        }
        long fin1 = System.currentTimeMillis();//Tiempo fin
        System.out.println(fin1-inicio1);//Calculo del tiempo en que tardó en ejecutase
          
        List lista2 = new ArrayList(100000);//Lista con tamaño declarado es más rapido
        long inicio2 = System.currentTimeMillis();
        for(int i = 0 ;i < 100000;i++){
            lista2.add(i);
        }
        long fin2 = System.currentTimeMillis();
        System.out.println("---------------------");
        System.out.println(fin2-inicio2);
    }
    
}
