package Ordenamientos;

import javax.swing.*;
import java.util.Scanner;

/*
Ordenamiento por selección
Es un algoritmo de ordenamiento que requiere 0(n²) operaciones para ordenar una
lista de n números. Su funcionamiento es el siguiente:

1. Buscar el mínimo elemento de la lista
2. Intercambiar con el primer elemento
3. Buscar el mínimo del resto de la lista
4. Intercambiar con el segundo
5. Y así sucesivamente

Ex:
     ↓ El menor
[4,3,1,5,2] > [1,3,4,5,2] > Se genera el cambio
 ↑ Pos[0]
-----------------------------------------------------------
         ↓ El menor
[1,3,4,5,2] > [1,2,4,5,3] > Se genera el cambio
   ↑ Pos[1]
-----------------------------------------------------------
         ↓ El menor
[1,2,4,5,3] > [1,2,3,4,5] > Se genera el cambio <-- FIN -->
     ↑ Pos[2]
-----------------------------------------------------------

 */
public class OrdenamientoSeleccion {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[] arreglo;
        int nElementos, min, aux;

        nElementos = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de elementos del arreglo: "));

        arreglo = new int[nElementos];

        System.out.println("Ingrese los elementos del arreglo");
        for(int i=0; i<nElementos; i++){
            System.out.print((i+1) + " .Ingrese un número: ");
            arreglo[i] = entrada.nextInt();
        }

        //Ordenamiento por selección
        for(int i=0; i<nElementos;i++){
            min = i;
            for(int j=i+1;j<nElementos;j++){
                if(arreglo[j] < arreglo[min]){
                    min = j;
                }
            }
            aux = arreglo[i];
            arreglo[i] = arreglo[min];
            arreglo[min] = aux;
        }

        System.out.println("\nOrden creciente");
        for (int i=0; i<nElementos; i++){
            System.out.println("- " + arreglo[i]);
        }

        System.out.println("\nOrden decreciente");
        for (int i=(nElementos-1); i>= 0; i--){
            System.out.println("- " + arreglo[i]);
        }
    }
}
