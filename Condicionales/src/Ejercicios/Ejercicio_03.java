package Ejercicios;

/*
Programa que lea un
carácter por teclado y
compruebe si es una letra
mayúscula
 */

import javax.swing.*;

public class Ejercicio_03 {
    public static void main(String[] args){
        char letra;

        letra = JOptionPane.showInputDialog("Digito un letra").charAt(0);

        if (Character.isUpperCase(letra)) {
            JOptionPane.showMessageDialog(null, "La letra es mayúscula");
        } else {
            JOptionPane.showMessageDialog(null, "La letra es minúscula");
        }
    }
}
