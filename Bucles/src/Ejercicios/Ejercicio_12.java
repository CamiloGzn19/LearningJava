package Ejercicios;
/*
Pedir un número y calcular su factorial
 */

import javax.swing.*;

public class Ejercicio_12 {
    public static void main(String[] args) {
        int numero, fac = 1;
        numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número"));
        for (int i = 1; i <= numero; i++){
            fac *= i;
        }
        JOptionPane.showMessageDialog(null, "El factorial de " + numero + " es de " + fac);
    }
}
