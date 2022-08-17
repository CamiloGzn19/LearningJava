package Ejercicio_02;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Tablero t1;

        int x, y, opcion, incremento=0;

        System.out.print("Digite el valor de x: ");
        x = entrada.nextInt();
        System.out.print("Digite el valor de y: ");
        y = entrada.nextInt();

        // Posición inicial
        t1 = new Tablero(x, y);

        do{
            System.out.println("\n\t.:MENU:.");
            System.out.println("1.Mover hacía arriba");
            System.out.println("2.Mover hacía abajo");
            System.out.println("3.Mover hacía la derecha");
            System.out.println("4.Mover hacía la izquierda");
            System.out.println("5.Salir");
            System.out.print("Digite la opción ");

            opcion = entrada.nextInt();

            if(opcion != 5) {
                System.out.print("\nDigite la cantidad de espacios a mover: ");
                incremento = entrada.nextInt();
            }

            switch(opcion){
                case 1: t1.moverArrriba(incremento); break;
                case 2: t1.moverAbajo(incremento); break;
                case 3: t1.moverDerecha(incremento); break;
                case 4: t1.moverIzquierda(incremento); break;
                case 5: break;
                default:
                    System.out.println("Error, escriba bien"); break;
            }

            System.out.println("\nPosición actual (x,y): " + "(" + t1.getX() + "," + t1.getY() + ")");
        }while(opcion != 5);

    }
}
