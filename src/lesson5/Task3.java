package lesson5;

public class Task3 {
    public static void main(String[] args) {
        int[] arr = {2, 5, 8, 1, 9};
        int[] copy = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            copy[i] = arr[i];
        }

        System.out.print("Yeni massiv: ");
        for (int x : copy) {
            System.out.print(x + " ");
        }
    }
}

