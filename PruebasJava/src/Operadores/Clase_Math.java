package Operadores;

public class Clase_Math {
    public static void main(String[] args){
        // Sacar la raíz cuadrada con un double
        double raiz = Math.sqrt(9);
        System.out.println(raiz);
        // Sacar la raíz cuadrada con un int
        int raiz2 = (int)Math.sqrt(16);
        System.out.println(raiz2);
        // Elevar un número a una potencia
        double base = 4, exponente = 3;
        double resultado = Math.pow(base, exponente);
        System.out.println(resultado);
        // Redondear un número
        float numero = 7.15f;
        int resultado2 = Math.round(numero);
        System.out.println(resultado2);
        // Método random
        double rand = Math.random();
        System.out.println(rand);
    }
}
