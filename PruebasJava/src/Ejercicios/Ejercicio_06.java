/*
Hacer un programa que calcule
el cuadrado de una suma
 */
package Ejercicios;

import java.util.Scanner;

public class Ejercicio_06 {
    public static void main(String[] args){
        double a, b, resultado;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el valor de a");
        a = entrada.nextDouble();
        System.out.println("Ingrese el valor de b");
        b = entrada.nextDouble();

        resultado = Math.pow(a,2) + Math.pow(b,2)+ (2*a*b);

        System.out.println("El resultado es: " + resultado);
    }
}
