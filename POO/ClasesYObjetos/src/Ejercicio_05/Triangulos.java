/*
Diseñar un programa para trabajar con triángulos isósceles. Para ello defina los
atributos necesarios que se requiere, proporcioen métodos de consulta, un método
constructor e implemente métodos para cálcular el perímetro y el área de un triángulo
además implementar un método que a partir de un arreglo de triangulos devuelva el
área del triángulo de mayor superficie.
 */

package Ejercicio_05;

public class Triangulos {
    private double base;
    private double lado;

    public Triangulos(double base, double lado) {
        this.base = base;
        this.lado = lado;
    }

    public double obtenerPerimetro() {
        double perimetro = ( 2 * lado ) + base;
        return perimetro;
    }

    public double obtenerArea() {
        double area = (base  * Math.sqrt((lado*lado) - (base*base)/4)) / 2;
        return area;
    }

    public String mostrarDatos() {
        return "Base: " + base + "\nLado" + lado + "\nPerimetro: "+obtenerPerimetro()+"\nArea: " + obtenerArea();
    }
}
