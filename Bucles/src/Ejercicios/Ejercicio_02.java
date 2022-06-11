package Ejercicios;

/*
    Leer un número e indicar si es positivo
    o negativo. El proceso se repetira hasta
    que se introduzca un 0
 */

import javax.swing.*;

public class Ejercicio_02 {
    public static void main(String[] args) {
        int numero;
        numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número"));

        while (numero != 0){
            if (numero > 0){
                JOptionPane.showMessageDialog(null, "El número " + numero + " es positivo");
            } else {
                JOptionPane.showMessageDialog(null, "El número " + numero + " es negativo");
            }
            numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número"));
        }
    }
}
