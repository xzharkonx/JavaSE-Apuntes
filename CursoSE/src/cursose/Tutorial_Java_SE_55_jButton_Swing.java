/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cursose;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Eduardo
 */
public class Tutorial_Java_SE_55_jButton_Swing {
    public static void main (String[] args)
    {
        
     JOptionPane.showMessageDialog(null, "Mover la ventana para que\n se vean los botones.");
        
     JFrame ventana = new JFrame("Hola");
        ventana.setSize(300,200);
        ventana.setVisible(true);
        JPanel panel = new JPanel();
       // panel.setVisible(true);
        JButton boton = new JButton("Hola");
        //boton.setVisible(true);
                panel.add(boton);
        JButton botonSalir = new JButton("Salir");
       // salir.setVisible(true);
        panel.add(botonSalir);
        ventana.add(panel);
        
        ventana.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);//Para que la 
        //Ventana se cierre correctamente
        
        boton.addActionListener(new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e){
            String captura = JOptionPane.showInputDialog(null, "Ingrese nombre");
            JOptionPane.showMessageDialog(null, captura);
        }
        });
        
        botonSalir.addActionListener(new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e){
            ventana.dispatchEvent(new WindowEvent(ventana,WindowEvent.WINDOW_CLOSING));
        }
        });
    }
}
