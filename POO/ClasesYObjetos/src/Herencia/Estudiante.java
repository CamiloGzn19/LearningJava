package Herencia;

// Extends para decir que es hija de (Hereda)
// Super porque ya están inicializados en otro constructor

public class Estudiante extends Persona {
    private int codigoEstudiante;
    private float notaFinal;

    // Constructor con herencia
    public Estudiante(String nombre, String apellido, int edad, int codigoEstudiante, float notaFinal){
        super(nombre, apellido, edad);
        this.codigoEstudiante = codigoEstudiante;
        this.notaFinal = notaFinal;
    }

    public void mostrarDatos() {
        System.out.println("Nombre: "+getNombre()
                +"\nApellido: "+ getApellido()
                +"\nEdad: " + getEdad()
                +"\nCodigo Estudiante: " + codigoEstudiante
                +"\nNota final: " + notaFinal);
    }
}
