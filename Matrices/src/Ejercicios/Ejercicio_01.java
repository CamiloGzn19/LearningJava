package Ejercicios;

import javax.swing.*;
import java.util.Scanner;

/*
Matriz simétrica
1) #Filas = #Columnas
2) Cambiar Filas x Columas es =

| 0  1 -2|     | 0  1 -2|
| 1  3  0|  →  | 1  3  0|
|-2  0  5|     |-2  0  5|



Crear y cargar una matriz de tamaño n x m y decir si es simétrica o no.
 */
public class Ejercicio_01 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[][] matriz;
        int nFilas, nCol;
        boolean simetrica = true;

        nFilas = Integer.parseInt(JOptionPane.showInputDialog("Digite el número de filas"));
        nCol = Integer.parseInt(JOptionPane.showInputDialog("Digite el número de columnas"));

        matriz = new int[nFilas][nCol];

        System.out.println("Digite una matríz: ");
        for(int i=0; i<nFilas; i++){
            for(int j=0; j<nCol;j++){
                System.out.println("Matriz["+i+"]["+j+"]:");
                matriz[i][j] = entrada.nextInt();
            }
        }

        if(nFilas == nCol){ // Si el número de filas es igual al número de columnas
            int i, j;
            i = 0;
            while(i<nFilas && simetrica){
                j = 0;
                while(j<i && simetrica) {
                    if(matriz[i][j] != matriz[j][i]){
                        simetrica = false;
                    }
                    j++;
                }
                i++;
            }

            if(simetrica){
                JOptionPane.showMessageDialog(null, "La matriz es simétrica");
            } else {
                JOptionPane.showMessageDialog(null, "La matriz NO es simétrica");
            }
        } else {
            JOptionPane.showMessageDialog(null, "La matriz no es simétrica");
        }

    }
}
