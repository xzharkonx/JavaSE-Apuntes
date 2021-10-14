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
public class Tutorial_Java_SE_24_Programacion_Orientada_a_Objetos {
    public static void main (String[] args){
        celular tablet = new celular("Asus","Negra");//Obreto llamado tablet
        tablet.llamando();
        celular celular1 = new celular("Zte-lite","Morado");//Objeto llamado 
        //celular1
        celular1.llamando();
        celular celular3 = new celular("Zte","Blanco");//Objeto llamado celular3
        celular3.llamandoEspecial(celular1);
        celular3.llamandoEspecial(new celular("Huawei","Black"));
    }
}
