package Persona;

public class Principal {
    public static void main(String[] args) {
        Persona persona1 = new Persona("Camilo", 22);

        persona1.setEdad(23); // Cambia con el setter
        persona1.mostrarDatos();
    }
}
