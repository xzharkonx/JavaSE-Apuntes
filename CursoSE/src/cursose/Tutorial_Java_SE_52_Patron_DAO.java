/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cursose;

import cursose.dao.DAOPersonaImpl;
import interfaces.DAOPersona;



/**
 *
 * @author Eduardo
 */
public class Tutorial_Java_SE_52_Patron_DAO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    PersonaDB per = new PersonaDB();
    per.setId(16);
    per.setNombre("zoro");
    
    try{
        DAOPersona persona = new DAOPersonaImpl();
        persona.eliminar(per);
    }catch(Exception e){
        e.getMessage();
    }
    
     try{
        DAOPersona persona = new DAOPersonaImpl();
        persona.registrar(per);
    }catch(Exception e){
        e.getMessage();
    }
     
     try{
        DAOPersona persona = new DAOPersonaImpl();
        persona.modificar(per);
    }catch(Exception e){
        e.getMessage();
    }    
    
    
    
    try{
        DAOPersona dao = new DAOPersonaImpl();
        for(PersonaDB persona : dao.listar() ){
            System.out.println(persona.getId()+"-"+persona.getNombre());
        }
    }catch(Exception e){
        e.getMessage();
    }
        
    }
    
}
