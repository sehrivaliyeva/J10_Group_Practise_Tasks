package lesson5;

public class Task5 {
    public static void main(String[] args) {
        int[] arr = {5, 3, 8, 2, 1, 4};

        bubbleSort(arr);

        System.out.print("Sıralanmış massiv: ");
        for (int x : arr) {
            System.out.print(x + " ");
        }
    }

    public static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}

