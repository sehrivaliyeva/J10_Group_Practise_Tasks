package lesson9and10;

public class Person {
    String name;
    static int age;


    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("obyekt yarandi");
    }

    public Person(String name) {
        this.name = name;
        System.out.println("obyekt yarandi");
    }

    public String getName() {
        return name;
    }

    static {
        System.out.println(" static yarandi");
    }

    {
        System.out.println("object bloku yarandi");
        System.out.println(name);
    }

}
