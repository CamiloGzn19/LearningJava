package Ejercicios;
/*
Diseñar un programa que muestre el
producto de los 10 primeros números
impares
 */

import javax.swing.*;

public class Ejercicio_11 {
    public static void main(String[] args) {
        int prod = 1;
        for(int i = 1; i < 20; i+= 2){
            prod *= i;
        }
        JOptionPane.showMessageDialog(null, "El producto de los números es: " + prod);
    }
}
