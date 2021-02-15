package arraylist;

import java.util.ArrayList;

/**
 * PruebaGatoSimple.java
 * Programa que prueba la clase GatoSimple
 */
public class PruebaGatoSimple {
	
  @SuppressWarnings("unused")
public static void main(String[] args) {
    
    GatoSimple garfield = new GatoSimple("Garfield","marron","siames","macho",2,11);
    GatoSimple tom = new GatoSimple("Tom","negro","siames","macho",12,9);
    GatoSimple lisa = new GatoSimple("Lisa","gris","siames","hembra",6,14);
    
    // ARRAYLIST
    
    ArrayList<GatoSimple> listaGatos = new ArrayList<GatoSimple>();
    
    listaGatos.add(garfield);
    listaGatos.add(tom);
    listaGatos.add(1,lisa);
    listaGatos.add(new GatoSimple("Any","blanco","siames","macho",5,12));
    listaGatos.add(2,new GatoSimple("Samy","rojo","siames","hembra",4,11));
    
    for(GatoSimple i: listaGatos) {
    	System.out.println(i.toString());
    }
  }
}

