package examen;

import java.util.ArrayList;
import java.util.Iterator;

public class ClaseMain {
	public static void main(String[] args) {
		Examen examen = new Examen("Castellano","Aula 1");
		Data data = new Data("07","12","2020");
		Hora hora = new Hora("11","00");
		
		examen.setHora(hora);
		examen.setData(data);
		
		System.out.println("PARTE 1:");
		
		System.out.println(examen.toString());
		
		System.out.println("\nPARTE 2:");
		
		/* ------------------------------------------------------------- */
		
		ArrayList<Examen> lista = new ArrayList<>();
		
		Examen examen1 = new Examen("Castellano","Aula 1");
		Examen examen2 = new Examen("Ingles","Aula 3");
		Examen examen3 = new Examen("Sociales","Aula 5");
		Examen examen4 = new Examen("Fisica","Aula 7");
		Examen examen5 = new Examen("Matematicas","Aula 9");
		
		Data data1 = new Data("07","12","2020");
		Data data2 = new Data("13","12","2020");
		Data data3 = new Data("29","11","2020");
		Data data4 = new Data("23","11","2020");
		Data data5 = new Data("13","11","2020");
		
		Hora hora1 = new Hora("11","00");
		Hora hora2 = new Hora("11","00");
		Hora hora3 = new Hora("08","00");
		Hora hora4 = new Hora("12","00");
		Hora hora5 = new Hora("11","00");
		
		
		examen1.setHora(hora1);
		examen2.setHora(hora2);
		examen3.setHora(hora3);
		examen4.setHora(hora4);
		examen5.setHora(hora5);
		
		examen1.setData(data1);
		examen2.setData(data2);
		examen3.setData(data3);
		examen4.setData(data4);
		examen5.setData(data5);
		
		lista.add(examen1);
		lista.add(examen2);
		lista.add(examen3);
		lista.add(examen4);
		lista.add(examen5);
		
		for (Examen examenes : lista) {
			System.out.println(examenes.toString());
		}
		
		Iterator<Examen> iter = lista.iterator();
		
		System.out.println("\n--- ITERATOR: ");
		
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
	}
}
