package Ejercicios;
/*
Leer dos series de 10 enteros, que estarán ordenadas crecientemente.
Copiar (fusionar) las dos tablas en una tercera, de forma que sigan ordenados.
 */

import java.util.Scanner;

public class Ejercicio_14 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        boolean creciente = true;
        int[] arregloA = new int[10];
        int[] arregloB = new int[10];
        int[] arregloC = new int[20];

        System.out.println("Ingrese las listas A y B en orden creciente");

        do{
            for(int i=0; i < 10; i++) {
                System.out.print("Ingrese el número " + (i+1) + " a la tabla A: ");
                arregloA[i] = entrada.nextInt();
            }
            for(int i=0; i < 9; i++) {
                if(arregloA[i] < arregloA[i+1]){
                    creciente = true;
                }
                if(arregloA[i] > arregloA[i+1]){
                    creciente = false;
                    break;
                }
            }
            if (!creciente){
                System.out.println("El arreglo está en desorden");
            }
        } while (!creciente);

        do{
            for(int i=0; i < 10; i++) {
                System.out.print("Ingrese el número " + (i+1) + " a la tabla B: ");
                arregloB[i] = entrada.nextInt();
            }
            for(int i=0; i < 9; i++) {
                if(arregloB[i] < arregloB[i+1]){
                    creciente = true;
                }
                if(arregloB[i] > arregloB[i+1]){
                    creciente = false;
                    break;
                }
            }
            if (!creciente){
                System.out.println("El arreglo está en desorden");
            }
        } while (!creciente);

        int i=0; // i será para a
        int j=0; // j será para b
        int k=0; // k será para c

        while(i<10 && j<10) {
            // Si el elemento de A es menor de B
            if(arregloA[i] < arregloB[j]){
                arregloC[k] = arregloA[i];
                i++;
            } else {
                arregloC[k] = arregloB[j];
                j++;
            }
            k++; // Avanzamos en el grupo mayor C
        }

        // Si sale del while es porque a o b ya terminó
        // Si ya copiamos todos los elementos de A
        if(i==10){
            while (j<10){ // Mientras no se haya termindo de copiar B
                arregloC[k] = arregloB[j];
                j++;
                k++;
            }
        } else {
            while (i<10){ // Mientras no se haya termindo de copiar A
                arregloC[k] = arregloA[i];
                i++;
                k++;
            }
        }

        System.out.println("Este es el arreglo final");
        for(k=0;k<20;k++){
            System.out.println(" - " + arregloC[k]);
        }

    }
}
