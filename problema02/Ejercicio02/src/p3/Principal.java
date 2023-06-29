/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p3;

import java.util.ArrayList;
import p1.Matricula;
import p1.MatriculaCampamento;
import p1.MatriculaColegio;
import p1.MatriculaEscuela;
import p1.MatriculaJardin;
import p1.MatriculaMaternal;
import p2.TipoMatricula;

/**
 *
 * @author reroes
 */
public class Principal {
    public static void main(String[] args) {
        ArrayList<Matricula> lista = new ArrayList<>();
        MatriculaCampamento mcamp = new MatriculaCampamento();
        mcamp.establecerTarifa();
        mcamp.establecerNombre("Campamento");
        
        MatriculaColegio mcolegio = new MatriculaColegio();
        mcolegio.establecerTarifa();
        mcolegio.establecerNombre("Colegio");
        
        MatriculaEscuela mescuela = new MatriculaEscuela();
        mescuela.establecerTarifa();
        mescuela.establecerNombre("Escuela");
        
        MatriculaJardin mjardin = new MatriculaJardin();
        mjardin.establecerTarifa();
        mjardin.establecerNombre("Jardin");
        
        MatriculaMaternal mmaternal = new MatriculaMaternal();
        mmaternal.establecerTarifa();
        mmaternal.establecerNombre("Maternal 1");
        
        MatriculaMaternal mmaternal2 = new MatriculaMaternal();
        mmaternal2.establecerTarifa();
        mmaternal2.establecerNombre("Maternal 2");
        
        lista.add(mcamp);
        lista.add(mcolegio);
        lista.add(mescuela);
        lista.add(mjardin);
        lista.add(mmaternal);
        lista.add(mmaternal2);
        
        TipoMatricula tipos = new TipoMatricula(lista);
        
        tipos.establecerPromedioTarifas();
        System.out.printf("%s\n", tipos);
    }
}
