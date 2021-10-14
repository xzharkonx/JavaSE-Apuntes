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
public class CursoSE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       /* String x = "99";
        int y = Integer.parseInt(x) + 1;
        System.out.println("Hola Luis, la suma es:");
        System.out.print(y);*/
       
       Tutorial_Java_SE_57_Hilos  hilo1 = new Tutorial_Java_SE_57_Hilos("Hilo 1");
       hilo1.start();
       Tutorial_Java_SE_57_Hilos  hilo2 = new Tutorial_Java_SE_57_Hilos("Hilo 2");
       hilo2.start();
    }
    
}
