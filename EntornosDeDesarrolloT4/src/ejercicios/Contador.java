package ejercicios;

//Ejercicio Básico Programación Orientada a Objetos Java                                  
//Clase Contador
public class Contador {

  public static int getCont(Contador contador) {
		return contador.getCont();
	}

public static Contador createContador() {
	return new Contador();
}

private int cont;

  //constructor por defecto
  private Contador() {
  }

  //constructor con parámetros
  public Contador(int cont) {
      if (cont < 0) {
          this.cont = 0;
      } else {
          this.cont = cont;
      }
  }

  //constructor copia
  public Contador(final Contador c) {                                                                           
      cont = c.cont;
  }

  //getter
  public int getCont() {
      return cont;
  }

  //setter
  public void setCont(int cont) {
      if (cont < 0) {
          this.cont = 0;
      } else {
          this.cont = cont;
      }
  }

  //método incrementar contador
  public void incrementar() {
      cont++;
  }

  //método decrementar contador
  public void decrementar() {
      cont--;
      if (cont < 0) {
          cont = 0;
      }
  }
}//Fin de la clase Contador