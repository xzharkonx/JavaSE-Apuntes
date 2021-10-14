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
public class Banco {
    Persona_34 per1;
    Persona_34 per2;
    Persona_34 per3;
    public Banco(){
        per1 = new Persona_34();
        per1.setCuenta(1);
        per1.setNombre("Luis");
        per1.setMonto(1000);
        
        per2 = new Persona_34();
        per2.setCuenta(2);
        per2.setNombre("Eduardo");
        per2.setMonto(2000);
        
        per3 = new Persona_34();
        per3.setCuenta(3);
        per3.setNombre("zharkon");
        per3.setMonto(3000);
        
    }

    public Persona_34 getPer1() {
        return per1;
    }

    public void setPer1(Persona_34 per1) {
        this.per1 = per1;
    }

    public Persona_34 getPer2() {
        return per2;
    }

    public void setPer2(Persona_34 per2) {
        this.per2 = per2;
    }

    public Persona_34 getPer3() {
        return per3;
    }

    public void setPer3(Persona_34 per3) {
        this.per3 = per3;
    }
    
    public void montoDeposito(Persona_34 per,double monto){
        
    }
    
     public Persona_34 depositarDinero(Persona_34 persona, double monto) {
        persona.setMonto(monto + persona.getMonto());
        return persona;
    }
     
    public Persona_34 retirarDinero(Persona_34 persona, double monto) {
        persona.setMonto(persona.getMonto()- monto);
        return persona;
    }
}
