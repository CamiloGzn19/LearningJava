package ClasesYMetodos_Abstractos;

/* Un metodo abstracto se aplica a las demás clases pero no se especifica */

public class Principal {
    public static void main(String[] args) {
        Planta planta = new Planta();
        AnimalCarnivoro animalC = new AnimalCarnivoro();
        AnimalHerbivoro animalH = new AnimalHerbivoro();

        planta.alimentarse();
        animalC.alimentarse();
        animalH.alimentarse();
    }
}
