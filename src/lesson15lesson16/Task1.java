package lesson15lesson16;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        int[] arr = {34, 56, 26, 3, 7};

        Scanner scanner = new Scanner(System.in);


        while (true) {
            System.out.print("Array indeksi maksimum 4-dur: ");
            int eded = scanner.nextInt();
            if (eded < arr.length) {
                System.out.println(arr[eded]);
                break;
            } else {
                try {
                    throw new ArrayIndexOutOfBoundsException();
                } catch (ArrayIndexOutOfBoundsException e) {
                    System.out.println("Indeks xetasi: " + e.getMessage());
                    scanner.nextLine();
                }
            }
        }
    }
}
