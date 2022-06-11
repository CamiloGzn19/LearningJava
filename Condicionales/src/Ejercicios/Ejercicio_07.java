package Ejercicios;

/*
Pedir tres números y
mostrarlos ordenados de mayor
a menor
 */

import javax.swing.*;

public class Ejercicio_07 {
    public static void main(String[] args){
        int a, b, c;

        a = Integer.parseInt(JOptionPane.showInputDialog("Ingrese número 1"));
        b = Integer.parseInt(JOptionPane.showInputDialog("Ingrese número 2"));
        c = Integer.parseInt(JOptionPane.showInputDialog("Ingrese número 3"));

        if (a > b && b > c) {
            JOptionPane.showMessageDialog(null, "El orden es: " + a + " " + b + " " + c);
        } else if (a > c && c > b ){
            JOptionPane.showMessageDialog(null, "El orden es: " + a + " " + c + " " + b);
        } else if (b > a && a > c){
            JOptionPane.showMessageDialog(null, "El orden es: " + b + " " + a + " " + c);
        } else if (b > c && c > a){
            JOptionPane.showMessageDialog(null, "El orden es: " + b + " " + c + " " + a);
        } else if (c > a && a > b) {
            JOptionPane.showMessageDialog(null, "El orden es: " + c + " " + a + " " + b);
        } else {
            JOptionPane.showMessageDialog(null, "El orden es: " + c + " " + b + " " + a);
        }
    }
}
