package level2.ex2.model;

public class Persona {
    private String name;
    private String surname;
    private int age;

    public Persona(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name + " " + surname + ", " + age;
    }
}

