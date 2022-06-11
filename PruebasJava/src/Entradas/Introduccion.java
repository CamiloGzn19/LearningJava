package PruebasJava.src.Entradas;

import javax.swing.*;
import java.util.Scanner;

public class Introduccion {
    public static void main(String[] args) {
        // Entrada y salida con ventana
        Scanner entrada = new Scanner(System.in);
        String let;
        System.out.print("Digite una let: ");
        let = String.valueOf(entrada.next().charAt(0));
        System.out.println("Su letra es: " + let);

        // Entrada y salida con ventana
        String cadena;
        int entero;
        char letra;
        double decimal;

        cadena = JOptionPane.showInputDialog("Digite una cadena: ");
        entero = Integer.parseInt(JOptionPane.showInputDialog("Digite un entero: "));
        letra = JOptionPane.showInputDialog("Digite un caracter: ").charAt(0);
        decimal = Double.parseDouble(JOptionPane.showInputDialog("Digite un decimal: "));

        JOptionPane.showMessageDialog(null, "La cadena es " + cadena);
        JOptionPane.showMessageDialog(null, "El entero es " + entero);
        JOptionPane.showMessageDialog(null, "La letra es " + letra);
        JOptionPane.showMessageDialog(null, "El decimal es " + decimal);
    }
}

/* Con Scanner guardamos datos */
