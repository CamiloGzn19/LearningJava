package Ejercicios;

import javax.swing.*;

/*
Pedir 5 calificaciones de alumnos y decir al final si hay algún suspenso
 */
public class Ejercicio_22 {
    public static void main(String[] args) {
        int numero;
        boolean susp = false;

        for(int i=1; i <= 5; i++){
            numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la calificación del alumno " + i));
            if (numero < 5){
                susp = true;
            }
        }
        if (susp) {
            JOptionPane.showMessageDialog(null, "Si hay alumnos suspendidos");
        } else {
            JOptionPane.showMessageDialog(null, "Todos pasaron");
        }
    }
}
