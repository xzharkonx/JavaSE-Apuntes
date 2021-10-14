/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cursose;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 *
 * @author Eduardo
 * Investigar el paquete Time
 */
public class Tutorial_Java_SE_32_Manejo_de_Fechas_Date_y_Calendar {
    public static void main (String[] args){
        System.out.println("---Clase Date---------");
        Date anio = new Date();
        int a;
        a = anio.getYear() +1900;
        System.out.println(a);
        System.out.println("---Clase Calendar---------");
        
        //Aquí podemos observar como la Clase Calendar es abstracta y no 
        //se puede instanciar, por eso se ocupa el método de .getInstance();
        //el cual crea una instancia de está clase abstracta y la retorna,
        //Así podemos instanciar las clases abstractas con métodos staticos.
        
        Calendar cal = Calendar.getInstance();
        int cal_anio = cal.get(Calendar.YEAR);
        System.out.println(cal_anio);
        
        
        System.out.println("---Clase Gregorian---------");
        //Puede manejar parametros en el contructor
        //Calendar calG = new GregorianCalendar(2017,Calendar.JANUARY,10);
        Calendar calG = new GregorianCalendar(2020,Calendar.NOVEMBER,1);
        int calGAnio = calG.get(Calendar.YEAR);
        int mes = calG.get(Calendar.MONTH);
        int dia = calG.get(Calendar.DAY_OF_MONTH);
        System.out.println("Anio: "+calGAnio+"\nMes: "+mes+"\nDia: "+dia);
        
        
        
    }
}
