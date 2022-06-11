package Ejercicios;
/*
Pedir un número
entre 0 y 99.999 y
decir cúantas cifras
tiene
 */

import javax.swing.*;

public class Ejercicio_08 {
    public static void main(String[] args){
        int num1, cifra;

        num1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número"));
        if (num1 < 10) {
            JOptionPane.showMessageDialog(null, "El número tiene 1 cifra");
        } else if (num1 < 100) {
            JOptionPane.showMessageDialog(null, "El número tiene 2 cifras");
        } else if (num1 < 1000) {
            JOptionPane.showMessageDialog(null, "El número tiene 3 cifras");
        } else if (num1 < 10000) {
            JOptionPane.showMessageDialog(null, "El número tiene 4 cifras");
        } else if (num1 < 100000) {
            JOptionPane.showMessageDialog(null, "El número tiene 5 cifras");
        }
    }
}

