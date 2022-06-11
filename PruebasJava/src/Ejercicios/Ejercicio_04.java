/*
Una compañia de venta de carros
usados, paga su personal de ventas un salario
de $1000 mensuales, mas una comisión de $150
por cada carro vendido, más el 5% del valor
de la venta por carro. Cada mes el capturista
de la empresa ingresa en la computadora los datos
pertinentes. Hacer un programa que calcule e imprima
el salario mensual de un vendedor dado
 */

package Ejercicios;

import java.util.Scanner;

public class Ejercicio_04 {
    public static void main(String[] args){
        int salario = 1000, comision = 150, ventas;
        float valorE = .05f;
        int carros, salarioF;

        Scanner entrada = new Scanner(System.in);
        // Capturar datos
        System.out.println("Ingrese el número de carros vendidos");
        carros = entrada.nextInt();
        System.out.println("Ingrese el valor de los carros");
        ventas = entrada.nextInt();
        salarioF = (int) (salario + (comision * carros) + ((ventas * carros)*valorE));

        System.out.println("Su salario final es de: " + salarioF);
    }
}
