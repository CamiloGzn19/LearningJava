package ClasesYObjetos.ClasesYObjetos;

public class Coche {
    /* Creando atributos */
    String color;
    String marca;
    int km;

    /* Crear método */
    public static void main(String[] args) {
        Coche coche1 = new Coche(); // Crear objeto que pertenece a la clase

        /* llenando los atributos */
        coche1.color = "Blanco";
        coche1.marca = "Audi";
        coche1.km = 0;

        System.out.println("El color del coche 1 es: " + coche1.color);
        System.out.println("La marca del coche 1 es: " + coche1.marca);
        System.out.println("El kilometraje del coche 1 es: " + coche1.km);

        Coche coche2 = new Coche();

        coche2.color = "Roio";
        coche2.marca = "Ferrari";
        coche2.km = 100;

        System.out.println();

        System.out.println("El color del coche 2 es: " + coche2.color);
        System.out.println("La marca del coche 2 es: " + coche2.marca);
        System.out.println("El kilometraje del coche 2 es: " + coche2.km);
    }
}
