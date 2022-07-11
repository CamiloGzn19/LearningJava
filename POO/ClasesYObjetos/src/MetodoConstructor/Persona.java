package MetodoConstructor;

public class Persona {
    // Atributos
    String nombre;
    int edad;

    // Método Constructor
    public Persona(String _nombre, int _edad) {
        nombre = _nombre;
        edad = _edad;
    }

    /*
    Segundo método usando (this) referenciando los atributos
    public Persona(nombre, edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
    */

    public void mostrarDatos() {
        System.out.println("El nombre es: " + nombre);
        System.out.println("La edad es: " + edad);
    }
}
