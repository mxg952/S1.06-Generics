package level2.ex1.model;

public class GenericMethods {

    public static <T2, T3> void printArguments(String a, T2 b, T3 c) {
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}

