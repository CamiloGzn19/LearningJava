package Ejercicios;

import java.util.Scanner;

/*
Leer 5 elementos númericos que se introducirán ordenados de forma creciente.
Estos los guardaremos en una tabla de tamaño 10. Leer un número N, e insertarlo
en el lugar adecuado para que la tabla continúe ordenada
 */
public class Ejercicio_11 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[] arreglo = new int[10];
        boolean creciente = true;
        int numero, sitio= 0, j= 0;

        do {
            // Llenando el arreglo
            for(int i=0; i<5; i++){
                System.out.println((i+1)+". Digite un número");
                arreglo[i] = entrada.nextInt();
            }

            // Comprobar si el arreglo esta ordenado en orden creciente
            for(int i=0; i <4; i++){
                if(arreglo[i] < arreglo[i+1]){
                    creciente =true;
                }
                if(arreglo[i] > arreglo[i+1]){
                    creciente = false;
                    break;
                }

                if(!creciente){
                    System.out.println("El arreglo no está ordenado en orden creciente");
                }
            }
        } while (!creciente);

        System.out.println("Digite un elemento a insertar");
        numero = entrada.nextInt();

        // En que posición va el número
        while(arreglo[j]<numero && j<5){
            sitio++;
            j++;
        }

        // Trasladar un posición en el arreglo a los elementos que van detrás de numero
        for(int i=4; i>=sitio;i--){
            arreglo[i+1] = arreglo[i];
        }

        // Insertamos el número que el usuario puso
        arreglo[sitio] = numero;

        System.out.println("El arreglo queda así");
        for(int i=0; i<6; i++){
            System.out.print(arreglo[i]+ "-");
        }
        System.out.println();
    }
}
