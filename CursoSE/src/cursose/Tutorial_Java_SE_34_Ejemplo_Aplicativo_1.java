/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cursose;

import java.util.Scanner;

/**
 *
 * @author Eduardo
 */
public class Tutorial_Java_SE_34_Ejemplo_Aplicativo_1 {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Bienvenido al banco");
        System.out.println("Favor de ingresar su numero de cuenta: ");
        int cuenta = sc.nextInt();
        Banco banco = new Banco();
        String opcion = "";
        double monto;
        switch(cuenta){
            case 1:
                System.out.println("Bienvenido al banco "+banco.per1.getNombre());
                System.out.println("Ingresa A para depositar o B para retirar");
                opcion = sc.next();
                switch(opcion){
                    case "A":
                        System.out.println("Ingresa el monto a depositar: ");
                        monto = sc.nextDouble();
                        //System.out.println("Su saldo total es: "+banco.per1.depositarDinero(banco.per1, monto).getMonto());
                        System.out.println("Su saldo total es: "+banco.depositarDinero(banco.per1, monto).getMonto());
                        break;
                    case "B":
                        System.out.println("Ingresa el monto a retirar: ");
                        monto = sc.nextDouble();
                        //System.out.println("Su saldo total es: "+banco.per1.retirarDinero(banco.per1, monto).getMonto());
                        System.out.println("Su saldo total es: "+banco.retirarDinero(banco.per1, monto).getMonto());
                        break;
                    default:
                        System.out.println("Opcion incorrecta, saliendo...");
                        System.exit(0);
                }
                break;
            case 2:
                System.out.println("Bienvenido al banco "+banco.per2.getNombre());
                System.out.println("Ingresa A para depositar o B para retirar");
                opcion = sc.next();
                switch(opcion){
                    case "A":
                        System.out.println("Ingresa el monto a depositar: ");
                        monto = sc.nextDouble();
                        //System.out.println("Su saldo total es: "+banco.per2.depositarDinero(banco.per2, monto).getMonto());
                        System.out.println("Su saldo total es: "+banco.depositarDinero(banco.per2, monto).getMonto());
                        break;
                    case "B":
                        System.out.println("Ingresa el monto a retirar: ");
                        monto = sc.nextDouble();
                        //System.out.println("Su saldo total es: "+banco.per2.retirarDinero(banco.per2, monto).getMonto());
                        System.out.println("Su saldo total es: "+banco.retirarDinero(banco.per2, monto).getMonto());
                        break;
                    default:
                        System.out.println("Opcion incorrecta, saliendo...");
                        System.exit(0);
                }
                break;
            case 3:
                System.out.println("Bienvenido al banco "+banco.per3.getNombre());
                System.out.println("Ingresa A para depositar o B para retirar");
                opcion = sc.next();
                switch(opcion){
                    case "A":
                        System.out.println("Ingresa el monto a depositar: ");
                        monto = sc.nextDouble();
                        //System.out.println("Su saldo total es: "+banco.per3.depositarDinero(banco.per3, monto).getMonto());
                        System.out.println("Su saldo total es: "+banco.depositarDinero(banco.per3, monto).getMonto());
                        break;
                    case "B":
                        System.out.println("Ingresa el monto a retirar: ");
                        monto = sc.nextDouble();
                        //System.out.println("Su saldo total es: "+banco.per3.retirarDinero(banco.per3, monto).getMonto());
                        System.out.println("Su saldo total es: "+banco.retirarDinero(banco.per3, monto).getMonto());
                        break;
                    default:
                        System.out.println("Opcion incorrecta, saliendo...");
                        System.exit(0);
                }
                break;
            default:
                System.out.println("No se encontro la cuenta");
                System.exit(0);
        }
        System.out.println("El saldo total de todos los clientes es: "+(banco.per1.getMonto()+banco.per2.getMonto()+banco.per3.getMonto()));
        
    }
    
}
