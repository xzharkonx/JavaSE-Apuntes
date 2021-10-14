/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cursose2;

import cursose.celular3;

/**
 *
 * @author Eduardo
 */
public class CursoSE2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        celular3 cel = new celular3();
        String marca = cel.marca;
        //no se puede declarar cel.fecha por que es de acceso package
        //no se puede declarar cel.color por que es de acceso private
        System.out.println("Marca "+marca);//El valor de marca es null porque
        //No se le a asignado ningún valor
        
    }
    
}
