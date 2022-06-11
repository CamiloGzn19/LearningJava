package Ejercicios;
/*
Pedir 10 sueldos. Mostrar su suma y cuantos
 hay mayores de $1000*/

import javax.swing.*;

public class Ejercicio_14 {
    public static void main(String[] args) {
        int sueldo, suma = 0, count = 0;
        for(int i = 1; i<10; i++){
            sueldo = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el sueldo"));
            if (sueldo > 1000){
                count++;
            }
            suma += sueldo;
        }
        JOptionPane.showMessageDialog(null, "La suma de los sueldos es de: " + suma + " y los sueldos mayores a $1000 son " + count);
    }
}
