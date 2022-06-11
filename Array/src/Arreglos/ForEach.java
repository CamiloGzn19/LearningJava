package Arreglos;
/*
Bucle ForEach

String[] numbers = {1,2,3,4}

// Importante declarar el tipo de dato a iterar

for(Int i:numbers){
   System.out.println(i);
}

 */
public class ForEach {
    public static void main(String[] args) {
        String[] nombres = {"Camilo", "Jose", "Luis", "Hellen", "Teresa", "Sofia", "Cristian"};

        for(String i:nombres){
            System.out.println("Los nombres son: " + i);
        }
    }
}
