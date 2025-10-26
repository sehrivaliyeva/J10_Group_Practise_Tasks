package lesson5;

public class Task7 {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {3, 4, 5, 6, 7};

        int[] result = new int[arr1.length];
        int count = 0;

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j]) {
                    result[count++] = arr1[i];
                    break;
                }
            }
        }

        System.out.print("Ortaq elementlər: ");
        for (int i = 0; i < count; i++) {
            System.out.print(result[i] + " ");
        }
    }
}

