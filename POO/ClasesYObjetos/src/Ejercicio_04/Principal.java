package Ejercicio_04;

import java.util.Scanner;

public class Principal {

    public static int indiceGanador (Atleta[] atletas) {
        float tiempoCarrera;
        int indice = 0;
        tiempoCarrera = atletas[indice].getTiempoCarrera();

        for(int i=1; i < atletas.length;i++){
            if(atletas[i].getTiempoCarrera() < tiempoCarrera){
                tiempoCarrera = atletas[i].getTiempoCarrera();
                indice = i;
            }
        }
        return indice;
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String nombre;
        int numeroAtleta, nAtletas, indiceAtletaGanador;
        float tiempoCarrera;

        System.out.print("Digite el número de atletas: ");
        nAtletas = entrada.nextInt();

        // Creamos los objetos para cada atleta
        Atleta[] atletas = new Atleta[nAtletas];

        for(int i=0; i<atletas.length;i++){
            System.out.println("\nDigite los datos del atleta: "+(i+1)+": ");
            System.out.print("Introduzca el número de atleta: ");
            numeroAtleta = entrada.nextInt();
            entrada.nextLine();
            System.out.print("Introduzca el nombre del atleta: ");
            nombre = entrada.nextLine();
            System.out.print("Introduzca el tiempo de carrera: ");
            tiempoCarrera = entrada.nextFloat();

            atletas[i] = new Atleta(numeroAtleta, nombre, tiempoCarrera);
        }

        indiceAtletaGanador = indiceGanador(atletas);
        System.out.println("\nEl atleta ganador es: ");
        System.out.println(atletas[indiceAtletaGanador].mostrarDatosGanador());
    }
}
