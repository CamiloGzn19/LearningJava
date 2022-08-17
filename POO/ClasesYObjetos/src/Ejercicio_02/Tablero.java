/*
Construir un programa que permita dirigir el movimiento de un objeto dentro de un
tablero y actualice su posición dentro del mismo. Los movimientos posibles son,
Arriba, Abajo, Izquierda, Derecha. Tras cada movimiento el programa mostrará la
nueva dirección elegida y las coordenadas de situación del objeto dentro del
tablero
 */

package Ejercicio_02;

public class Tablero {
    // Atributos
    private int x;
    private int y;

    // Métodos
    // Método constructor
    public Tablero(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void moverArrriba(int incremento) {
        y += incremento;
    }

    public void moverAbajo(int incremento) {
        y -= incremento;
    }

    public void moverDerecha(int incremento) {
        x += incremento;
    }

    public void moverIzquierda(int incremento) {
        x -= incremento;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
