/*
Construir un programa que, dado un número
total de horas, devuelve el número de
semanas, días y horas equivalentes.
Por ejemplo, dado un total de 1000 horas
debe mostrar 5 semanas, 6 días y 16 horas
 */

package Ejercicios;

import java.util.Scanner;

public class Ejercicio_07 {
    public static void main(String[] args){
        int inicial, sem, dia, hor;

        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de horas: ");
        inicial = entrada.nextInt();

        sem = inicial / 168;
        dia = inicial%168 / 24;
        hor = inicial%24;

        System.out.println("El número de semanas es: " + sem);
        System.out.println("El número de días es: " + dia);
        System.out.println("El número de horas es: " + hor);

    }
}
