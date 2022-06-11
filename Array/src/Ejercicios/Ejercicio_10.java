package Ejercicios;

import java.util.Scanner;

/*
Crear un programa que lea por teclado una tabla de 10 números enteros y desplace
N posiciones en el arreglo (N es difitado por el usuario)
 */
public class Ejercicio_10 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[] arreglo = new int[10];
        int desplazar, ultimo;

        for(int i = 0; i < 10; i++){
            System.out.print("Ingrese números a la tabla: ");
            arreglo[i] = entrada.nextInt();
        }

        System.out.println("Ingrese la cantidad de espacios a desplazar");
        desplazar = entrada.nextInt();

        for(int i = 1; i <= desplazar; i++){
            ultimo = arreglo[9];
            for(int j = 8; j >= 0; j--){
                arreglo[j+1]=arreglo[j];
            }
            arreglo[0] = ultimo;
        }

        System.out.println("El arreglo final es: ");
        for (int i = 0; i < 10; i++){
            System.out.print(arreglo[i] + " ");
        }
    }
}
