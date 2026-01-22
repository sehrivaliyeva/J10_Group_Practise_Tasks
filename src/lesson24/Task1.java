package lesson24;

import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        List<Integer> list = List.of(1, 2, 3, 4, 5);
        List<Integer> number=list.stream()
                .filter(num->num%2==0)
                .toList();
        System.out.println(number);
    }
}
