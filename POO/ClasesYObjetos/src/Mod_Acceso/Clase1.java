// Modificadores de acceso y encapsulamiento
// Setters and Getters (Métodos accesores)
package Mod_Acceso;
public class Clase1 {
    private int edad;
    private String nombre;

    // Método setter, establecer la edad
    public void setEdad (int edad) {
        this.edad = edad;
    }

    // Método getter, mostrar la edad
    public int getEdad() {
        return edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }
}
