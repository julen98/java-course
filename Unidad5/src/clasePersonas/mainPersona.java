package clasePersonas;

public class mainPersona {
	public static void main(String args[]) {
		Persona julen = new Persona();
		
		// Atributos
		
		julen.nombre = "Julen";
		julen.apellidos = "Martinez";
		julen.edad = 22;
		julen.altura = 190;
		julen.genero = 'M';
		julen.peso = 100;
		
		// Metodos
		
		julen.comer();
		julen.correr();
		julen.caminar();
		julen.dormir();
		julen.listar();
		
		System.out.println("--------------------------------------------------------------");
		
		Persona pedro = new Persona();

		// Atributos
		
		pedro.nombre = "Pedro";
		pedro.apellidos = "Perez";
		pedro.edad = 45;
		pedro.altura = 165;
		pedro.genero = 'M';
		pedro.peso = 60;

		// Metodos
		
		pedro.comer();
		pedro.correr();
		pedro.caminar();
		pedro.dormir();
		pedro.listar();
		
	}
}
