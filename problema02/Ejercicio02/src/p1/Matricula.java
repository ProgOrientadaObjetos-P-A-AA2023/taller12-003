/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p1;

/**
 *
 * @author Usuario
 */
public abstract class Matricula {
    protected double tarifa;
    protected String nombre;

    public double obtenerTarifa() {
        return tarifa;
    }
    
    public String obtenerNombre() {
        return nombre;
    }

    public abstract void establecerTarifa();
    
    public abstract void establecerNombre(String n);
}
