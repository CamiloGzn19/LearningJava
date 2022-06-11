package Ejercicios;

import java.util.Scanner;

/*
Queremos desarrollar una aplicación que nos ayude a gestionar las notas de
un centro educativo. Cada grupo está compuesto por 5 alumnos. Se pide leer las
notas del primer, segundo y tercer trimestre de un grupo. Debemos mostrar
al final: la nota media del grupo en cada trimestre, y la media del alumno que
se encuentra en la posición N.
 */
public class Ejercicio_16 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float[] Periodo_a = new float[5];
        float[] Periodo_b = new float[5];
        float[] Periodo_c = new float[5];
        float promedio1 = 0, promedio2 = 0, promedio3 = 0;
        float alumno;

        System.out.println("Ingrese las notas de los estudiantes - P1 ");
        for(int i=0; i<5; i++){
            System.out.print("Ingrese la nota " + (i+1) + " : ");
            Periodo_a[i] = entrada.nextFloat();
        }

        System.out.println("Ingrese las notas de los estudiantes - P2 ");
        for(int i=0; i<5; i++){
            System.out.print("Ingrese la nota " + (i+1) + " : ");
            Periodo_b[i] = entrada.nextFloat();
        }

        System.out.println("Ingrese las notas de los estudiantes - P3 ");
        for(int i=0; i<5; i++){
            System.out.print("Ingrese la nota " + (i+1) + " : ");
            Periodo_c[i] = entrada.nextFloat();
        }

        for(int i=0; i < 5; i++){
            promedio1 += Periodo_a[i];
        }
        for(int i=0; i < 5; i++){
            promedio2 += Periodo_b[i];
        }
        for(int i=0; i < 5; i++){
            promedio3 += Periodo_c[i];
        }

        System.out.println("El promedio grupal P1 es: " + (promedio1/5));
        System.out.println("El promedio grupal P2 es: " + (promedio2/5));
        System.out.println("El promedio grupal P3 es: " + (promedio3/5));

        System.out.println("Ingrese el alumno");
        alumno = entrada.nextInt()-1;

        float promAl = (Periodo_a[(int) alumno] + Periodo_b[(int) alumno] + Periodo_c[(int) alumno]);
        System.out.println("El promedio del alumno fue " + (promAl/3));
    }
}
