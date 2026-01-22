package lesson15lesson16;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        while (true) {
            int yas = scanner.nextInt();
            if (yas > 0 && yas < 150) {
                System.out.println("Yash: " + yas);
                break;


            } else {
                try {

                    throw new YashException("Yashi dogru daxil edin: ");

                } catch (YashException e) {
                    System.out.println(e.getMessage());
                    scanner.nextLine();
                }


            }
        }

    }

}
