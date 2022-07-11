package ClasesYObjetos.ClasesYObjetos;

import javax.swing.*;

public class main {
    public static void main(String[] args) {
        int n1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese número 1"));
        int n2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese número 2"));

        Operacion op = new Operacion();

        // Le paso los números como argumento
        System.out.println("La suma es: " + op.sumar(n1, n2));
        System.out.println("La resta es: " + op.restar(n1, n2));
        System.out.println("La multiplicación es: " + op.multiplicar(n1, n2));
        System.out.println("La dvisión es: " + op.dividir(n1, n2));
    }
}
