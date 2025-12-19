package lesson21and22;

import java.util.ArrayList;

public class Task1 {
    public static ArrayList<Integer> reverse(ArrayList<Integer> numbers) {
        int left = 0;
        int right = numbers.size() - 1;

        while (left < right) {
            int temp = numbers.get(left);
            numbers.set(left, numbers.get(right));
            numbers.set(right, temp);
            left++;
            right--;
        }
        return numbers;
    }
}
