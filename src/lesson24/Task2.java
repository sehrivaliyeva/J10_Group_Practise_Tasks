package lesson24;

import java.util.List;

public class Task2 {
    public static void main(String[] args) {
        List<String> list = List.of("Ali", "Murad", "Ahmet");
        List<String>names=list.stream()
                .map(str->str.toUpperCase())
                .toList();
        System.out.println(names);
    }
}
