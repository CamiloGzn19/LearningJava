/* Hacer un programa que calcule
e imprima la suma
de tres calificaciones
*/

package Ejercicios;

import java.util.Scanner;

public class Ejercicio_01 {
    public static void main(String[] args){
        double nota1, nota2, nota3;
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese la primera nota: ");
        nota1 = entrada.nextFloat();
        Scanner entrada2 = new Scanner(System.in);
        System.out.print("Ingrese la segunda nota: ");
        nota2 = entrada2.nextFloat();
        Scanner entrada3 = new Scanner(System.in);
        System.out.print("Ingrese la tercera nota: ");
        nota3 = entrada3.nextFloat();

        double resultado = nota1 + nota2 + nota3;
        System.out.println(resultado);



    }
}
