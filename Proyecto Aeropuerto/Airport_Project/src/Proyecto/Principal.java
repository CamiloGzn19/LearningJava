package Proyecto;

import java.util.Arrays;
import java.util.Scanner;

public class Principal {

    static Scanner entrada = new Scanner(System.in);
    final static int num = 4; //Número de aeropuertos
    static Aeropuerto[] aeropuertos = new Aeropuerto[num];

    public static void main(String[] args) {
        //Insertar datos de los aeropuertos
        insertarDatosAeropuerto(aeropuertos);
        menu();
    }

    public static void insertarDatosAeropuerto(Aeropuerto[] aero) {
        aero[0] = new AeropuertoPublico("Jorge Chávez", "Lima","Peru", 80000000);
        aero[0].insertarCompañia(new Compañia("AeroPeru"));
        aero[0].insertarCompañia(new Compañia("LATAM"));
        aero[0].getCompañia("AeroPeru").insertarVuelo(new Vuelo("IB20","Lima", "Mexico", 150.90, 150));
        aero[0].getCompañia("AeroPeru").insertarVuelo(new Vuelo("IB21","Lima", "Buenos Aires", 180.99, 120));
        aero[0].getCompañia("LATAM").insertarVuelo(new Vuelo("FC12","Lima", "Londres", 500.90, 180));
        aero[0].getCompañia("AeroPeru").getVuelo("IB20").insertarPasajero(new Pasajero("Camilo", "20BGHP", "Colombiano"));
        aero[0].getCompañia("AeroPeru").getVuelo("IB20").insertarPasajero(new Pasajero("Cristian", "PJKL20", "Mexicano"));
        aero[0].getCompañia("LATAM").getVuelo("FC12").insertarPasajero(new Pasajero("Maria", "JH21KL", "Peruana"));

        aero[1] = new AeropuertoPrivado("Barajas", "Madrid","España");
        aero[1].insertarCompañia(new Compañia("AirEuropa"));
        ((AeropuertoPrivado)aero[1]).insertarEmpresa("Cobresol");
        ((AeropuertoPrivado)aero[1]).insertarEmpresa("Anguila34");
        aero[1].getCompañia("AirEuropa").insertarVuelo(new Vuelo("AE025", "Madrid", "Buenos Aires", 580.20, 200));
        aero[1].getCompañia("AirEuropa").getVuelo("AE025").insertarPasajero(new Pasajero("Juan", "AWD4152", "Español"));

        aero[2] = new AeropuertoPublico("El Dorado", "Bogotá", "Colombia", 90000000);
        aero[2].insertarCompañia(new Compañia("AirAmerica"));
        aero[2].insertarCompañia(new Compañia("Avianca"));
        aero[2].getCompañia("AirAmerica").insertarVuelo(new Vuelo("AE030", "Bogotá", "Lima", 210.30, 115));
        aero[2].getCompañia("AirAmerica").insertarVuelo(new Vuelo("AE031", "Bogotá", "Barcelona", 630.12, 210));
        aero[2].getCompañia("AirAmerica").getVuelo("AE030").insertarPasajero(new Pasajero("Daniela", "SDF185", "Colomniaba"));
        aero[2].getCompañia("AirAmerica").getVuelo("AE031").insertarPasajero(new Pasajero("Carolina", "GWD843", "Boliviana"));

        aero[3] = new AeropuertoPublico("Aeropuerto Mexico", "Mexico DF", "Mexico", 70000000);
        aero[3].insertarCompañia(new Compañia("AeroMexico"));
        aero[3].getCompañia("AeroMexico").insertarVuelo(new Vuelo("ICG2040", "Mexico", "Nueva York", 315.55, 180));
        aero[3].getCompañia("AeroMexico").insertarVuelo(new Vuelo("ICG2042", "Mexico", "Lima", 416.23, 150));
    }

