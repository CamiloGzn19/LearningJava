package Ejercicios;

import javax.swing.*;

/*
Pedir 10 números. Mostrar la media de los números
positivos, la media de los números negativos y
la cantidad de ceros.
 */
public class Ejercicio_13 {
    public static void main(String[] args) {
        int numero, contP = 0, contN = 0, sumP = 0, sumN = 0, zero = 0;
        float medP, medN;

        for (int i = 1; i <= 10; i++){
            numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número"));
            if (numero > 0){
                contP++;
                sumP += numero;
            } else if (numero < 0) {
                contN++;
                sumN += numero;
            } else {
                zero ++;
            }
        }

        medN = (float)sumN/contN;
        medP =  (float)sumP/contP;
        JOptionPane.showMessageDialog(null, "La media de los positivos es: " + medP);
        JOptionPane.showMessageDialog(null, "La media de los positivos es: " + medN);
        JOptionPane.showMessageDialog(null, "La cantidad de ceros es de: " + zero);
    }
}
