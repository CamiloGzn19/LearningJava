package Ejercicio_03;

import java.util.Scanner;

public class Principal {

    public static int indiceCocheMBarato(Autos[] coches) {
        float precio;
        int indice = 0;

        precio = coches[0].getPrecio();
        for(int i=1; i< coches.length;i++){
            if(coches[i].getPrecio() < precio) {
                precio = coches[i].getPrecio();
                indice = i;
            }
        }
        return indice;
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String marca, modelo;
        float precio;
        int numeroAutos, indiceBarato;

        System.out.println("Digite la cantidad de vehículos: ");
        numeroAutos = entrada.nextInt();

        // Crear objetos para coches
        Autos[] coches = new Autos[numeroAutos];

        for(int i=0;i<coches.length;i++){
            entrada.nextLine();
            System.out.println("\nDigite las características del coche " + (i+1) + " ");
            System.out.print("Introduzca marca: ");
            marca = entrada.nextLine();
            System.out.print("Introduzca modelo: ");
            modelo = entrada.nextLine();
            System.out.print("Introduzca precio: ");
            precio = entrada.nextFloat();

            coches[i] = new Autos(marca, modelo, precio);
        }

        indiceBarato = indiceCocheMBarato(coches);
        System.out.println("\nEl coche más barato es: ");
        System.out.println(coches[indiceBarato].mostrarDatos());

    }
}
