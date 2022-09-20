package Ejercicio_09;

/* Hacer un programa para calcular el área de Polígonos (Triángulos y Rectángulos) el programa debe ser capaz de
almacenar en un arreglo N triángulos y rectángulos, y al final mostrar el área y los datos de cada uno. Para ello
se tendrá lo siguiente.

- Una super clase llamada Polígono
- Una sub clase llamada Rectángulo
- Una sub clase llamada Triángulo
*/

import java.util.ArrayList;
import java.util.Scanner;

public class Principal {
    static ArrayList<Poligono> poligono = new ArrayList<Poligono>();
    static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {
        //Llenar un poligono
        llenarPoligono();

        //Mostrar los datos y el área de cada polígono
        mostrarResultados();
    }

    public static void llenarPoligono() {
        int opcion;
        char respuesta;
        do {
            do {
                System.out.println("Digite que poligono desea");
                System.out.println("1. Triangulo");
                System.out.println("2. Rectangulo");
                System.out.println("Opción: ");
                opcion = entrada.nextInt();
            } while (opcion<1 || opcion>2);

            switch (opcion){
                case 1: // Llenar un triangulo
                    llenarTriangulo();
                    break;
                case 2: // Llenar un rectangulo
                    llenarRectangulo();
                    break;
            }

            System.out.println("\nDesea introducir otro poligono(s/n): ");
            respuesta = entrada.next().charAt(0);
            System.out.println();
        } while (respuesta=='s'||respuesta=='S');
    }

    public static void llenarTriangulo() {
        double lado1, lado2, lado3;

        System.out.println("\nDigite el lado 1 del triangulo: ");
        lado1 = entrada.nextDouble();
        System.out.println("Digite el lado 2 del triangulo: ");
        lado2 = entrada.nextDouble();
        System.out.println("Digite el lado 3 del triangulo: ");
        lado3 = entrada.nextDouble();

        Triangulo triangulo = new Triangulo(lado1, lado2, lado3);
        // Almacenando el triangulo en el arreglo poligono
        poligono.add(triangulo);
    }

    public static void llenarRectangulo() {
        double lado1, lado2;

        System.out.println("\nDigite el lado 1 del triangulo: ");
        lado1 = entrada.nextDouble();
        System.out.println("Digite el lado 2 del triangulo: ");
        lado2 = entrada.nextDouble();

        Rectangulo rectangulo = new Rectangulo(lado1, lado2);
        // Almacenando el rectangulo en el arreglo poligono
        poligono.add(rectangulo);
    }

    public static void mostrarResultados() {
        //Recorriendo el arreglo de polígonos
        for(Poligono poli: poligono) {
            System.out.println(poli.toString());
            System.out.println("Area =" + poli.area());
            System.out.println();
        }
    }

}
