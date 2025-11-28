package lesson15lesson16;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a = readfile();
        System.out.println(a);

    }

    static int readfile() {
        while (true) {
            Scanner sc = new Scanner(System.in);
            try {
                int a = sc.nextByte();
                return a;

            } catch (InputMismatchException e) {
                System.out.println("Yanlış daxil etdiniz! Yenidən cəhd edin.");
                //sc.nextLine();
            }


        }
    }


}
