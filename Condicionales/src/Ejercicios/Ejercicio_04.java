package Ejercicios;

/*
En megaplaza se hace un 20% de
descuento a los clientes cuya
compra supere los $300. ¿Cúal
será la cantidad que pagará una
persona por su compra
 */

import javax.swing.*;

public class Ejercicio_04 {
    public static void main(String[] args){
        int compra, fin;

        compra = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor de la compra"));

        if (compra > 300) {
            fin = (int) (compra - (compra * .2));
        } else {
            fin = compra;
        }

        JOptionPane.showMessageDialog(null, "El total de la compra es "+ fin);
    }
}