    public static void menu() {
        String nombreAeropuerto;
        int opcion;
        Aeropuerto aeropuerto;

        do {
            System.out.println("\t.:MENU:.");
            System.out.println("1. Ver Aeropuertos gestionados (Publicos o privados)");
            System.out.println("2. Ver empresas (Privado) o subvencion (Publico)");
            System.out.println("3. Lista de compañias de un aeropuerto");
            System.out.println("4. Lista de vuelos por compañia");
            System.out.println("5. Listar posibles vuelos de origen a destino");
            System.out.println("6. Salir");
            System.out.print("Opcion: ");
            opcion = entrada.nextInt();

            switch (opcion) {
                case 1: // Ver Aeropuertos gestionados (Publicos o privados)
                    System.out.println();
                    mostrarDatosAeropuertos(aeropuertos);
                    break;
                case 2: // Ver empresas (Privado) o subvencion (Publico)
                    System.out.println();
                    mostrarPatrocinio(aeropuertos);
                    break;
                case 3: // Lista de compañias de un aeropuerto
                    entrada.nextLine();
                    System.out.print("\nDigite el nombre del aeropuerto: ");
                    nombreAeropuerto = entrada.nextLine();
                    aeropuerto = buscarAeropuerto(nombreAeropuerto, aeropuertos);
                    if (aeropuerto == null) {
                        System.out.println("El aeropuerto no existe");
                    } else {
                        mostrarCompañias(aeropuerto);
                    }
                    break;
                case 4: // Lista de vuelos por compañia
                    System.out.println();

                    break;
                case 5: // Listar posibles vuelos de origen a destino
                    System.out.println();

                    break;
                case 6: // Salir
                    System.out.println();

                    break;
                default:
                    System.out.println("Opción incorrecta");
            }
            System.out.println();
        } while (opcion != 6);
    }

    public static void mostrarDatosAeropuertos(Aeropuerto[] aeropuertos){
        for (int i=0;i< aeropuertos.length; i++){
            if(aeropuertos[i] instanceof AeropuertoPrivado){
                System.out.println("Aeropuerto Privado: ");
                System.out.println("Nombre: " + aeropuertos[i].getNombre());
                System.out.println("Ciudad: " + aeropuertos[i].getCiudad());
                System.out.println("Pais: " + aeropuertos[i].getPais());
            } else {
                System.out.println("Aeropuerto Publico: ");
                System.out.println("Nombre: " + aeropuertos[i].getNombre());
                System.out.println("Ciudad: " + aeropuertos[i].getCiudad());
                System.out.println("Pais: " + aeropuertos[i].getPais());
            }
            System.out.println();
        }
    }

    public static void mostrarPatrocinio(Aeropuerto[] aeropuertos){

        String[] empresas;

        for (int i=0;i< aeropuertos.length; i++){
            if(aeropuertos[i] instanceof AeropuertoPrivado){
                System.out.println("Aeropuerto Privado: "+aeropuertos[i].getNombre());
                empresas = ((AeropuertoPrivado)aeropuertos[i]).getListaEmpresas();
                System.out.println("Empresas: ");
                for(int j=0;j<empresas.length;j++){
                    System.out.println(empresas[j]);
                }
            } else {
                System.out.println("Aeropuerto Publico: "+aeropuertos[i].getNombre());
                System.out.println("Subvención: " + ((AeropuertoPublico) aeropuertos[i]).getSubvencion());
            }
            System.out.println();
        }
    }

    public static Aeropuerto buscarAeropuerto(String nombre, Aeropuerto[] aeropuertos) {
        boolean encontrado = false;
        int i = 0;
        Aeropuerto aero = null;
        while ((!encontrado) && (i< aeropuertos.length)){
            if(nombre.equals(aeropuertos[i].getNombre())){
                encontrado = true;
                aero = aeropuertos[i];
            }
            i++;
        }
        return aero;
    }

    public static void mostrarCompañias(Aeropuerto aeropuerto){
        System.out.println("\nLas compañias del aeropuerto: "+aeropuerto.getNombre());
        for(int i=0;i< aeropuerto.getNumCompañia();i++){
            System.out.println(aeropuerto.getCompañia(i).getNombre());
        }
    }
}
