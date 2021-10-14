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
//Extendemos de la clase Exception
public class EdadException extends Exception{
    //Creamos un constructor donde le pasamos el mensaje.
    public EdadException (String mensaje){
        super(mensaje);
    }
}
