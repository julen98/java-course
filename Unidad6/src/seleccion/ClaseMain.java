package seleccion;

import java.util.ArrayList;

public class ClaseMain {
    public static void main(String[] args) {
        Entrenador luisE = new Entrenador(1, "Luis Enrique", "Martinez Garcia", 50, 1);
        Futbolista pedroG = new Futbolista(2, "Pedro", "Gonzalez Martinez", 22, 7, "Extremo Izquierdo");
        Masajista raulM = new Masajista(3, "Raul", "Martinez", 52, "Masajista", 25);
        @SuppressWarnings({
            "rawtypes",
            "unchecked"
        })
        ArrayList < SeleccionFutbol > lista = new ArrayList();
        lista.add(luisE);
        lista.add(pedroG);
        lista.add(raulM);

        System.out.println("Todos los integrantes comienzan una concentración. (Todos ejecutan el mismo método)\n");
        for (SeleccionFutbol integrantes: lista) {
            integrantes.concentrarse();
        }

        System.out.println("\nTodos los integrantes viajan para jugar un partido. (Todos ejecutan el mismo método)");
        for (SeleccionFutbol integrantes: lista) {
            integrantes.viajar();
        }

        System.out.println("\nEntrenamiento: Todos los integrantes tienen su función en un entrenamiento (Especialización)");
        for (SeleccionFutbol integrantes: lista) {
            integrantes.entrenar();
        }

        System.out.println("\nPartido de Fútbol: Todos los integrantes tienen su función en un partido (Especialización)");
        for (SeleccionFutbol integrantes: lista) {
            integrantes.jugarPartido();
        }

        System.out.println("\nPlanificar Entrenamiento: Solo el entrenador tiene el método para planificar un entrenamiento:");
        luisE.planificarEntrenamiento();

        System.out.println("\nEntrevista: Solo el futbolista tiene el método para dar una entrevista:");
        pedroG.entrevista();

        System.out.println("\nMasaje: Solo el masajista tiene el método para dar un masaje:");
        raulM.darMasaje();

    }
}