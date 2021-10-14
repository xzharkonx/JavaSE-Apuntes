/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import cursose.PersonaDB;
import java.util.List;

/**
 *
 * @author Eduardo
 */
public interface DAOPersona {
    public void registrar(PersonaDB per) throws Exception;
    public void modificar(PersonaDB per) throws Exception;
    public void eliminar(PersonaDB per) throws Exception;
    public List<PersonaDB> listar() throws Exception;
    
}
