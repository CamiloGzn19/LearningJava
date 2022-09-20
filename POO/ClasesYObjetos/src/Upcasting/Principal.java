package Upcasting;

/* Conversión ascendente de tipos (Upcasting)
    Guardar un objeto de la subclase en uno de la superclase
* */

public class Principal {
    public static void main(String[] args) {
       VehiculoTurismo miVehiculo = new VehiculoTurismo("GT67", "Ferrari", "A89", 4);
       Vehiculo vehiculo = miVehiculo;

       /* Forma corta
        Vehiculo vehiculo = new VehiculoTurismo("GT67", "Ferrari", "A89", 4);
        */

        System.out.println(vehiculo);
    }
}
