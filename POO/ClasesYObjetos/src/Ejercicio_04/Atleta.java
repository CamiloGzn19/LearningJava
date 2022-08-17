/*
construir un programa para una competencia de atletismo en competencia
de atletismo el programa debe gestionar una serie de atletas en atletas
caracterizados por su número de atleta el nombre y el tiempo de carrera.
Al final el programa debe mostrar los datos del atleta ganador de la carrera.
 */
package Ejercicio_04;

public class Atleta{
    // Atributos
    private int numeroAtleta;
    private String nombre;
    private float tiempoCarrera;

    // Método constructor
    public Atleta(int numeroAtleta, String nombre, float tiempoCarrera) {
        this.numeroAtleta = numeroAtleta;
        this.nombre = nombre;
        this.tiempoCarrera = tiempoCarrera;
    }

    public float getTiempoCarrera() {
        return tiempoCarrera;
    }

    public String mostrarDatosGanador() {
        return "Numero de atleta: " + numeroAtleta + "\nNombre de atleta: " + nombre + "\nTiempo de carrera: " + tiempoCarrera + ".\n";
    }
}
