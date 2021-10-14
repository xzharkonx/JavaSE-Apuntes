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
public class Tutorial_Java_SE_23_Alcance_de_las_Variables {
    int edad = 24;
    public void edadmayor(){
        int edad = 25;//Nueva variable dentro de otro alcance
        System.out.println("Creciste, tienes: "+edad);
    }
    public void edadnormal(){
        System.out.println("Tu edad actual es: "+edad);
    }
    public static void main (String[] args){
        Tutorial_Java_SE_23_Alcance_de_las_Variables alcance = new Tutorial_Java_SE_23_Alcance_de_las_Variables();
        alcance.edadmayor();
        alcance.edadnormal();
    }
}
