/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebas;

import java.sql.Timestamp;
import java.util.Date;



/**
 *
 * @author Eduardo
 */
public class timesTamp {
    public static void main(String[] args){
       Timestamp ts = new Timestamp(new Date().getTime());  
       System.out.print("Tiempo Actual: "+ts);
    }
   
    
}
