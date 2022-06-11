package Ejercicios;
/*
Pedir una nota de 0 a 10 y
mostrarla de la forma:
Insuficiente, Suficiente, Bien,
Notable y sobresaliente
 */

import javax.swing.*;

public class Ejercicio_12 {
    public static void main(String[] args){
        int nota;

        nota = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la nota"));

        if (nota < 0 || nota > 10){
            JOptionPane.showMessageDialog(null, "Nota incorrecta");
        }
        if (nota >= 0 && nota <= 5) {
            JOptionPane.showMessageDialog(null, "Insuficiente");
        } else if (nota >= 6 && nota <= 7) {
            JOptionPane.showMessageDialog(null, "Suficiente");
        } else if (nota >= 8 && nota <= 9) {
            JOptionPane.showMessageDialog(null, "Bien");
        } else if (nota >= 9 && nota <= 9.5){
            JOptionPane.showMessageDialog(null, "Notable");
        } else if (nota >= 9.6 && nota <= 10) {
            JOptionPane.showMessageDialog(null, "Sobresaliente");
        }
    }
}
