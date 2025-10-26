package lesson4;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ədəd daxil et: ");
        int n = sc.nextInt();

        boolean sadedir = true;
        if (n <= 1) {
            sadedir = false;
        } else {
            for (int i = 2; i <= n / 2; i++) {
                if (n % i == 0) {
                    sadedir = false;
                    break;
                }
            }
        }

        System.out.println(sadedir);
    }
}
