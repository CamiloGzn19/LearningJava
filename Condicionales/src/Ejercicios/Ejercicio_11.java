package Ejercicios;
/*
Construir un programa que simule el funcionamiento
de una calculadora que puede realizar las cuatro
operaciones aritmeticas básicas (+, -, *, /) con
valores numéricos enteros. El usuario debe especificar
la operación con el primer carácter del primer parámetro
de la línea de comandos: S para suma, R para resta, M
multiplicar, D para dividir.
 */

import javax.swing.*;

public class Ejercicio_11 {
    public static void main(String[] args){
        int a, b, suma, resta, mult, div;
        char sig;

        a =  Integer.parseInt(JOptionPane.showInputDialog("Ingrese el primer valor"));
        sig = JOptionPane.showInputDialog("Ingrese la operación").charAt(0);
        b =  Integer.parseInt(JOptionPane.showInputDialog("Ingrese el segundo valor valor"));
        
        switch (sig){
            case 's':
            case 'S':
                suma = a + b;
                JOptionPane.showMessageDialog(null, "La suma es: "  + suma);
                break;
            case 'r':
            case 'R':
                resta = a - b;
                JOptionPane.showMessageDialog(null, "La resta es: "  + resta);
                break;
            case 'm':
            case 'M':
                mult = a * b;
                JOptionPane.showMessageDialog(null, "La multiplicación es: " + mult);
                break;
            case 'd':
            case 'D':
                div = a / b;
                JOptionPane.showMessageDialog(null, "La división es: " + div);
                break;
            default:
                JOptionPane.showMessageDialog(null, "Operación inválida");
        }
    }
}
