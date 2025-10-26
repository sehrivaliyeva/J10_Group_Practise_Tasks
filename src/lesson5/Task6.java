package lesson5;

public class Task6 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 4, 5, 5, 6, 2, 1, 7};//11

        int[] temp = new int[arr.length]; //5
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            boolean duplicate = false;
            for (int j = 0; j < count; j++) {
                if (arr[i] == temp[j]) {
                    duplicate = true;
                    break;
                }
            }
            if (!duplicate) {
                temp[count++] = arr[i];
            }
        }

        System.out.print("Yeni massiv: ");
        for (int i = 0; i < count; i++) {
            System.out.print(temp[i] + " ");
        }
    }
}

