package level2.ex1.main;

import level2.ex1.model.GenericMethods;
import level2.ex1.model.Persona;

public class Main {
    public static void main(String[] args) {
        Persona marc = new Persona("Marc", "Guillem", 30);
        Double height = 1.90;
        int weight = 75;

        System.out.println("\nObjects with generics:");
        GenericMethods.printArguments(marc.getName(), height, weight);

    }
}