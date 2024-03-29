package Proyecto;

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
        String nombreAeropuerto, nombreCompañia, origen, destino;
        int opcion;
        Aeropuerto aeropuerto;
        Compañia compañia;

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
                    entrada.nextLine();
                    System.out.println("\nDigite el nombre del aeropuerto");
                    nombreAeropuerto = entrada.nextLine();
                    aeropuerto = buscarAeropuerto(nombreAeropuerto, aeropuertos);
                    if(aeropuerto == null) {
                        System.out.println("El aeropuerto no existe");
                    } else {
                        System.out.println("Digite el nombre de la compañia");
                        nombreCompañia = entrada.nextLine();
                        compañia = aeropuerto.getCompañia(nombreCompañia);
                        mostrarVuelos(compañia);
                    }

                    break;
                case 5: // Listar posibles vuelos de origen a destino
                    entrada.nextLine();
                    System.out.println("\nDigite una ciudad origen: ");
                    origen = entrada.nextLine();
                    System.out.println("Digite la ciudad destino: ");
                    destino = entrada.nextLine();
                    mostrarVueloOrigenDestino(origen, destino, aeropuertos);
                    break;
                case 6: // Salir
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

    public static void mostrarVuelos(Compañia compañia) {
        Vuelo vuelo;
        System.out.println("Los vuelos de la compañia: " +compañia.getNombre());
    for(int i=0;i< compañia.getNumVuelo();i++){
        vuelo = compañia.getVuelo(i);
        System.out.println("Identificador: "+vuelo.getIdentificador());
        System.out.println("Ciudad origen: "+vuelo.getCiudadOrigen());
        System.out.println("Ciudad destino: "+vuelo.getCiudadDestino());
        System.out.println("Precio: "+vuelo.getPrecio());
        System.out.println();
    }
    }

    public static Vuelo[] buscarVuelosOrigenDestino(String origen, String destino, Aeropuerto[] aeropuertos) {
        Vuelo vuelo;
        int contador = 0;
        Vuelo[] listaVuelos;

        for (int i = 0; i < aeropuertos.length; i++) { // Recorrer aeropuertos
            for (int j = 0; i < aeropuertos[i].getNumCompañia(); j++) { // Recorrer compañias
                for (int k = 0; k < aeropuertos[i].getCompañia(j).getNumVuelo(); k++) { //Recorrer vuelos
                    vuelo = aeropuertos[i].getCompañia(j).getVuelo(k);
                    if ((origen.equals(vuelo.getCiudadOrigen())) && (destino.equals(vuelo.getCiudadDestino()))) {
                        contador++;
                    }
                }
            }
        }

        listaVuelos = new Vuelo[contador];
        int q = 0;

        for(int i=0;i<aeropuertos.length;i++){
            for(int j=0;j<aeropuertos[i].getNumCompañia();j++){
                for(int k=0;k<aeropuertos[i].getCompañia(j).getNumVuelo();k++){
                    vuelo = aeropuertos[i].getCompañia(j).getVuelo(k);
                    if((origen.equals(vuelo.getCiudadOrigen())) && (destino.equals(vuelo.getCiudadDestino()))){
                        listaVuelos[q] = vuelo;
                        q++;
                    }
                }
            }
        }

        return listaVuelos;
    }

    public static void mostrarVueloOrigenDestino(String origen, String destino, Aeropuerto[] aeropuertos) {
        Vuelo[] vuelos;
        vuelos = buscarVuelosOrigenDestino(origen, destino, aeropuertos);
        if(vuelos.length == 0) {
            System.out.println("No existen vuelos de esa ciudad origen a destino");
        } else {
            System.out.println("\nVuelos encontrados: ");
            for(int i = 0;i<vuelos.length;i++){
                System.out.println("Identificador: "+vuelos[i].getIdentificador());
                System.out.println("Ciudad origen: "+vuelos[i].getCiudadOrigen());
                System.out.println("Ciudad destino: "+vuelos[i].getCiudadDestino());
                System.out.println("Precio: $"+vuelos[i].getPrecio());
                System.out.println();
            }
        }
    }
}
