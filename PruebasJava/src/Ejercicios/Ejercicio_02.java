/* Hacer un programa que
calcule e imprima el salario
semanal de un empleado a partir
de sus horas semanales trabajadas
y de su salario por hora */

package Ejercicios;

import java.util.Scanner;

public class Ejercicio_02 {
    public static void main(String[] args){
        float hora, salario, sueldo;
        Scanner entrada = new Scanner(System.in);

        // Guardar los datos
        System.out.print("Ingrese las horas de trabajo: ");
        hora = entrada.nextFloat();
        // Guardar los datos
        System.out.print("Ingrese su salario por hora: ");
        salario = entrada.nextFloat();

        sueldo = hora * salario ;

        System.out.println("Su salario semanal es: " + sueldo);
    }
}
