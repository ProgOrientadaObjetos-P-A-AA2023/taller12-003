/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p2;

import java.util.ArrayList;
import p1.Matricula;
import p1.MatriculaCampamento;
import p1.MatriculaColegio;

/**
 *
 * @author reroes
 */
public class TipoMatricula {
    private double promedioMatriculas;
    // private MatriculaCampamento campamento;
    // private MatriculaColegio colegio;
    // private MatriculaEscuela escuela;
    // private MatriculaJardin jardin;
    // private MatriculaMaternal maternal;
    // private MatriculaMaternal maternal2;
    ArrayList<Matricula> matriculas;
    
    public TipoMatricula (ArrayList<Matricula> l) {
        matriculas = l;
    }

    public ArrayList<Matricula> obtenerMatriculas() {
        return matriculas;
    }

    public void establecerMatriculas(ArrayList<Matricula> l) {
        matriculas = l;
    }
        
    public void establecerPromedioTarifas(){
        double suma=0;
        for (int i=0;i<matriculas.size();i++) {
            suma+=obtenerMatriculas().get(i).obtenerTarifa();
        }      
        promedioMatriculas = suma/obtenerMatriculas().size();
    }
    
    public double obtenerPromedioTarifas(){
        return promedioMatriculas;
    }
    
    @Override
    public String toString() {
        String cadena = String.format("Matriculas\n");
        
        for (int i=0;i<matriculas.size();i++) {
            cadena = String.format("%s\nNombre: %s\nTarifa: %.2f\n", 
                    cadena,
                    obtenerMatriculas().get(i).obtenerNombre(),
                    obtenerMatriculas().get(i).obtenerTarifa());
        }
        cadena = String.format("%s\nPromedio Tarifas: %.2f\n", cadena, obtenerPromedioTarifas());
        return cadena;
    }
}
