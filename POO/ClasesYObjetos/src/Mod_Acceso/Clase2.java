package Mod_Acceso;

public class Clase2 {
    public static void main(String[] args) {
        Clase1 objeto1 = new Clase1();

        objeto1.setEdad(22); // Acceso al atributo privado
        System.out.println("La edad es: "+ objeto1.getEdad());

        objeto1.setNombre("Camilo");
        System.out.println("El nombre es: "+ objeto1.getNombre());
    }
}
