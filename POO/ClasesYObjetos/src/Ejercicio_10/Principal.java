package Ejercicio_10;

import java.util.ArrayList;
import java.util.Scanner;

/*
Crear un programa para simular un equipo de futbol (futbolista, entrenador y doctor), para lo cual tendremos lo siguiente:
- Una superclase Persona, que tendrá los siguientes datos: nombre, apellido, edad.
- La subClase Futbolista tendrá los siguientes datos: dorsal y posición.
- La subClase Entrenador tendrá de datos la estrategia que usa.
- La subClase Doctor, la titulación y los años de experiencia
Hacer un menú donde se tengan las siguientes opciones: Viaje de equipo, entrenamiento, partido de fútbol, planificar
entrenamiento, entrevista, curar lesión.
 */
public class Principal {
    static ArrayList<Persona> persona = new ArrayList<Persona>();
    static Scanner entrada = new Scanner(System.in);

    static Persona futbolista1 = new Futbolista( "Gonzalo", "Higuain", 29, 9, "Delantero");
    static Persona futbolista2 = new Futbolista( "Paulo", "Dybala", 23, 21, "Delantero");
    static Persona entrenador = new Entrenador( "Maximiliano", "Alegri", 49, "Defensiva");
    static Persona medico = new Medico("Alex", "Marroni", 53, "Licenciado Fisioterapia", 20);

    public static void main(String[] args) {
        persona.add(futbolista1);
        persona.add(futbolista2);
        persona.add(entrenador);
        persona.add(medico);

        menu();
    }

    public static void menu() {
        int opcion;
        do {
            System.out.println("\n\t.:MENU:.");
            System.out.println("1. Viaje de equipo");
            System.out.println("2. Entrenamiento");
            System.out.println("3. Partido de futbol");
            System.out.println("4. Planificar entrenamiento");
            System.out.println("5. Entrevista");
            System.out.println("6. Curar lesion");
            System.out.println("7. Salir");
            System.out.print("Opción: ");
            opcion = entrada.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println();
                    // Viaje de equipo
                    viajarEquipo();
                    break;
                case 2:
                    System.out.println();
                    // Entrenamiento
                    entrenarEquipo();
                    break;
                case 3:
                    System.out.println();
                    // Partido de futbol
                    partidoFutbol();
                    break;
                case 4:
                    System.out.println();
                    // Planificar entrenamiento
                    planificarEntrenamiento();
                    break;
                case 5:
                    System.out.println();
                    // Entrevista
                    darEntrevista();
                    break;
                case 6:
                    System.out.println();
                    // Curar lesión
                    curarLesion();
                    break;
                case 7: break;
                default:
                    System.out.println("Opción no válida");
            }
        } while (opcion != 7);
    }

    public static void viajarEquipo() {
        for (Persona equipo: persona) {
            System.out.print(equipo.getNombre()+" "+ equipo.getApellidos()+" -> ");
            equipo.viajar();
        }
    }

    public static void entrenarEquipo() {
        for (Persona equipo: persona) {
            System.out.print(equipo.getNombre()+" "+ equipo.getApellidos()+" -> ");
            equipo.entrenamiento();
        }
    }

   public static void partidoFutbol() {
       for (Persona equipo: persona) {
           System.out.print(equipo.getNombre()+" "+ equipo.getApellidos()+" -> ");
           equipo.partidoFutbol();
       }
   }

   public static void planificarEntrenamiento() {
       System.out.print(entrenador.getNombre()+" "+entrenador.getApellidos()+" -> ");
       ((Entrenador)entrenador).planificarEntrenamiento();
   }

   public static void darEntrevista() {
       System.out.print(futbolista1.getNombre()+" "+futbolista1.getApellidos()+" -> ");
       ((Futbolista)futbolista1).entrevista();
       System.out.print(futbolista2.getNombre()+" "+futbolista2.getApellidos()+" -> ");
       ((Futbolista)futbolista2).entrevista();
   }

   public static void curarLesion() {
       System.out.print(medico.getNombre()+" "+medico.getApellidos()+" -> ");
       ((Medico)medico).curarLesion();
   }


}

