package Condicionales;
/*
Explicación de sentencia if else
    == Igualdad
    != Diferencia
    > Mayor | >= Mayor o igual
    < Menor | <= Menor o igual

 */

import javax.swing.*;

public class SentenciaIfElse {
    public static void main(String[] args){
        int numero, dato = 5;

        numero = Integer.parseInt(JOptionPane.showInputDialog("Digita un número: "));

        if(numero == dato){
            JOptionPane.showMessageDialog(null, "El número es 5");
        } else {
            JOptionPane.showMessageDialog(null, "El número es distinto a 5");
        }

        if(numero != 5){
            JOptionPane.showMessageDialog(null, "No es 5");
        } else {
            JOptionPane.showMessageDialog(null, "Este si es un 5");
        }

        if(numero >= 0){
            JOptionPane.showMessageDialog(null, "El número es positivo");
        } else {
            JOptionPane.showMessageDialog(null, "El número es negativo");
        }

    }
}
