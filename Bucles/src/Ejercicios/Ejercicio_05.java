package Ejercicios;

import javax.swing.*;

/*
Realizar un juego para adivinar un número. Para ello generar
un número aleatorio entre 0-100, y luego ir pidiendo números
indicados "Es mayor" o "Es menor" según sea mayor o menor con
respecto a N. El proceso termina cuando el usuario acierta y
se muestra el número de intentos
 */
public class Ejercicio_05 {
    public static void main(String[] args) {
        int random = (int) Math.floor(Math.random()*100);
        int contador = 0, numero;

        do {
            numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número"));

            if(random > numero){
                System.out.println("El número es mayor");
            } else {
                System.out.println("El número es menor");
            }
            contador ++;
        } while (numero != random);

        System.out.println("\nAcertaste con solo " + contador + " intentos");

    }
}
