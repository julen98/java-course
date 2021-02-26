package transporte;

import java.util.ArrayList;

public class Programa {
	public static void main(String[] args) {
		ArrayList < Vehiculos > lista = new ArrayList();
		
		// -------- GENERICOS --------
		
		Vehiculos terrGen = new Terrestres("1234ABC", "Generico", 4);
		Vehiculos aerGen = new Aereos("ABCD123456", "Generico", 4);
		Vehiculos acuGen = new Acuaticos("ABCDEFGHIJ", "Generico", 35.75);
		
		// -------- NO GENERICOS --------
		
		Vehiculos coche = new Coches("3423QCD", "Audi R8", 4, true);
		Vehiculos moto = new Motos("4561KKD", "Yamaha R3", 2, "Negro y rojo");
		Vehiculos avion = new Aviones("CCEE335632", "Boeing 747", 102, 30000);
		Vehiculos helicoptero = new Helicopteros("HFEN157342", "Boeing 747", 3, 4);
		Vehiculos barco = new Barcos("KCDKASDL", "JEANNEAU", 76.5, true);
		Vehiculos submarino = new Submarinos("ALFJNCOR", "DeepFlight", 4, 120);
		
		lista.add(terrGen);
		lista.add(aerGen);
		lista.add(acuGen);
		lista.add(coche);
		lista.add(moto);
		lista.add(avion);
		lista.add(helicoptero);
		lista.add(barco);
		lista.add(submarino);
		
		for (Vehiculos vehiculos : lista) {
			vehiculos.imprimir();
		}
	}
}
