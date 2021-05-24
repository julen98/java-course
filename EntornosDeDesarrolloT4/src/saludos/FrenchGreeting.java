package saludos;

final class FrenchGreeting implements Saludo {
	/**
			 * 
			 */
			private final SaludaEnIngles frenchGreetingSuperior;

			/**
			 * @param saludaEnIngles
			 */
			FrenchGreeting(SaludaEnIngles saludaEnIngles) {
				frenchGreetingSuperior = saludaEnIngles;
			}

	String name = "tout le monde";

	public void saluda() {
	 saludaAAlguien("tout le monde");
	}

	public void saludaAAlguien(String someone) {
	    name = someone;
	    System.out.println("Salut " + name);
	}
}