package Ordenamientos;

import javax.swing.*;
import java.util.Scanner;

/*
Metodo burbuja
Es una algoritmno de ordenamiento. Funciona revisando cada elemento de la lista
que va a ser ordenada con el siguiente, intercambiándolos de posición si están
en el orden equivocado. Es necesario revisar varias veces toda la lista hasta
que no se necesiten más intercambios, lo cual significa que la lista está ordenada.

Ex:
[4,5,2,1,3]
Si numeroActual > numeroSiguiente = Cambio
[4,2,1,3,5] = Primera vuelta
[2,1,3,4,5] = Segunda vuelta
[1,2,3,4,5] = Tercer vuelta

 */
public class MetodoBurbuja {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[] arreglo;
        int nElementos, aux;

        nElementos = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de elementos del arreglo"));

        arreglo = new int[nElementos];

        for(int i=0; i < nElementos; i++){
            System.out.print((i+1) + ". Ingrese un número: ");
            arreglo[i] = entrada.nextInt();
        }

        // Método burbuja
        for(int i=0; i < (nElementos-1); i++){
            for(int j=0; j < (nElementos-1); j++){
                if(arreglo[j] > arreglo[j+1]) {
                    aux = arreglo[j];
                    arreglo[j] = arreglo[j+1];
                    arreglo[j+1] = aux;
                }
            }
        }

        // Mostrar el arreglo ordenado de forma creciente
        System.out.println("\nArreglo ordenado de forma creciente");
        for(int i=0; i<nElementos;i++){
            System.out.println("- " + arreglo[i]);
        }

        System.out.println("\nArreglo ordenado de forma decreciente");
        for(int i=(nElementos-1); i>=0;i--){
            System.out.println("- " + arreglo[i]);
        }

    }
}
