/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete03;

import java.util.ArrayList;
import paquete01.Televisor;

/**
 *
 * @author reroes
 */
public class VentasTvs {
    double precioTotal;
    double tvCaro;
    String marcaTvCaro;
    ArrayList<Televisor> televisores;
    String marcasVendidas;
    
    public void establecerTelevisores(ArrayList<Televisor> t){
        televisores = t;
    }
    
    public ArrayList<Televisor> obtenerTelevisores(){
        return televisores;
    }
    
    public void establecerPrecioTotal(){
        double s = 0;
        for (int i = 0; i < televisores.size(); i++) {
            s = s + televisores.get(i).obtenerPrecio();
            
        }
        precioTotal = s;        
    }
    
    public double obtenerPrecioTotal(){
        return precioTotal;
    }
    
    public void establecerMarcasVendidas(){
        marcasVendidas = "";
        for(int i=0;i<obtenerTelevisores().size();i++){
            marcasVendidas = String.format("%s[%d] %s\n", 
                    marcasVendidas,i+1,
                    obtenerTelevisores().get(i).obtenerMarca());
        }
    }    
        
    public String obtenerMarcasVendidas(){
        return marcasVendidas;
    }
    
    public void establecerTelevisorMasCaro(){
        double s = obtenerTelevisores().get(0).obtenerPrecio();
        String m = obtenerTelevisores().get(0).obtenerMarca();
        for (int i=0;i<obtenerTelevisores().size();i++) {
            if (s<obtenerTelevisores().get(i).obtenerPrecio()) {
                s = obtenerTelevisores().get(i).obtenerPrecio();
                m = obtenerTelevisores().get(i).obtenerMarca();
            }
        }
        tvCaro = s;
        marcaTvCaro  = m;
    }
    
    public String obtenerMarcasTvCaro(){
        return marcaTvCaro;
    }
    
    public double obtenerTvCaro(){
        return tvCaro;
    }
}
