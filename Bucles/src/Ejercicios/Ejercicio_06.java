package Ejercicios;
/*
Pedir números hasta que se teclee un 0,
mostrar la suma de todos los números
introducidos
 */

import javax.swing.*;

public class Ejercicio_06 {
    public static void main(String[] args) {
        int numero, suma = 0;

        do {
            numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número"));
            suma += numero;
        } while (numero != 0);

        JOptionPane.showMessageDialog(null, "La suma de los número ingresados es de: " + suma);

    }
}
