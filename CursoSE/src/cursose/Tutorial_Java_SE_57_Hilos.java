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
public class Tutorial_Java_SE_57_Hilos extends Thread{
    
    private String nombre;
    
    public Tutorial_Java_SE_57_Hilos ()//Constructor
    {     
    }
    public Tutorial_Java_SE_57_Hilos (String nombre)//Constructor 1 parametro
    {
        this.nombre = nombre;
    }
    @Override
    public void run()
    {
        for(int i = 0 ; i <= 1000; i++)
        {
            System.out.println(nombre+" - "+ i);
        }
    }
    
}
