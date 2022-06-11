package Ejercicios;

import java.util.Scanner;

/*
Leer los datos correspondientes a dos tablas de 12
elementos numéricos, y mezclarlos en una tercera de la
forma: 3 de la tabla A, 3 de la B, otros 3 de A, otros
3 de B, etc.
Finalizado
 */
public class Ejercicio_06 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[] a = new int[12];
        int[] b = new int[12];
        int[] c = new int[24];
        int i, j;

        for(i = 0; i < 12; i ++){
            System.out.print("Ingrese el valor " + (i+1) + " para la tabla A: ");
            a[i] = entrada.nextInt();
        }

        for(i = 0; i < 12; i ++){
            System.out.print("Ingrese el valor " + (i+1) + " para la tabla B: ");
            b[i] = entrada.nextInt();
        }

        i = 0;
        j = 0;

        while(i < 12){
        // Copiar los 3 elementios de a[]
            for (int k=0; k<3;k++){
                c[j] = a[i+k];
                j++;
            }

            // Copiar 3 elementos de b[]
            for (int k=0; k<3; k++){
                c[j] = b[i+k];
                j++;
            }
            i += 3;
        }

        System.out.println("El arreglo resultante es: ");
        for(i=0;i<24;i++){
            System.out.print(c[i]+ " - ");
        }
        System.out.println();
    }
}
