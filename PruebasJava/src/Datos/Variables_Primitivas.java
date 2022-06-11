package PruebasJava.src.Datos;

public class Variables_Primitivas {
    public static void main(String[] args){
        // Variables numericos enteros
        byte Num1 = 127;
        short Num2 = 32767;
        int Num3 = 2147483647;
        long Num4 = 922337289;
        System.out.println("Soy un byte: " + Num1);
        System.out.println("Soy un short: " + Num2);
        System.out.println("Soy un int: " + Num3);
        System.out.println("Soy un long: " + Num4);

        // Variables numéricas decimales
        float decimal = 3.45f;
        double decimal2 = 6.45;
        System.out.println("Soy un decimal: " + decimal);
        System.out.println("Soy un decimal que ocupa más memoria: " + decimal2);

        // Todo lo que hay en el teclado
        char caracter = 'a';
        System.out.println("Soy un caracter: " + caracter);
        // Variable tipo boolean
        boolean decision = true;
        System.out.println("Soy una decisión: " + decision);
    }
}
