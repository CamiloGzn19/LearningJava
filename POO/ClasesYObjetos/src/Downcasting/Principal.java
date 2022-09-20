package Downcasting;

/* Conversión descendente de tipos (Downcasting)
    Bajar en la jerarquía de clases, primero se necesita un upcasting
*/

public class Principal {
    public static void main(String[] args) {

        /* Ejemplo
        Vehiculo vehiculo = new VehiculoTurismo("GT67", "Ferrari", "A89", 4);
        VehiculoTurismo nuevoVehiculo = (VehiculoTurismo) vehiculo;
        System.out.println(nuevoVehiculo);
         */

        Vehiculo vehiculo = new VehiculoDeportivo("GH89", "Audi", "HI9", 500);
        VehiculoDeportivo nuevoVehiculo = (VehiculoDeportivo) vehiculo;

        System.out.println(nuevoVehiculo);
    }
}
