package mascotas;

import java.util.ArrayList;

public class Inventario {

    private ArrayList < Mascotas > inventario = new ArrayList();

    public void mostrarListaAnimales() {
        for (Mascotas mascotas: inventario) {
            System.out.println(getTipoMascota(mascotas));
        }
    }

    public void mostrarAnimal(int i) {
        System.out.println(inventario.get(i).muestra());
    }

    public void mostrarTodosAnimales() {
        for (Mascotas mascotas: inventario) {
            System.out.println(mascotas.muestra());
        }
    }

    public boolean eliminarAnimal(int i) {
        boolean bool = true;
        
        String nombre = inventario.get(i).getNombre();
        
        if (i>0 && i<=inventario.size()) {
            bool = true;
            System.out.println("Se ha eliminado a " + nombre + " correctamente.");
            inventario.remove(i);
        } else {
            bool = false;
            System.out.println("No se ha podido eliminar.");
        }

        return bool;
    }

    public void vaciarInventario() {
        inventario.clear();
    }

    public void insertarAnimal(Mascotas mascota) {
        inventario.add(mascota);
    }

    private String getTipoMascota(Mascotas mascota) {
        String tipo;

        String nombre = mascota.getNombre();

        if (mascota instanceof Perro == true) {
            tipo = nombre + " es un perro";
        } else {
            if (mascota instanceof Gato == true) {
                tipo = nombre + " es un gato";
            } else {
                if (mascota instanceof Canario == true) {
                    tipo = nombre + " es un canario";
                } else {
                    if (mascota instanceof Loro == true) {
                        tipo = nombre + " es un loro";
                    } else {
                        tipo = nombre + " no es un animal";
                    }
                }
            }
        }

        return tipo;
    }
}