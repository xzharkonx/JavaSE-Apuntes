/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cursose;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author Eduardo
 */
public class Tutorial_Java_SE_36_Colecciones_mas_Iterador {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Persona_34 per1 = new Persona_34();
        per1.setNombre("Luis");
        per1.setMonto(1000);
        per1.setCuenta(1);
        
        Persona_34 per2 = new Persona_34();
        per2.setNombre("Eduardo");
        per2.setMonto(2000);
        per2.setCuenta(2);
        
        Persona_34 per3 = new Persona_34();
        per3.setNombre("Garcia");
        per3.setMonto(3000);
        per3.setCuenta(3);
        
        List<Persona_34> lista = new ArrayList();
        lista.add(per1);
        lista.add(per2);
        lista.add(per3);
        for(Persona_34 per : lista){
            System.out.println("Nombre: "+per.getNombre()+", Monto: "+per.getMonto());
        }
        Iterator<Persona_34> iterador = lista.iterator();
        int No=0;//Numerador
        while (iterador.hasNext()){
            No++;
             System.out.println(No+".- "+iterador.next().getNombre());
        }
    }
    
}
