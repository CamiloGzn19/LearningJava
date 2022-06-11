package Ejercicios;

import java.util.Scanner;

/*
Crear un programa que lea por teclado una tabla de 10 números enteros y la desplace
una posición hacia abajo: el primero pasa a ser el segundo, el segundo pasa a ser el
tercero y así suvesivamente. El último pasa a ser el primero
 */
public class Ejercicio_09 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[] arreglo = new int[10];
        int ultimo;

        for(int i = 0; i < 10; i++){
            System.out.println("Ingrese un número al listado: ");
            arreglo[i] = entrada.nextInt();
        }

        ultimo = arreglo[9];

        for(int i=8; i>= 0; i--){
            arreglo[i+1] = arreglo[i];
        }

        arreglo[0] = ultimo;

        System.out.println("El arreglo final es");
        for(int i=0; i< 10; i++){
            System.out.print(arreglo[i] + " ");
        }
    }
}
