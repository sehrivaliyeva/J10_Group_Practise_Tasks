package lesson9and10;

public class Main {
    public static void main(String[] args) {

        Person person1 = new Person("Harry Potter", 17);
        Person person2 = new Person("Harry Potter", 55);
        Person person3 = new Person("Harry Potter");
        System.out.println(person1.age);
        System.out.println(person2.age);
    }
}