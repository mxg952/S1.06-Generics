package level2.ex2.model;

public class GenericMethods {
        public static <T> void printUndefinedArguments(T... arguments) {
            for (T argument : arguments) {
                System.out.println(argument);
            }
        }
}

