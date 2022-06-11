package Ejercicios;

import javax.swing.*;

/*
Dadas las edades y alturas de 5 alumnos, mostrar la
edad y la estatura media, la cantidad de alumnos mayores de
18 años, y la cantidad de alumnos que miden más de 1.75
 */
public class Ejercicio_15 {
    public static void main(String[] args) {
        int edad, mayores = 0, altos = 0;
        float estatura, edadM, estaturaM, sumaEstatura = 0, sumaEdad = 0;

        for (int i = 1; i<=5; i++){
            edad = Integer.parseInt(JOptionPane.showInputDialog("Alumno " + i + "\nIngrese la edad"));
            estatura = Float.parseFloat(JOptionPane.showInputDialog("Alumno " + i + " \nIngrese la altura"));

            sumaEdad += edad;
            sumaEstatura += estatura;
            if (edad >= 18) {
                mayores++;
            }
            if (estatura > 1.75) {
                altos++;
            }
        }

        edadM = sumaEdad/5;
        estaturaM = sumaEstatura/5;

        JOptionPane.showMessageDialog(null, "La edad media es: " + edadM);
        JOptionPane.showMessageDialog(null, "La estatura media es: " + estaturaM);
        JOptionPane.showMessageDialog(null, "La cantidad de mayores de edad es de: " + mayores);
        JOptionPane.showMessageDialog(null, "La cantidad de estudiantes más altos de 1.75 es de: " + altos);
    }
}
