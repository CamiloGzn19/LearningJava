package Ejercicios;
/*
Pedir el día, mes y año de
una fecha e indicar si la fecha
es correcta. Suponiendo que todos
los meses son de 30 días
 */

import javax.swing.*;

public class Ejercicio_09 {
    public static void main(String[] args){
        int dia, mes, año;

        dia = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el día"));
        mes = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el mes"));
        año = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el año"));

        if(dia>=1 && dia<=30) {
            if(mes>=1 && mes<= 12) {
                if (año != 0) {
                    JOptionPane.showMessageDialog(null, "Fecha correcta");
                } else {
                    JOptionPane.showMessageDialog(null, "Fecha incorrecta, año incorrecto");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Fecha incorrecta, mes incorrecto");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Fecha incorrecta, día incorrecto");
        }
    }
}
