package level1.ex1ex2.main;

import level1.ex1ex2.model.Person;
import level1.ex1ex2.model.GenericMethods;
import level1.ex1ex2.model.NoGenericMethods;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String argument1 = " Hello ";
        String argument2 = " How are you? ";
        String argument3 = " Ciao ";

        NoGenericMethods nogen1 = new NoGenericMethods(argument1, argument2, argument3);
        NoGenericMethods nogen2 = new NoGenericMethods(argument2, argument1, argument3);
        NoGenericMethods nogen3 = new NoGenericMethods(argument3, argument2, argument1);

        System.out.println("Objects without generics whith arguments in diferent positions:");
        System.out.println(nogen1);
        System.out.println(nogen2);
        System.out.println(nogen3);


        Person marc = new Person("Marc", "Guillem", 30);
        Double height = 1.90;
        int weight = 75;

        System.out.println("\nObjects with generics:");
        GenericMethods.printArguments(marc, height, weight);

    }
}