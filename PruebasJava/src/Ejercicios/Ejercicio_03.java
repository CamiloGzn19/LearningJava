/* Guillermo tiene N dólares.
Luis tiene la mitad de lo que
posee Guillermo. Juan tiene la
mitad de lo que poseen Luis y
Guillermo juntos. Hacer un programa
que calcule e imprima la cantidad
de dinero que tienen entre los 3
 */

package Ejercicios;

import java.util.Scanner;

public class Ejercicio_03 {
    public static void main(String[] args){
        int guille, juan, luis, resultado;
        Scanner entrada = new Scanner(System.in);
        System.out.print("¿Cúanto tiene guille?");
        guille = entrada.nextInt();
        luis = guille / 2;
        juan = (luis + guille) / 2;
        resultado = guille + luis + juan ;

        System.out.println(resultado);
    }
}
