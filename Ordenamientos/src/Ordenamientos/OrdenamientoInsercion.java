package Ordenamientos;

import javax.swing.*;
import java.util.Scanner;

/*
Ordenamiento por inserción
Es una manera muy natural de ordenar para un ser humano, y puede usarse facilmente
para ordenar un mazo de cartas numeradas en forma arbitraria. Requiere O(n²)
operaciones para ordenar una lista de n elementos.

Ex:
Comprueba si el número a su izquierda es menor que él
Si numeroIzq > numeroActual = Cambio
[5,3,4,1,2]
 ↑
[5,3,4,1,2] > [3,5,4,1,2]
   ↑
[3,5,4,1,2] > [3,4,5,1,2]
     ↑
[3,4,5,1,2] > [3,4,1,5,2] > [3,1,4,5,2] > [1,3,4,5,2]
       ↑
[1,3,4,5,2] > [1,3,4,2,5] > [1,3,2,4,5] > [1,2,3,4,5]
         ↑
[1,2,3,4,5] <-- FIN -->
 */
public class OrdenamientoInsercion {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[] arreglo;
        int nElementos, pos, aux;

        nElementos = Integer.parseInt(JOptionPane.showInputDialog("Digite el número de elementos del arreglo: "));

        arreglo = new int[nElementos];

        System.out.println("Digite el arreglo: ");
        for(int i =0; i<nElementos;i++){
            System.out.print((i+1) + ". Digite un número: ");
            arreglo[i] = entrada.nextInt();
        }

        // Ordenamiento por insersión
        for(int i=0; i<nElementos; i++){
            pos = i;
            aux = arreglo[i];

            while((pos>0) && (arreglo[pos-1] > aux)) {
                arreglo[pos] = arreglo[pos-1];
                pos--;
            }
            arreglo[pos] = aux;
        }

        System.out.println("\nOrden ascendente");
        for(int i=0; i<nElementos; i++){
            System.out.println("- " + arreglo[i]);
        }

        System.out.println("\nOrden descendente");
        for(int i=(nElementos-1); i>=0; i--){
            System.out.println("- " + arreglo[i]);
        }

    }
}
