package Ejercicios;

import javax.swing.*;

/*
Dadas 6 notas, escribir la cantidad de alumnos
aprobados, condicionados (=4) y suspensos.
 */
public class Ejercicio_19 {
    public static void main(String[] args) {
        int aprobados = 0, condicionales = 0, suspensos= 0;
        float notas;
        for (int i = 1; i<= 6; i++){
            do{
                notas = Float.parseFloat(JOptionPane.showInputDialog("Ingrese la nota"));
            } while (notas < 1 || notas > 10);

            if (notas > 4) {
                aprobados ++;
            } else if (notas == 4) {
                condicionales ++;
            } else {
                suspensos ++;
            }
        }
        JOptionPane.showMessageDialog(null, "La cantidad de alumnos que aprobaron es de: " + aprobados);
        JOptionPane.showMessageDialog(null, "La cantidad de alumnos que están condicionados es de: " + condicionales);
        JOptionPane.showMessageDialog(null, "La cantidad de alumnos que suspendieron es de: " + suspensos);
    }
}
