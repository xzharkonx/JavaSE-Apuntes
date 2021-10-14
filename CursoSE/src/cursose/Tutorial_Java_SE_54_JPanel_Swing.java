/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cursose;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Eduardo
 */
public class Tutorial_Java_SE_54_JPanel_Swing {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        JFrame ventana = new JFrame("Hola");
        ventana.setSize(300,200);
        ventana.setVisible(true);
        JPanel panel = new JPanel();
       // panel.setVisible(true);
        JButton boton = new JButton("Hola");
        //boton.setVisible(true);
                panel.add(boton);
        JButton salir = new JButton("Salir");
       // salir.setVisible(true);
        panel.add(salir);
        ventana.add(panel);
    }
    
}
