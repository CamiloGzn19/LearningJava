package Ejercicios;

import java.util.Scanner;

/*
Crear y cargar una matriz de tamaño n x m, mostrar la suma de cada fila
y de cada columna
 */
public class Ejercicio_05 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int n, m, sumaFilas, sumaColumnas;
        int[][] matriz1;

        System.out.println("Ingrese n: ");
        n = entrada.nextInt();

        System.out.println("Ingrese m: ");
        m = entrada.nextInt();

        matriz1 = new int[n][m];

        System.out.println("Ingrese la matriz 1: ");
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                System.out.print("Matriz["+i+"]["+j+"]: ");
                matriz1[i][j] = entrada.nextInt();
            }
        }

        System.out.println("Matriz base");
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++) {
                System.out.print(matriz1[i][j]);
            }
            System.out.println();
        }

        System.out.println();

        // Recorrer filas
        for(int i=0; i<n; i++){
            sumaFilas = 0;
            for(int j=0;j<m;j++){
                sumaFilas += matriz1[i][j];
            }
            System.out.println("La suma de la fila["+i+"] es: "+sumaFilas);
        }

        // Recorrer columnas
        for(int j=0;j<m;j++){
            sumaColumnas = 0;
            for(int i=0; i<n; i++){
                sumaColumnas += matriz1[i][j];
            }
            System.out.println("La suma de la columna["+j+"] es: "+sumaColumnas);
        }
        System.out.println();
    }
}
