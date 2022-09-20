package Ejercicio_09;

public abstract class Poligono {
    protected int numeroLados;

    public Poligono(int numeroLados) {
        this.numeroLados = numeroLados;
    }

    public int getNumeroLados() {
        return numeroLados;
    }

    @Override
    public String toString() {
        return "Número de lados= " + numeroLados;
    }

    // Declaramos el metodo área como abstracto
    public abstract double area();
}
