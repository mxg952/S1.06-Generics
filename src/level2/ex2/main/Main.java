package level2.ex2.main;

import level2.ex2.model.GenericMethods;
import level2.ex2.model.Persona;


public class Main {
    public static void main(String[] args) {
        Persona marc = new Persona("Marc", "Guillem", 30);
        Double height = 1.90;
        int weight = 75;

        System.out.println("\nObjects with generics:");
        GenericMethods.printUndefinedArguments(marc, height, weight, "I like potatoes", 666);

    }
}