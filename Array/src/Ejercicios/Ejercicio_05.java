package Ejercicios;

import javax.swing.*;

/*
Leer por teclado dos tablas de 10 números enteros
y mezclarlas en una tercera de la forma: el 1° de A,
el 1° de B, el 2° de A, el segundo de B, etc.
 */
public class Ejercicio_05 {
    public static void main(String[] args) {
        int[] numbersA = new int[10];
        int[] numbersB = new int[10];
        int[] tableF = new int[20];

    for(int i = 0; i < 10; i++){
        numbersA[i] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor " + (i+1) + " para la tabala A"));
    }

    for(int i = 0; i < 10; i++){
        numbersB[i] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor " + (i+1) + " para la tabala B"));
    }
    // Iterador independiente
    int j = 0;
    for(int i = 0; i < 10; i++){
        tableF[j] = numbersA[i]; // Primer elemento del a y sucesivamente
        j++;
        tableF[j] = numbersB[i]; // Primer elemento del b y sucesivamente
        j++;
    }

        System.out.print("\nEl tecer arreglo es: ");
        for(int i= 0; i< 20; i++){
            System.out.print(tableF[i]+" ");
        }
        System.out.println();

    }
}
