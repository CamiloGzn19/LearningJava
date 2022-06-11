package Ejercicios;

import javax.swing.*;

/*
Pedir 10 números, y mostrar al final si se
ha introducido alguno negativo
 */
public class Ejercicio_21 {
    public static void main(String[] args) {
        int numero;
        boolean neg = false;
        for (int i=1; i <= 10; i++){
            numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número"));
            if (numero < 0) {
                neg = true;
            }
        }
        if (neg) {
            JOptionPane.showMessageDialog(null, "Se ha ingresado un número negativo");
        } else {
            JOptionPane.showMessageDialog(null, "No se ha ingresado un número negativo");
        }
    }
}
