package Ejercicios;

import java.util.Scanner;

/*
Leer por teclado una serie de 10 números enteros. La aplicación
debe indicarnos si los números están ordenados de forma creciente,
decreciente, o si están ordenados.
 */
public class Ejercicio_07 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[] rango = new int[10];
        boolean creciente=false, decreciente=false;

        for(int i = 0; i < 10; i++){
            System.out.print("Ingrese el valor " + (i+1) + ": ");
            rango[i] = entrada.nextInt();
        }

        for(int i =0; i<9;i++){
            if(rango[i] < rango[i+1]){
                creciente = true;
            }
            if (rango[i] > rango[i+1]) {
                decreciente = true;
            }
        }

        System.out.println("Los números digitados en orden es: ");
        if(creciente && !decreciente){
            System.out.println("El arreglo es creciente");
        } else if(!creciente && decreciente){
            System.out.println("El arreglo es decreciente");
        } else if (creciente && decreciente) {
            System.out.println("El arreglo está desordenado");
        } else if (!creciente && !decreciente) {
            System.out.println("Todos los elementos son iguales");
        }
    }
}
