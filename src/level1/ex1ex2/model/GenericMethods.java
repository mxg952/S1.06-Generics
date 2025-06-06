package level1.ex1ex2.model;

public class GenericMethods {

    public static <T1, T2, T3> void printArguments (T1 a, T2 b, T3 c) {
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}

