package Ejercicios;

import javax.swing.*;

/*
Leer 10 números enteros, guardarlos en un arreglo.
Debemos mostrarlos en el siguiente orden: el primero,
el último, el segundo, el penúltimo, el tercero, etc.
 */
public class Ejercicio_04 {
    public static void main(String[] args) {
        int[] numbers = new int[10];

        for(int i = 0; i < 10; i++){
            numbers[i] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese los valores"));
        }

        for(int i = 0; i < 5; i ++){
                System.out.println(numbers[i]);
                System.out.println(numbers[9-i]);
        }
    }
}
