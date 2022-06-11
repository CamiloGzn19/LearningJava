package Ciclos;

/* Ciclo for
    for (inicialización; condición; aumento o decremento){
        Instrucciones;
    }
 */

import java.util.Scanner;

public class Ciclo_For {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        int contador;

        System.out.println("Ingrese la cantidad de terminos: ");
        contador = entrada.nextInt();

        for(int i=2; i<=contador; i+=2){
            System.out.println(i);
        }
    }
}
