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
public class Tutorial_Java_SE_42_Jerarquia_de_Excepciones {

    private void division (){
        int a = 7;
        int b = 0;
        int divicion = a/b;
        System.out.println(divicion);
    }
    public static void main(String[] args) {
        try{
            Tutorial_Java_SE_42_Jerarquia_de_Excepciones divicion = new Tutorial_Java_SE_42_Jerarquia_de_Excepciones();
            divicion.division();
        }catch(NullPointerException e){
            System.out.println("El error es: "+e);
        }catch(ArithmeticException e){
          System.out.println("El error es: "+e);
        }catch(Exception e){
            System.out.println("El error es: "+e);
        }finally{
            System.out.println("Eso es todo");
        }
    }
    
}
