package lesson24;

import java.util.List;

public class Task3 {
    public static void main(String[] args) {

        List<Person> persons = List.of(
                new Person("Elsen", 23),
                new Person("Mehri", 20),
                new Person("Shahrigul", 28));
        List<String> names = persons.stream()
                .filter(person -> person.getAge() > 22)
                .map(person -> person.getName())
                .toList();

        System.out.println(names);

    }


}
