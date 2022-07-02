import javax.swing.*;
import java.util.Scanner;

/*
¿Qué es una matriz?
Una matriz es un arreglo bidimensional, necesita dos indices para acceder a sus
elementos. Gráficamente podemos representar una matriz como una tabla de n filas
y m columnas cuyos elementos son todos del mismo tipo.

La siguiente figura representa una matriz M de 3 filas y 5 columas
        0       1       2       3       4
 0  |   1   |   2   |   3   |   4   |   5   |
 1  |   2   |   4   |   6   |   8   |   10  |
 2  |   3   |   6   |   9   |   12  |   15  |

 */
public class Matriz {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[][] matriz;
        int nFilas, nCol;

        nFilas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de filas"));
        nCol = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de columnas"));

        matriz = new int[nFilas][nCol];

        // Ingresar números a la matriz
        for(int i=0; i<nFilas; i++){
            for(int j=0; j<nCol; j++){
                System.out.print("Matriz ["+i+"]["+j+"]: ");
                matriz[i][j] = entrada.nextInt();
            }
        }

        // Iterador para las filas (i) para columnas (j)
        System.out.println("\nLa Matriz es ");
        for(int i=0; i<nFilas; i++){
            for(int j=0; j<nCol; j++){
                System.out.print(matriz[i][j]);
            }
            System.out.println();
        }

    }
}
