package Ejercicios;

import javax.swing.*;

/*
Haver unas modificaciones al ejercicio anterior suponiendo que
no se introduce el precio por litro. Solo existen tres productos
con precios:
1- 0.6 $Litro
2- 3 $Litro
3- 1.25 $Litro
 */
public class Ejercicio_18 {
    public static void main(String[] args) {
        int codigo, cantV, sumF;
        int factTotal = 0, LitroV1 = 0, cantFact = 0;
        float precioL = 0;

        for (int i = 1; i <= 5; i++){
            do {
                codigo = Integer.parseInt(JOptionPane.showInputDialog("Factura " + i + "\nIngrese el código"));
            } while (codigo < 1 || codigo > 3);
            cantV = Integer.parseInt(JOptionPane.showInputDialog("Factura " + i + "\nIngrese la cantidad vendida"));

            switch (codigo) {
                case 1 -> precioL = 0.6f;
                case 2 -> precioL = 3;
                case 3 -> precioL = 1.25f;
            }

            sumF = (int) (cantV * precioL);
            factTotal += sumF;

            if (codigo == 1){
                LitroV1 += cantV;
            }
            if (sumF > 600){
                cantFact ++;
            }
        }
        JOptionPane.showMessageDialog(null, "La Facturación total fue de " + factTotal);
        JOptionPane.showMessageDialog(null, "La cantidad de litros del artículo 1 es de: " + LitroV1);
        JOptionPane.showMessageDialog(null, "La cantidad de facturas de más de $600 es de: " + cantFact);
    }
}
