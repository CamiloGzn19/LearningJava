package Ejercicios;

import javax.swing.*;

/*
Pedir 10 números y escribir la suma total
 */
public class Ejercicio_10 {
    public static void main(String[] args) {
        int numero, suma = 0;
        for (int i = 1; i <= 10; i++){
            numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número"));
            suma += numero;
        }
        JOptionPane.showMessageDialog(null, "La suma de los número es: " + suma);
    }
}
