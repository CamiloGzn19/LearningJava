package Ejercicios;

import java.util.Scanner;

/*
Leer 10 enteros en una tabla. Guardar en otra tabla los elementos pares
de la primera, y a continuación los elementos impares
 */
public class Ejercicio_13 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[] arreglo = new int[10];
        int pares = 0, impares = 0;

        for(int i=0; i<10; i++){
            System.out.print("Ingrese un número: ");
            arreglo[i] = entrada.nextInt();

            if(arreglo[i] % 2 == 0){
                pares++;
            } else {
                impares++;
            }
        }

        int[] cont_par = new int[pares];
        int[] cont_impar = new int[impares];

        pares = 0;
        impares = 0;

        // Almacenar los pares en el arreglo correspondiente
        for(int i=0; i<10; i++){
            if(arreglo[i] % 2 == 0) {
                cont_par[pares] = arreglo[i];
                pares++;
            } else {
                cont_impar[impares] = arreglo[i];
                impares++;
            }
        }

        System.out.println("Los pares son: ");
        for(int i = 0; i < pares; i++){
            System.out.println(cont_par[i]);
        }

        System.out.println("Los impares son: ");
        for(int i = 0; i < impares; i++){
            System.out.println(cont_impar[i]);
        }

    }
}
