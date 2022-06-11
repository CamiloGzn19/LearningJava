package Ejercicios;
/*
Hacer un programa que pase de kg
a otra unidad de medida de masa, mostrar
en pantalla un menú con las opciones posibles
 */

import javax.swing.*;

public class Ejercicio_14 {
    public static void main(String[] args){
        int kilos, dato;
        float resultado;

        kilos = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad"));
        dato = Integer.parseInt(JOptionPane.showInputDialog("Bienvenido a su cajero automático\n"
                + "1. Convertir a miligramos\n"
                + "2. Convertir a gramos\n"
                + "3. Convertir a libras\n"
                + "4. Convertir a toneladas\n"
                + "5. Salir"));

        switch (dato) {
            case 1: resultado = kilos * 1000000;
                JOptionPane.showMessageDialog(null, "La cantidad final es: " + resultado);
                break;
            case 2: resultado = kilos * 1000;
                JOptionPane.showMessageDialog(null, "La cantidad final es: " + resultado);
                break;
            case 3: resultado = (float) (kilos * 2.205);
                JOptionPane.showMessageDialog(null, "La cantidad final es: " + resultado);
                break;
            case 4: resultado = kilos / 1016;
                JOptionPane.showMessageDialog(null, "La cantidad final es: " + resultado);
                break;
            case 5: break;
            default: JOptionPane.showMessageDialog(null, "Opción incorrecta");
        }
    }
}
