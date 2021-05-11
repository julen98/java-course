package agenda;

import java.util.ArrayList;

public class Agenda {
    private ArrayList < Contacto > listaContactos = new ArrayList();

    public Agenda() {

    }

    public Agenda(ArrayList < Contacto > listaContactos) {
        super();
        this.listaContactos = listaContactos;
    }

    public boolean anadirContacto(Contacto c) {
        boolean eliminado = false;
        boolean existe = false;

        for (Contacto contacto: listaContactos) {
            if (c.getNombre().equals(contacto.getNombre())) {
                System.out.println("Este contacto ya existe.");
                existe = true;
            }
        }

        if (existe == false) {
            listaContactos.add(c);
        }

        return eliminado;
    }

    public boolean eliminarContacto(String nombre) {
        boolean eliminar = false;
        int existir = 0;

        for (int i = 0; i < this.listaContactos.size(); i++) {
            Contacto contacto = listaContactos.get(i);
            if (contacto.getNombre().equals(nombre)) {
                existir++;
                listaContactos.remove(i);
                break;
            }
        }
        if (existir == 1) {
            eliminar = true;
            System.out.println("El contacto " + nombre + " ha sido eliminado.");
        } else {
            eliminar = false;
            System.out.println("El contacto " + nombre + " no ha sido eliminado.");
        }

        return eliminar;
    }

    public boolean existeContacto(String nombre) {
        boolean existe = false;
        int existir = 0;

        for (int i = 0; i < this.listaContactos.size(); i++) {
            Contacto contacto = listaContactos.get(i);
            if (contacto.getNombre().equals(nombre)) {
                existir = 1;
                break;
            }
        }

        if (existir == 1) {
            existe = true;
            System.out.println("El contacto " + nombre + " existe.");
        } else {
            existe = false;
            System.out.println("El contacto " + nombre + " no existe.");
        }
        return existe;
    }

    public void listarContactos() {
        for (Contacto contacto: listaContactos) {
            contacto.mostrar();
            contacto.getNombre();
        }
    }

    public int buscaContacto(String nombre) {
        for (int i = 0; i < this.listaContactos.size(); i++) {
            Contacto contacto = listaContactos.get(i);
            if (contacto.getNombre().equals(nombre)) {
                return i;
            }
        }
        return -1;
    }
}