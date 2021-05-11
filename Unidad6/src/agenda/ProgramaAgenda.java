package agenda;

public class ProgramaAgenda {
    public static void main(String[] args) {

        Agenda agenda = new Agenda();
        Contacto p1 = new Persona("Pepe", "622622622", "20/12");
        Contacto p2 = new Persona("Carmen", "650650650", "13/02");
        Contacto p3 = new Persona("Jose", "633633633", "02/04");

        Contacto e1 = new Empresa("Coca Cola", "901202020", "www.cocacola.es");
        Contacto e2 = new Empresa("Google", "901199119", "www.google.es");
        Contacto e3 = new Empresa("PCComponentes", "901909090", "www.pccomponentes.com");

        agenda.anadirContacto(p1);
        agenda.anadirContacto(p2);
        agenda.anadirContacto(p3);

        agenda.anadirContacto(e1);
        agenda.anadirContacto(e2);
        agenda.anadirContacto(e3);

        agenda.listarContactos();
        agenda.existeContacto("Pepito");
        agenda.existeContacto("Google");
        agenda.eliminarContacto("Coca Cola");
        agenda.eliminarContacto("Pepe");

        System.out.println("Posicion de " + e3.getNombre() + ": " + agenda.buscaContacto(e3.getNombre()));
    }
}