package Ejercicios;

import java.util.Scanner;

/*
Leer 10 enteros ordenados crecientemente. Leer N y buscarlo en la tabla.
Se debe mostrar la posición en que se encuentra. Si no está, indicarlo con
un mensaje
 */
public class Ejercicio_15 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[] arreglo = new int[10];
        int numero, posicion = 0;
        boolean empty = true;
        boolean creciente = true;

        System.out.println("Ingrese los números en orden creciente");
        
        do{
            for(int i=0; i<10 ;i++){
                System.out.print("Ingrese el número " + (i+1) + " a la tabla: ");
                arreglo[i] = entrada.nextInt();
            }
            
            for(int i=0;i<9;i++){
                if(arreglo[i] < arreglo[i+1]){
                    creciente = true;
                }
                if(arreglo[i] > arreglo[i+1]){
                    creciente = false;
                    break;
                }
            }
            
            if(!creciente){
                System.out.println("Escriba los números en orden creciente");
            }
            
        } while (!creciente);

        System.out.println("Ingrese un número para buscar");
        numero = entrada.nextInt();
        
        for(int i=0; i<10; i++){

            if(arreglo[i] == numero){
                posicion = arreglo[i];
                empty = false;
            }
        }

        if(empty){
            System.out.println("El número no se encuentra en la tabla");
        } else {
            System.out.println("El número " + numero + " está en la posición " + posicion);
        }
    }
}
