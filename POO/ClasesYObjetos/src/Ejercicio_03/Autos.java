/*
Construir un programa dada una serie de autos caracterizados por su marca, modelo
y precio, imprima las propiedades del auto mas barato. Para ello, se deberán leer
por teclado las características de cada auto y crear una clase que represente
a cada uno de ellos.
 */
package Ejercicio_03;

public class Autos {
    // Atributos
    private String marca;
    private String modelo;
    private float precio;

    // Método constructor
    public Autos(String marca, String modelo, float precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
    }

    public float getPrecio() {
        return precio;
    }

    public String mostrarDatos() {
        return "Marca: "+marca+"\nModelo: "+ modelo + "\nPrecio: $" + precio + "\n";
    }

}
