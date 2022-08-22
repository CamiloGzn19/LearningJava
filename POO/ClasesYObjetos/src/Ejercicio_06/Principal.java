package Ejercicio_06;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        NumeroComplejo numero1, numero2, suma, mult;
        double a,b,c,d;
        int opcion, numero;

        do {
            System.out.println("Operaciones con números complejos");
            System.out.println("1. Sumar 2 números complejos");
            System.out.println("2. Multiplicar 2 números complejos");
            System.out.println("3. Comparar 2 números complejos");
            System.out.println("4. Multiplicar un número complejo por uno entero");
            System.out.println("5. Salir");
            System.out.println("Digite la opción de menú: ");
            opcion = entrada.nextInt();

            switch (opcion) {
                case 1 -> {
                    System.out.print("Digite el primer número complejo: ");
                    System.out.print("Digite la parte real: ");
                    a = entrada.nextDouble();
                    System.out.print("Digite la parte imaginaria: ");
                    b = entrada.nextDouble();
                    System.out.println("Digite el segundo número");
                    System.out.println("Digite la parte real: ");
                    c = entrada.nextDouble();
                    System.out.println("Digite la parte imaginaria: ");
                    d = entrada.nextDouble();
                    numero1 = new NumeroComplejo(a, b);
                    numero2 = new NumeroComplejo(c, d);
                    suma = numero1.calcularSuma(numero2);
                    System.out.println("La suma es: " + suma.getA() + " + " + suma.getB() + "i");
                }
                case 2 -> {
                    System.out.print("Digite el primer número complejo: ");
                    System.out.print("Digite la parte real: ");
                    a = entrada.nextDouble();
                    System.out.print("Digite la parte imaginaria: ");
                    b = entrada.nextDouble();
                    System.out.println("Digite el segundo número");
                    System.out.println("Digite la parte real: ");
                    c = entrada.nextDouble();
                    System.out.println("Digite la parte imaginaria: ");
                    d = entrada.nextDouble();
                    numero1 = new NumeroComplejo(a, b);
                    numero2 = new NumeroComplejo(c, d);
                    mult = numero1.calcularProducto(numero2);
                    System.out.println("La multiplicación es: " + mult.getA() + " + " + mult.getB() + "i");
                }
                case 3 -> {
                    System.out.print("Digite el primer número complejo: ");
                    System.out.print("Digite la parte real: ");
                    a = entrada.nextDouble();
                    System.out.print("Digite la parte imaginaria: ");
                    b = entrada.nextDouble();
                    System.out.println("Digite el segundo número");
                    System.out.println("Digite la parte real: ");
                    c = entrada.nextDouble();
                    System.out.println("Digite la parte imaginaria: ");
                    d = entrada.nextDouble();
                    numero1 = new NumeroComplejo(a, b);
                    numero2 = new NumeroComplejo(c, d);
                    if (numero1.comprobarIgualdad(numero2)) {
                        System.out.println("Los números complejos son iguales");
                    } else {
                        System.out.println("Los números complejos no son iguales");
                    }
                }
                case 4 -> {
                    System.out.print("Digite el número complejo: ");
                    System.out.print("Digite la parte real: ");
                    a = entrada.nextDouble();
                    System.out.print("Digite la parte imaginaria: ");
                    b = entrada.nextDouble();
                    System.out.println("Digite el número entero");
                    numero = entrada.nextInt();
                    numero1 = new NumeroComplejo(a, b);
                    mult = numero1.multiplicarPorEntero(numero);
                    System.out.println("La multiplicación es: " + mult.getA() + " + " + mult.getB() + "i");
                }
            }
            System.out.println();
        }while (opcion != 5);
    }
}
