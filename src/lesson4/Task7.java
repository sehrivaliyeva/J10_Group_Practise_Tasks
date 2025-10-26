package lesson4;

import java.util.Random;
import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        int number = rand.nextInt(100) + 1; // 1-100 arası random ədəd
        int guess = 0;

        System.out.println("1 ilə 100 arasında ədədi tapmağa çalış!");

        while (guess != number) {
            System.out.print("Təxmin et: ");
            guess = sc.nextInt();

            if (guess < number) {
                System.out.println("Daha böyük ədəd daxil et!");
            } else if (guess > number) {
                System.out.println("Daha kiçik ədəd daxil et!");
            } else {
                System.out.println("Təbriklər! Düz tapdın ");
            }
        }
    }
}
