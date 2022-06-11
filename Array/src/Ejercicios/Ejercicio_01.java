package Ejercicios;
/*
Leer 5 números, guardarlos en un arreglo y
mostrarlos en el mismo orden introducido
 */
import javax.swing.*;

public class Ejercicio_01 {
    public static void main(String[] args) {

        int[] numbers = new int[5];
        for(int i = 0; i < 5; i++){
            numbers[i] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor número " + (i+1)));
        }

        System.out.println("\nLos números fueron");
        for(Integer i:numbers){
            System.out.println(i);
        }
    }
}
