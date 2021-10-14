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
public class Tutorial_Java_SE_43_throw_y_throws {

    private void metodo1(){
        try{
        metodo2();
        }catch(Exception e){
            System.out.println("Error: "+e.getMessage());
        }
    }
    private void metodo2() throws Exception{
        try{
            metodo3();
        }catch(Exception e){
            throw e;
        }
    }
     private void metodo3() throws Exception{
        try{
            int x = 1 / 0;
        }catch(Exception e){
            throw e;
        }
    }
    public static void main(String[] args) {
        
        Tutorial_Java_SE_43_throw_y_throws throw1 = new Tutorial_Java_SE_43_throw_y_throws();
        throw1.metodo1();
    }
    
}
