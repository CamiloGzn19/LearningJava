package Polimorfismo;

/* Puedo usar las variaciones de las clases hijas de la super clase, con la idea
de hacer un código más completo y polivalente
 */

public class Principal {
    public static void main(String[] args) {
        Vehiculo[] misVehiculos = new Vehiculo[4];

        misVehiculos[0] = new Vehiculo("GHY568", "Ferrari", "A89");
        misVehiculos[1] = new VehiculoTurismo("HEY489", "Audi", "P14", 4);
        misVehiculos[2] = new VehiculoDeportivo("QTG954", "Renault", "Logan", 1200);
        misVehiculos[3] = new VehiculoFurgoneta("BRT562", "Chevrolet", "Sandero", 200);

        for(Vehiculo vehiculos: misVehiculos){
            System.out.println(vehiculos.mostrarDatos());
            System.out.println();
        }
    }
}
