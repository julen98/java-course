package gestisimal;
import java.util.*;

public class ClaseMain {
	static int X = 100;
	public static void main(String[] args) {
		Gestisimal articulo[] = new Gestisimal[X];
		
		for(int i = 0; i < X; i++) {
			articulo[i] = new Gestisimal();
		}
		menu(articulo);
	}
	
	public static void menu(Gestisimal articulo[]) {
		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);
		int opcion;
		int i;
		int N;
		String id;
		
		do {
			System.out.println("1. Listado.");
			System.out.println("2. Alta.");
			System.out.println("3. Baja.");
			System.out.println("4. Modificacion.");
			System.out.println("5. Entrada de mercancia.");
			System.out.println("6. Salida de mercancia.");
			System.out.println("7. Salir.");
			System.out.println("Introduce una opcion: ");
			opcion = teclado.nextInt();
		switch(opcion) {
		case 1:
	          System.out.println("\nLISTAR");
	          System.out.println("--------------------------------------");
	          
	          for(i = 0; i < X; i++) {
	            if (!articulo[i].getCodigo().equals("LIBRE")) {
		              System.out.println(articulo[i].toString());
	            }
	          }
	  
			break;
			
		case 2:
			
			System.out.println("\nDAR DE ALTA");
	        System.out.println("-----------");
	          
	          for(i = 0, N = 1; i < X; i++, N++) {
	        	  teclado.nextLine();
	            if (articulo[i].getCodigo().equals("LIBRE")) {
	            	articulo[i].setCodigo("COD-"+N);
	            	System.out.println("Introduce la descripcion: ");
	            	articulo[i].setDescripcion(teclado.nextLine());
	            	System.out.println("Introduce el precio de venta: ");
	            	articulo[i].setPrecioVenta(teclado.nextInt());
	            	System.out.println("Introduce el precio de compra: ");
	            	articulo[i].setPrecioCompra(teclado.nextInt());
	            	System.out.println("Introduce el stock: ");
	            	articulo[i].setStock(teclado.nextInt());
	            	
	            	i = 100;
	            } else {
	            	System.out.println("El almacen esta lleno.");
	            }
	          }
	          
			break;
			
		case 3:
			
			System.out.println("\nDAR DE BAJA");
			System.out.println("-----------");
			teclado.nextLine(); 
			System.out.println("Introduce el codigo del articulo: ");
			id = teclado.nextLine();
			for(i = 0; i < X; i++) {
				if (articulo[i].getCodigo().equals(id))
					articulo[i].setCodigo("LIBRE");
			}
	        
			break;
			
		case 4:
			
			System.out.println("\nMODIFICAR");
			System.out.println("---------");
			teclado.nextLine(); 
			System.out.println("Introduce el codigo del articulo: ");
			id = teclado.nextLine();
			for(i = 0; i < X; i++) {
				if (articulo[i].getCodigo().equals(id)) {
					System.out.println("Elige que quieres modificar: ");
					System.out.println("OPCIONES");
					System.out.println("1. Cambiar descripcion.");
					System.out.println("2. Cambiar precio de venta.");
					System.out.println("3. Cambiar precio de compra.");
					System.out.println("4. Cambiar descripcion y precios.");
					System.out.println("--------");
					int opciones = teclado.nextInt();
					
					if(opciones == 1) {
						System.out.println("Introduce la descripcion: ");
            			articulo[i].setDescripcion(teclado.nextLine());
					}
            		if(opciones == 2) {
            			System.out.println("Introduce el precio de venta: ");
            			articulo[i].setPrecioVenta(teclado.nextInt());
            		}
            		if(opciones == 3) {
            			System.out.println("Introduce el precio de compra: ");
            			articulo[i].setPrecioCompra(teclado.nextInt());
            		}
            		if(opciones == 4) {
            			System.out.println("Introduce la descripcion: ");
            			articulo[i].setDescripcion(teclado.nextLine());
            			System.out.println("Introduce el precio de venta: ");
            			articulo[i].setPrecioVenta(teclado.nextInt());
                		System.out.println("Introduce el precio de compra: ");
                		articulo[i].setPrecioCompra(teclado.nextInt());
                	}
				}
			}
			
			break;
			
		case 5:
			
			
			
			break;
			
		case 6:
			
			
			
			break;
			
		case 7:
			
			
			
			break;
			
		}
		} while (opcion != 7);
	}
}
