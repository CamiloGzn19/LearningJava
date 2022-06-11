package Ejercicios;
/*
Pedir dos números y
decir cual es el mayor
o si son iguales
 */

import javax.swing.*;

public class Ejercicio_02 {
    public static void main(String[] args){
        int num1, num2;

        num1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el primer número"));
        num2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el primer número"));

        if (num1 > num2){
            JOptionPane.showMessageDialog(null, "El número "+ num1 +" es mayor a "+ num2);
        } else if (num2 > num1) {
            JOptionPane.showMessageDialog(null, "El número "+ num2 +" es mayor a "+ num1);
        } else {
            JOptionPane.showMessageDialog(null, "El número "+ num2 +" es igual a "+ num1);
        }

    }
}
