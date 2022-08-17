package Sobrecarga;

public class Main {
    public static void main(String[] args) {
        SobrecargaMetodos persona1 = new SobrecargaMetodos("Camilo", 22);
        persona1.correr();

        SobrecargaMetodos persona2 = new SobrecargaMetodos("32136515");
        persona2.correr(100);
    }
}