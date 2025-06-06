package level1.ex1ex2.model;

public class NoGenericMethods {
    private String argument1;
    private String argument2;
    private String argument3;


    public NoGenericMethods(String argument1, String argument2, String argument3) {
        this.argument1 = argument1;
        this.argument2 = argument2;
        this.argument3 = argument3;
    }

    @Override
    public String toString() {
        return "NoGenericMethods{" +
                "argument1='" + argument1 + '\'' +
                ", argument2='" + argument2 + '\'' +
                ", argument3='" + argument3 + '\'' +
                '}';
    }
}

