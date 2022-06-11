package Ejercicios;

import java.util.Scanner;

/*
Leer por teclado una tabla de 10 elementos numéricos enteros y una posición
(entre 0 y 9). Eliminar el elemento situado en la posición dada sin dejar huecos.
 */
public class Ejercicio_12 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[] arreglo = new int[10];
        int pos;

        for(int i=0; i < 10; i++){
            System.out.print(i+ ". Ingrese un número a la tabla: ");
            arreglo[i] = entrada.nextInt();
        }

        do {
            System.out.println("Ingrese una posición entre 0 y 9");
            pos = entrada.nextInt();
        } while (pos > 9 || pos < 0);

        // Eliminando el elemento de la posición indicada
        for(int i=pos;i<9;i++){
            arreglo[i] = arreglo[i+1];
        }

        System.out.println("El arreglo queda así");
        for(int i=0;i<9;i++){
            System.out.println(arreglo[i]);
        }

    }
}
