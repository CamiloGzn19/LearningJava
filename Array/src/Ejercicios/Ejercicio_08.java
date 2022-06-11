package Ejercicios;

import java.util.Scanner;

/*
Diseñar una aplicación que declare una tabla de 10 elementos enteros.
Leer mediante teclado 8 números. Después se debe pedir un número y una
posición, insertarlo en la posición indicada, desplazando los que estén
detrás.
 */
public class Ejercicio_08 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[] arreglo = new int[10];
        int numero, posicion;

        for(int i=0; i < 8; i++){
            System.out.println("Ingrese un valor a la lista: ");
            arreglo[i] = entrada.nextInt();
        }

        System.out.println("Ingrese un número");
        numero = entrada.nextInt();

        System.out.println("Ingrese una posición");
        posicion = entrada.nextInt();

        if (arreglo.length - posicion >= 0)
            System.arraycopy(arreglo, posicion, arreglo, posicion, arreglo.length - posicion);

        arreglo[posicion-1] = numero;

        System.out.println("El arreglo es: ");
        for (int i = 0; i < 8; i++){
            System.out.println(arreglo[i]);
        }

    }
}
