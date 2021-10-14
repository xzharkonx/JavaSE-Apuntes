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
public class Tutorial_Java_SE_12_Ciclo_For {
    public static void main (String[] args){
        String[] array ={"Facebook","Youtube","Twitter"};
        for(int i = 0;i<array.length;i++){
            System.out.println("Red social "+i+".- "+array[i]);
        }
        for( String s :array){
            System.out.println("Red social "+s);
        }
        
        
        // 10
        int x=0;
        for (int i = 0; i> -11; i--) {
            
            System.out.println("------------------------------------");
            System.out.println("i1: "+i);
            System.out.println("x1: "+x);
            System.out.println("---------");
            // Da valor positivo porque i = -1, entonces se invierte el valor
            // con el - antepuesto, por eso es positivo.
            //x=-i;
            // Da valor negativo porque i = -1, entonces 
            x=i;
            System.out.println("i2: "+i);
            System.out.println("x2: "+x);
        }
        System.out.println(x);
      
    }
}
