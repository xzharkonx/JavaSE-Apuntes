/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cursose;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Eduardo
 */
public class Tutorial_Java_SE_38_LinkedList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        
        List lista = new ArrayList();//Lista con tamaño declarado es más rapido
                //Para listas enormes y más rapides con el metodo get
        long inicio1 = System.currentTimeMillis();//Tiempo de inicio
        for(int i = 0 ;i < 10000;i++){
            lista.add(i);
        }
        long fin1 = System.currentTimeMillis();//Tiempo fin
        System.out.println("ArrayList add: "+(fin1-inicio1));//Calculo del tiempo en que tardó en ejecutase
        
        List lista2 = new LinkedList();//Lista LinkedList
                //Para más rapides con listas en metodos add y remove
        long inicio2 = System.currentTimeMillis();//Tiempo de inicio
        for(int i = 0 ;i < 10000;i++){
            lista2.add(i);
        }
        long fin2 = System.currentTimeMillis();//Tiempo fin
        System.out.println("LinkedList add: "+(fin2-inicio2));//Calculo del tiempo en que tardó en ejecutase
        
        System.out.println("---------------------------------");

        long inicio3 = System.currentTimeMillis();//Tiempo de inicio
        for(int i = 0 ;i < 10000;i++){
            lista.get(i);
        }
        long fin3 = System.currentTimeMillis();//Tiempo fin
        System.out.println("ArrayList get: "+(fin3-inicio3));//Calculo del tiempo en que tardó en ejecutase
        
        long inicio4 = System.currentTimeMillis();//Tiempo de inicio
        for(int i = 0 ;i < 10000;i++){
            lista2.get(i);
        }
        long fin4 = System.currentTimeMillis();//Tiempo fin
        System.out.println("LinkedList get: "+(fin4-inicio4));//Calculo del tiempo en que tardó en ejecutase
        
        System.out.println("---------------------------------");
        
        long inicio5 = System.currentTimeMillis();//Tiempo de inicio
        for(int i = 9999 ;i > 0;i--){
            lista.remove(i);
        }
        long fin5 = System.currentTimeMillis();//Tiempo fin
        System.out.println("ArrayList remove: "+(fin5-inicio5));//Calculo del tiempo en que tardó en ejecutase
        
        long inicio6 = System.currentTimeMillis();//Tiempo de inicio
        for(int i = 9999 ;i > 0;i--){
            lista2.remove(i);
        }
        long fin6 = System.currentTimeMillis();//Tiempo fin
        System.out.println("LinkedList remove: "+(fin6-inicio6));//Calculo del tiempo en que tardó en ejecutase
        
    }
    
}
