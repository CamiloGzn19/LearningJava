package Ejercicios;

/*
Pedir número hasta que se teclee uno negativo,
y mostrar cuántos números se han introducido.
 */

import javax.swing.*;

public class Ejercicio_04 {
    public static void main(String[] args) {
        int numero, conteo;

        numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número: "));

        for (conteo = 1; numero >= 0; conteo++) {
            numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número: "));
            if (numero < 0){
                JOptionPane.showMessageDialog(null, "La cantidad de números analizados fue de: " + conteo);
            }
        }
    }
}
