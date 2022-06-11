package Ciclos;

/* Ciclo While
* While(condición){
*   Instrucciones;
* }
* */

import java.util.Scanner;

public class Ciclo_While {
    public static void main(String[] args){
        int i = 1, s = 10;
        int contador;

        Scanner entrada = new Scanner(System.in);
        // Adding
        while (i <= 10) {
            System.out.println(i);
            i++;
        }
        // Decreasing
        while (s >= 1) {
            System.out.println(s);
            s--;
        }
        // Custom
        System.out.println("Cuantos números quiere en pantalla");
        contador = entrada.nextInt();

        while (i <= contador) {
            System.out.println(i);
            i+= 2;
        }
    }
}
