package Ciclos;

/* Ciclo do While
    do {
        Instrucciones
    }while(condición);
 */

import java.util.Scanner;

public class Ciclo_doWhile {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int i = 1, contador;

        System.out.println("Digite la cantidad de terminos");
        contador = entrada.nextInt();

        // Se ejecuta mínimo una vez luego revisa
        do{
            System.out.println(i);
            i+=3;
        } while(i<=contador);
    }
}
