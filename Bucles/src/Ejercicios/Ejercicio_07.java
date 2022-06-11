package Ejercicios;
/*
Pedir números hasta que se introduzca
uno negativo, y calcular la media
 */

import javax.swing.*;

public class Ejercicio_07 {
    public static void main(String[] args) {
        int numero, conteo = 0,suma = 0, media;

        numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número"));

        while (numero >= 0){
            conteo ++;
            suma += numero;
            numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número"));
        }

        if(conteo == 0) {
            JOptionPane.showMessageDialog(null, "Datos inválidos");
        } else {
            media = suma/conteo;
            JOptionPane.showMessageDialog(null, "La media de los números ingresados es de: " + media);
        }
    }
}
