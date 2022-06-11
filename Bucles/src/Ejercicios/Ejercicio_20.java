package Ejercicios;

import javax.swing.*;

/*
Pedir un número N, introducir N sueldos, y mostrar
el sueldo máximo
 */
public class Ejercicio_20 {
    public static void main(String[] args) {
        int cantidad, sueldo, sueldoMax = 0;
        cantidad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de sueldos a evaluar"));

        for (int i = 1; i <= cantidad; i++){
            sueldo = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el sueldo"));
            if (sueldo > sueldoMax){
                sueldoMax =sueldo;
            }
        }
        JOptionPane.showMessageDialog(null, "El sueldo máximo es de: " + sueldoMax);
    }
}
