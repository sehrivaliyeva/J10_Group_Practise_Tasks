package lesson21and22;

import java.util.HashSet;

public class Task3 {
    public static HashSet<Integer> findUniqueElements(Integer[] numbers) {
        HashSet<Integer> seen = new HashSet<>();
        HashSet<Integer> duplicates = new HashSet<>();

        for (Integer number : numbers) {
            if (!seen.add(number)) {
                duplicates.add(number);
            }
        }

        seen.removeAll(duplicates);
        return seen;
    }

}
