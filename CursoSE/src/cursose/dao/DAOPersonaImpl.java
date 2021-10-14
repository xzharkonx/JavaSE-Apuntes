/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cursose.dao;

import cursose.PersonaDB;
import interfaces.DAOPersona;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Eduardo
 */
public class DAOPersonaImpl extends conexion implements DAOPersona {

    @Override
    public void registrar(PersonaDB per) throws Exception {
     try{
        this.conectar();
         PreparedStatement st = this.conexion.prepareStatement("INSERT INTO PERSONA (nombre) values (?)");
         st.setString(1, per.getNombre());
         st.executeUpdate();
         st.close();
     }catch(Exception e){
         throw e;
     }finally{
         this.cerrar();
     }
    }

    @Override
    public void modificar(PersonaDB per) throws Exception {
       try{
        this.conectar();
         PreparedStatement st = this.conexion.prepareStatement("UPDATE PERSONA SET nombre = ? WHERE id = ?");
         st.setString(1, per.getNombre());
         st.setInt(2, per.getId());
         st.executeUpdate();
         st.close();
     }catch(Exception e){
         throw e;
     }finally{
         this.cerrar();
     }    
    }

    @Override
    public void eliminar(PersonaDB per) throws Exception {
       try{
        this.conectar();
         PreparedStatement st = this.conexion.prepareStatement("DELETE FROM PERSONA WHERE nombre = ?");
         st.setString(1, per.getNombre());
         st.executeUpdate();
         st.close();
     }catch(Exception e){
         throw e;
     }finally{
         this.cerrar();
     }    
    }

    @Override
    public List<PersonaDB> listar() throws Exception {
        List<PersonaDB> listar = null;
        try{
            this.conectar();
            PreparedStatement st = this.conexion.prepareStatement("SELECT * FROM PERSONA");
            ResultSet rs = st.executeQuery();
            listar = new  ArrayList();
            while(rs.next()){
                PersonaDB per = new PersonaDB();
                per.setId(rs.getInt("id"));
                per.setNombre(rs.getString("nombre"));
                listar.add(per);
                
            }
            rs.close();
            st.close();
            
        }catch(Exception e){
            e.getMessage();
        }finally{
            this.cerrar();
        }
        return listar;
    }
    
}
