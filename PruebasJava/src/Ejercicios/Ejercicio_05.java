/*
La calificación final de un estudiante de
informatica se calcula con base a las calificaciones de
cuatro aspectos de su rendimiento académico:
participación, primer exámen parcial, segundo examen
parcial y examen final. Sabiendo que las calificaciones
anteriores entran a la calificación final con ponderaciones
del 10%, 25%, 25%, 40%. Hacer un programa que calcule
e imprima la calificación final obtenida por un estudiante
 */

package Ejercicios;

import java.util.Scanner;

public class Ejercicio_05 {
    public static void main(String[] args){
        float part, parcial1, parcial2, examen, resultado;

        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese las notas en orden");
        part = entrada.nextFloat();
        parcial1 = entrada.nextFloat();
        parcial2 = entrada.nextFloat();
        examen = entrada.nextFloat();

        resultado = (part * 0.1f) + (parcial1 * 0.25f) + (parcial2 * 0.25f) + (examen * 0.4f);

        System.out.println("Su nota final es: " + resultado);


    }
}
