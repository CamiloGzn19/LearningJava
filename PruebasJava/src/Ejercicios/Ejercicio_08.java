/*
Construir un programa que calcule y muestre
por pantall las raíces de la ecuación de segundo
grado de coeficientes reales
 */

package Ejercicios;

import java.util.Scanner;

public class Ejercicio_08 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        double a, b, c, resultado1, resultado2;

        System.out.println("Ingrese el valor de a: ");
        a = entrada.nextDouble();
        System.out.println("Ingrese el valor de b: ");
        b = entrada.nextDouble();
        System.out.println("Ingrese el valor de c: ");
        c = entrada.nextDouble();

        resultado1 = (-b+Math.sqrt(Math.pow(b,2) - (4*a*c))) / (2*a);
        resultado2 = (-b-Math.sqrt(Math.pow(b,2) - (4*a*c))) / (2*a);

        System.out.println("El primer resultado es: " + resultado1);
        System.out.println("El segundo resultado es: " + resultado2);
    }
}
