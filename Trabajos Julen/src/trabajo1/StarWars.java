package trabajo1;

//*****************************************************************************************

// System.out.println("Este trabajo ha sido realizado por: Julen Ramón Martínez Cuervo");

//*****************************************************************************************

import java.util.Scanner;
public class StarWars {
public static void main(String[] args) {
	
	//Declaración
	
	Scanner teclado=new Scanner(System.in);
	boolean ganar=false;
	boolean perder=false;
	boolean fin=false;
	String intro="";
	
	//******************************** PORTADA ********************************
	
	System.out.println("    8888888888  888    88888           ");
	System.out.println("   88     88   88 88   88  88          ");
	System.out.println("    8888  88  88   88  88888           ");
	System.out.println("       88 88 888888888 88   88         ");
	System.out.println("88888888  88 88     88 88   888888     ");
	System.out.println("                                       ");
	System.out.println("88  88  88   888    88888    888888    ");
	System.out.println("88  88  88  88 88   88  88  88         ");
	System.out.println("88 8888 88 88   88  88888    8888      ");
	System.out.println(" 888  888 888888888 88   88     88     ");
	System.out.println("  88  88  88     88 88    8888888      ");
	System.out.println("                                       ");
	System.out.println("			   /~\\   Hey Jaume!        ");
	System.out.println("                          (O O) _/     ");
	System.out.println("                          _\\=/_       ");
	System.out.println("          ___            /  _  \\      ");
	System.out.println("         / ()\\          //|/.\\|\\\\  ");
	System.out.println("       _|_____|_       ||  \\_/  ||    ");
	System.out.println("      | | === | |      || |\\ /| ||    ");
	System.out.println("      |_|  O  |_|       # \\_ _/ #     ");
	System.out.println("       ||  O  ||          | | |        ");
	System.out.println("       ||__*__||          | | |        ");
	System.out.println("      |~ \\___/ ~|         []|[]       ");
	System.out.println("      /=\\ /=\\ /=\\         | | |     ");
	System.out.println("______[_]_[_]_[_]________/_]_[_\\_____ ");
	System.out.println("                                       ");
	
	//******************************** INICIO ********************************
	
	System.out.println("=== STAR WARS CÓDIGOS SECRETOS ===");
	System.out.println("Hace mucho tiempo, en una galaxia muy, muy lejana... La Princesa Leia, Luke\n"
			+ "Skywalker, Han Solo, Chewbacca, C3PO y R2D2 viajan en una nave imperial robada\n"
			+ "en una misión secreta para infiltrarse en otra estrella de la muerte que el imperio\n"
			+ "está construyendo para destruirla. (Presiona Intro para continuar)");
	
	//Esperar a que el usuario presione Enter
	
	 do{
	    intro=teclado.nextLine();
	    System.out.print(intro);
	 }
	 while(!intro.equals("")); 
	 System.out.print("");
		
	
	
	
	//******************************** NIVEL 1 ********************************
	
	
	
	
	//Declaración
	
	int numSistema=(int)(Math.random()*(1-10)+10);
	int numSector=(int)(Math.random()*(20-30)+30);
	int respuesta;
	int resultado;
	int suma=0;
	
	//Bucle para calcular la respuesta

	for(int i=numSistema;i<=numSector;i++) {
		suma=suma+i;
	}
	resultado=suma;
		
	//Mostrar en pantalla la pregunta del nivel

	System.out.println("Los problemas empiezan cuando deben realizar un salto hiperespacial hasta al\n"
			+ "sistema "+numSistema+" en el sector "+numSector+", pero el sistema de navegación está estropeado y el\n"
			+ "computador tiene problemas para calcular parte de las coordenadas de salto.\n"
			+ "Chewbacca, piloto experto, se da cuenta que falta el cuarto número de la serie.\n"
			+ "Recuerda de sus tiempos en la academia de pilotos que para calcularlo hay que\n"
			+ "calcular el sumatorio entre el nº del sistema y el nº del sector (ambos inclusive).\n"
			+ "¿Qué debe introducir?\n");
	respuesta = teclado.nextInt();
	
	//Condicional de victoria o derrota
	
	if(respuesta!=resultado) {
		perder=true;
		if(perder=true) {
			fin=true;
	System.out.println("Ese no era el código correcto... La misión ha sido un fracaso... :( :( :(\n"
			+ "Todavía no eres un Maestro Jedi de las Matemáticas. ¡Vuelve a intentarlo!");
	if(fin=true) {
		System.out.println("\nGracias por jugar :D");
		System.exit(0);
	}
		}
		}
	
	
	
	
	
	//******************************** NIVEL 2 ********************************

	
	
	
	//Declaración

	int numAgente=(int)(Math.random()*(1-7)+7);
	int numNave=(int)(Math.random()*(8-12)+12);
	resultado=1;
	
	//Bucle para calcular la respuesta
	
	for(int i=numAgente;i<=numNave;i++) {
		resultado=resultado*i;
	}
	
	//Mostrar en pantalla la pregunta del nivel

	System.out.println("\nGracias a Chewbacca consiguen llegar al sistema correcto y ven a lo lejos la estrella\n"
			+ "de la muerte. Como van en una nave imperial robada se aproximan lentamente con\n"
			+ "la intención de pasar desapercibidos. De repente suena el comunicador. “Aquí\n"
			+ "agente de espaciopuerto "+numAgente+" contactando con nave imperial "+numNave+". No están destinados\n"
			+ "en este sector. ¿Qué hacen aquí?”.. Han Solo coge el comunicador e improvisa. “Eh...\n"
			+ "tenemos un fallo en el... eh... condensador de fluzo... Solicitamos permiso para\n"
			+ "atracar y reparar la nave”. El agente, que no se anda con tonterías, responde\n"
			+ "“Proporcione código de acceso o abriremos fuego”. Han Solo ojea rápidamente el\n"
			+ "manual del piloto que estaba en la guantera y da con la página correcta. El código\n"
			+ "es el productorio entre el nº del agente y el nº de la nave (ambos inclusive).\n"
			+ "¿Cuál es el código?\n");
	respuesta = teclado.nextInt();
	
	//Condicional de victoria o derrota
	
	if(respuesta!=resultado) {
		perder=true;
		if(perder=true) {
			fin=true;
	System.out.println("Ese no era el código correcto... La misión ha sido un fracaso... :( :( :(\n"
			+ "Todavía no eres un Maestro Jedi de las Matemáticas. ¡Vuelve a intentarlo!");
	if(fin=true) {
		System.out.println("\nGracias por jugar :D");
		System.exit(0);
	}
		}
		}
	
	
	
	
	
	//******************************** NIVEL 3 ********************************

	
	
	
	//Declaracion

	int numfactorial=(int)(Math.random()*(50-100)+100);
	int redondear=(int)Math.floor(numfactorial/10);
	int factorial=1;
	int cont=redondear;	
	
	//Bucle para calcular la respuesta

	while(cont!=0) {
		  factorial=factorial*cont;
		  cont--;
		}
	resultado=factorial;
	
	//Mostrar en pantalla la pregunta del nivel

	System.out.println("\nHan Solo proporciona el código correcto. Atracan en la estrella de la muerte, se\n"
			+ "equipan con trajes de soldados imperiales que encuentran en la nave para pasar\n"
			+ "desapercibidos y bajan. Ahora deben averiguar en qué nivel de los "+numfactorial+" existentes se\n"
			+ "encuentra el reactor principal. Se dirigen al primer panel computerizado que\n"
			+ "encuentran y la Princesa Leia intenta acceder a los planos de la nave pero necesita\n"
			+ "introducir una clave de acceso. Entonces recuerda la información que le proporcionó\n"
			+ "Lando Calrissian “La clave de acceso a los planos de la nave es el factorial de "+numfactorial+"/10\n"
			+ "(redondeando "+numfactorial+" hacia abajo), donde "+numfactorial+" es el nº de niveles”.\n"
			+ "¿Cual es el nivel correcto?\n");
	respuesta = teclado.nextInt();

	//Condicional de victoria o derrota
	
	if(respuesta!=resultado) {
		perder=true;
		if(perder=true) {
			fin=true;
	System.out.println("Ese no era el código correcto... La misión ha sido un fracaso... :( :( :(\n"
			+ "Todavía no eres un Maestro Jedi de las Matemáticas. ¡Vuelve a intentarlo!");
	if(fin=true) {
		System.out.println("\nGracias por jugar :D");
		System.exit(0);
	}
		}
		}
	
	
	
	
	//******************************** NIVEL 4 ********************************

	
	
	
	//Declaración
	
	int numprimo=(int)(Math.random()*(10-100)+100);
	int primo=0;
	
	//Bucle para calcular la respuesta
	
	cont = 0;
	for(int i=numprimo;i>0;i--) {
	    if(numprimo%i==0) {
	        cont++;
	    }
	}
	if(cont == 2){
	    primo=1;
	}else {
		primo=0;
	}
	resultado=primo;
	
	//Mostrar en pantalla la pregunta del nivel

	System.out.println("\nGracias a la inteligencia de Leia llegan al nivel correcto y encuentran la puerta\n"
			+ "acorazada que da al reactor principal. R2D2 se conecta al panel de acceso para\n"
			+ "intentar hackear el sistema y abrir la puerta. Para desencriptar la clave necesita\n"
			+ "verificar si el número "+numprimo+" es primo o no. Si es primo introduce un 1, si no lo es\n"
			+ "introduce un 0.\n");
	respuesta = teclado.nextInt();
	
	//Condicional de victoria o derrota
	
	if(respuesta!=resultado) {
		perder=true;
		if(perder=true) {
			fin=true;
	System.out.println("Ese no era el código correcto... La misión ha sido un fracaso... :( :( :(\n"
			+ "Todavía no eres un Maestro Jedi de las Matemáticas. ¡Vuelve a intentarlo!");
	if(fin=true) {
		System.out.println("\nGracias por jugar :D");
		System.exit(0);
	}
		}
		}
	
	
	
	
	
	//******************************** NIVEL 5 ********************************

	
	
	
	//Declaración
	
	int minutos=(int)(Math.random()*(5-10)+10);
	int segundos=(int)(Math.random()*(5-10)+10);
	int factorialmin=1;
	int factorialseg=1;
	int contmin=minutos;
	int contseg=segundos;
	
	//Bucle para calcular la respuesta
	
	while(contmin!=0) {
		  factorialmin=factorialmin*contmin;
		  contmin--;
		}
	while(contseg!=0) {
		  factorialseg=factorialseg*contseg;
		  contseg--;
		}
	resultado=factorialmin+factorialseg;

	//Mostrar en pantalla la pregunta del nivel

	System.out.println("\nConsiguen entrar al reactor. Ya solo queda que Luke Skywalker coloque la bomba,\n"
			+ "programe el temporizador y salir de allí corriendo. Necesita programarlo para que\n"
			+ "explote en exactamente "+minutos+" minutos y "+segundos+" segundos, el tiempo suficiente para escapar\n"
			+ "antes de que explote pero sin que el sistema de seguridad anti-explosivos detecte y\n"
			+ "desactive la bomba. Pero el temporizador utiliza un reloj Zordgiano un tanto\n"
			+ "peculiar. Para convertir los minutos y segundos al sistema Zordgiano hay que sumar\n"
			+ "el factorial de "+minutos+" y el factorial de "+segundos+". ¿Qué valor debe introducir?");
	respuesta=teclado.nextInt();
	teclado.close(); //Cerrar el scanner teclado
	
	//Condicional de victoria o derrota

	if(respuesta!=resultado) {
		perder=true;
		if(perder=true) {
			fin=true;
	System.out.println("Ese no era el código correcto... La misión ha sido un fracaso... :( :( :(\n"
			+ "Todavía no eres un Maestro Jedi de las Matemáticas. ¡Vuelve a intentarlo!");
	if(fin=true) {
		System.out.println("\nGracias por jugar :D");
		System.exit(0);
	}
		}
		}else {
			ganar=true;
			if(ganar=true) {
				fin=true;
				System.out.println("\nLuke Skywalker introduce el tiempo correcto, activa el temporizador y empiezan a\n"
						+ "sonar las alarmas. Salen de allí corriendo, no hay tiempo que perder. La nave se\n"
						+ "convierte en un hervidero de soldados de arriba a abajo y entre el caos que les rodea\n"
						+ "consiguen llegar a la nave y salir de allí a toda prisa. A medida que se alejan\n"
						+ "observan por la ventana la imagen de la colosal estrella de la muerte explotando en\n"
						+ "el silencio del espacio, desapareciendo para siempre junto a los restos del malvado\n"
						+ "imperio.\n"
						+ "¡Has salvado la galaxia gracias a la Fuerza Jedi de las matemáticas! Enhorabuena ;D");
				if(fin=true) {
					System.out.println("\nGracias por jugar :D");
					System.exit(0);
				}
			}
		}
}
}
