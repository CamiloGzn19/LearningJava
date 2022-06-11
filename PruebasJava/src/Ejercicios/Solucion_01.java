package Ejercicios;

import java.util.Scanner;

public class Solucion_01 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        float nota1, nota2, nota3, suma;

        // Guardar las 3 notas
        System.out.print("Digite 3 calificaciones: ");
        nota1 = entrada.nextFloat();
        nota2 = entrada.nextFloat();
        nota3 = entrada.nextFloat();

        // Calcular suma
        suma = nota1 + nota2 + nota3;

        System.out.println("La suma es: " + suma);

    }
}
