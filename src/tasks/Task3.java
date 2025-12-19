package tasks;

//3. Verilmiş massivin içərisindəki bütün təkrarsız elementləri HashSet
// istifadə edərək tapan və qaytaran bir metod yazın.
//
//Input: Integer[] numbers
//Output: HashSet<Integer>

import java.util.HashSet;

public class Task3 {
    public static void main(String[] args) {
        Integer[] numbers = {1, 2, 2, 2, 4, 4, 2, 2, 3, 3, 3, 2, 6, 7,8, 2, 2, 2, 8, 9, 5, 5, 5, 10};

        HashSet<Integer> set = new HashSet<>();

        HashSet<Integer> duplicates = new HashSet<>();

        int oldSize = set.size();

        for (Integer number : numbers) {
            set.add(number);
            if (set.size() == oldSize) {
                duplicates.add(number);
            }
            oldSize = set.size();
        }
        set.removeAll(duplicates);
        System.out.println(set);
    }
}
