/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete02;

import java.util.ArrayList;
import paquete01.Televisor;
import paquete03.VentasTvs;

/**
 *
 * @author reroes
 */
public class Principal {
    
    public static void main(String[] args) {
       
        Televisor t1 = new Televisor();
        t1.establecerMarca("LG-14 pulgadas");
        t1.establecerPrecio(300.2);

        Televisor t2 = new Televisor();
        t2.establecerMarca("SAMSUMG-21 pulgadas");
        t2.establecerPrecio(1300.2);

        Televisor t3 = new Televisor();
        t3.establecerMarca("RIVIERA-29 pulgadas");
        t3.establecerPrecio(2300.5);

        ArrayList<Televisor> tvs = new ArrayList<>();
        tvs.add(t1);
        tvs.add(t2);
        tvs.add(t3);
        
        VentasTvs v1 = new VentasTvs();
        v1.establecerTelevisores(tvs);
        v1.establecerMarcasVendidas();
        v1.establecerPrecioTotal();
        v1.establecerTelevisorMasCaro();
        
        System.out.println("-----------------");
        System.out.printf("Marcas Vendidas: \n%s\n", v1.obtenerMarcasVendidas());
        System.out.printf("Precio total: %.2f\n",v1.obtenerPrecioTotal());
        System.out.printf("\nTelevisor mas caro:\n\tMarca: %s\n\tPrecio: %.2f\n", v1.obtenerMarcasTvCaro(), v1.obtenerTvCaro());
    }
}
