package Ejercicios;

import javax.swing.*;

/*
Leer 5 números por teclado, almacenarlos en un arreglo
y a continuación realizar la media de los números positivos,
la media de los negativos y contar el números de ceros.
 */
public class Ejercicio_03 {
    public static void main(String[] args) {
        float[] numbers = new float[5];
        int pos = 0, neg = 0, zeros = 0, positives = 0, negatives = 0;
        float medP, medN;

        for(int i  = 0; i < 5; i++){
            numbers[i] = Float.parseFloat(JOptionPane.showInputDialog("Ingrese el número: "));
        }

        for (int i = 0; i < numbers.length; i++){
            if (numbers[i] > 0){
                positives += numbers[i];
                pos ++;
            } else if (numbers[i] < 0) {
                negatives += numbers[i];
                neg ++;
            } else {
                zeros ++;
            }
        }

        medP = (float) positives/pos;
        medN = (float) negatives/neg;

        System.out.println("La media de positivos es de: " + medP);
        System.out.println("La media de negativos es de: " + medN);
        System.out.println("La cantidad de ceros es de: " + zeros);

    }
}
