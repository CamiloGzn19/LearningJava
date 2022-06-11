package Ejercicios;

import javax.swing.*;

/*
Una empresa que se dedica a la venta de desinfectantes necesita un programa para
gestionar las facturas. En cada factura figura: el código del artículo, la cantidad
vendida en litros y el precio por litro. Se pide de 5 facturas introducidas: Facturación
total, cantidad en litros vendidos del artículo 1 y cuantas facturas se emitieron de más
de $600
 */
public class Ejercicio_17 {
    public static void main(String[] args) {
        int codigo, cantV, precioL, sumF;
        int factTotal = 0, LitroV1 = 0, cantFact = 0;

        for (int i = 1; i <= 5; i++){
            codigo = Integer.parseInt(JOptionPane.showInputDialog("Factura " + i + "\nIngrese el código"));
            cantV = Integer.parseInt(JOptionPane.showInputDialog("Factura " + i + "\nIngrese la cantidad vendida"));
            precioL = Integer.parseInt(JOptionPane.showInputDialog("Factura " + i + "\nIngrese el precio por litro"));

            sumF = cantV * precioL;
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
