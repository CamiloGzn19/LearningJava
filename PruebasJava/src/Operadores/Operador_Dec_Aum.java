package Operadores;

public class Operador_Dec_Aum {
    public static void main(String[] args){
        int x = 5;
        x ++; // x+= 1
        x --; // x-= 1
        System.out.println(x);

        int y = 5, z;
        z = y++; // No funcióna como sufijo, pero si aumenta el valor
        z = ++y; // Funciona aumentar como prefijo
        z = --y; // Funcióna disminuir
        System.out.println(y);
    }
}
