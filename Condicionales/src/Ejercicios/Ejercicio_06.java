package Ejercicios;

/*
Hacer un programa que
tome dos números y diga
si ambos son pares o impares
 */

import javax.swing.*;

public class Ejercicio_06 {
    public static void main(String[] args){
        int a,b;

        a = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el primer número"));
        b = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el segundo número"));

        if (a%2 == 0 && b%2 == 0){
            JOptionPane.showMessageDialog(null, "Ambos números son pares");
        } else if (a%2 != 0 && b%2 != 0) {
            JOptionPane.showMessageDialog(null, "Ambos números son impares");
        } else {
            JOptionPane.showMessageDialog(null, "Uno es par y el otro impar");
        }

    }
}
