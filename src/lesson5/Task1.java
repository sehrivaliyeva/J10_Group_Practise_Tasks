package lesson5;

public class Task1 {
    public static void main(String[] args) {
        int[] arr = {4, 9, -3, 7, 2, 11, 5};

        int min = arr[0];
        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        System.out.println("Ən kiçik: " + min);
        System.out.println("Ən böyük: " + max);
    }
}
