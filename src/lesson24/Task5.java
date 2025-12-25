package lesson24;

import java.util.List;

public class Task5 {
    public static void main(String[] args) {


        List<Integer> numbers = List.of(-4, 6, 7, 96, -11, 92, 85);
        boolean netice = numbers.stream()
                .anyMatch(num -> num < 0);
        System.out.println(netice);

        List<Integer> numbers2 = List.of(-4, 6, 7, 96, -11, 92, 85);
        boolean netice2 = numbers2.stream()
                .allMatch(num -> num < 100);
        System.out.println(netice2);

        List<Integer> numbers3 = List.of(-4, 6, 7, 96, -11, 92, 85);
        boolean netice3 = numbers3.stream()
                .noneMatch(num -> num % 10 == 0);
        System.out.println(netice3);
    }


}
