package Sobrecarga;

public class SobrecargaMetodos {
    // Atributos
    String nombre;
    int edad;
    String dni;

    //Cuando hay muchos constructores, diferente # o parámetros

    // Métodos
    public SobrecargaMetodos(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public SobrecargaMetodos(String dni) {
        this.dni = dni;
    }

    public void correr() {
        System.out.println("Soy "+nombre+", tengo "+edad+" años y estoy corriendo una maratón");
    }

    public void correr(int km) {
        System.out.println("He corrido " + km + " kilometros");
    }
}
