package lesson20;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            System.out.print("Bir tam ədəd daxil edin: ");
            list.add(sc.nextInt());
        }

        System.out.print("Yoxlamaq istədiyiniz ədədi daxil edin: ");
        int num = sc.nextInt();
        int count = 0;
        for (int i : list) {
            if (i == num) {
                count++;
            }
        }
        System.out.println(num + " ədədi " + count + " dəfə iştirak edib.");

    }
}
