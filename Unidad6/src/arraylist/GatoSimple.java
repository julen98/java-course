package arraylist;

/**
 * GatoSimple.java
 * DefiniciÃ³n de la clase GatoSimple
 */
public class GatoSimple {

  // atributos /////////////////////////////
  
  String nombre;
  String color;
  String raza;
  String sexo;
  
  int    edad;
  double peso;
  
  // mÃ©todos ///////////////////////////////
  
  // constructor
  GatoSimple (String n, String c, String r, String s, int e, double p) {
	  this.nombre=n;
	  this.color=c;
	  this.raza=r;
	  this.sexo = s;
	  this.edad=e;
	  this.peso=p;
  }
  
  // getter
  public String getSexo() {
    return this.sexo;
  }
  
  /**
   * Hace que el gato maulle
   */
  public  void maulla() {
    System.out.println("Miauuuu");
  }

  /**
   * Hace que el gato ronronee
   */  
  public void ronronea() {
    System.out.println("mrrrrrr");
  }
  
  /**
   * Hace que el gato coma.
   * A los gatos les gusta el pescado, si le damos otra comida
   * la rechazarÃ¡.
   * 
   * @param comida la comida que se le ofrece al gato
   */
  public void come(String comida) {
    if (comida.equals("pescado")) {
      System.out.println("Hmmmm, gracias");
    } else {
      System.out.println("Lo siento, yo solo como pescado");
    }
  }

  /**
   * Pone a pelear dos gatos.
   * Solo se van a pelear dos machos entre sÃ­.
   * 
   */
  public void peleaCon(GatoSimple contrincante) {
    if (this.sexo.equals("hembra")) {
      System.out.println("no me gusta pelear");
    } else {
      if (contrincante.getSexo().equals("hembra")) {
        System.out.println("no peleo contra gatitas");
      } else {
        System.out.println("ven aquÃ­ que te vas a enterar");
      }
    }
  }
  
  public String toString() {
	  
	  return "Soy " + nombre +  " de raza "  +raza + " y color " + color+ " de sexo " + sexo + ". AdemÃ¡s tengo " + edad + " aÃ±os y peso " + peso + " kg";
  }
}

