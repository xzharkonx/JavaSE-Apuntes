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
public class Persona_34 {
    private int cuenta;
    private String nombre;
    private double monto;

    public int getCuenta() {
        return cuenta;
    }

    public void setCuenta(int cuenta) {
        this.cuenta = cuenta;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public double getMonto() {
        return monto;
    }
    public void setMonto(double monto) {
        this.monto = monto;
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
