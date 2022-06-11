package Ejercicios;

/*
Leer números hasta que se introduzca un 0.
Para cada uno indicar si es par o impar
 */

import javax.swing.*;

public class Ejercicio_03 {
    public static void main(String[] args) {
        int numero;
        numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número: "));

        while (numero != 0) {
            if (numero % 2 == 0) {
                JOptionPane.showMessageDialog(null, "El número " + numero + " es par");
            } else {
                JOptionPane.showMessageDialog(null, "El número " + numero + " es impar");
            }
            numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número: "));
        }
    }
}
