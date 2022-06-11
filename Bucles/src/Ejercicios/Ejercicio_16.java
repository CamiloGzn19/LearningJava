package Ejercicios;

import javax.swing.*;

/*
Pide un número (entre 0 y 10) y
mostrar la tabla de multiplicar de
dicho número
 */
public class Ejercicio_16 {
    public static void main(String[] args) {
        int numero;
        numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número entre el 0 y el 10"));
        if (numero >= 0 && numero <= 10){
            for (int i = 1; i <= 10; i++){
                System.out.println(numero + " x " + i + " es igual a " + numero * i);
            }
        } else {
            JOptionPane.showMessageDialog(null, "El número ingresado no es válido");
        }
    }
}
