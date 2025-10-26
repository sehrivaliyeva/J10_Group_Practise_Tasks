package lesson4;

import java.util.Scanner;

public class EbobEkobExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Birinci ədəd: ");
        int a = sc.nextInt();

        System.out.print("İkinci ədəd: ");
        int b = sc.nextInt();

        int ebob = 1; //mumkun deyer

        // kiçik ədədə qədər dövr edirik
        for (int i = 1; i <= a && i <= b; i++) {
            if (a % i == 0 && b % i == 0) {
                ebob = i; // ən böyük ortaq bölən tapılır
            }
        }

        int ekob = (a * b) / ebob;

        System.out.println("ƏBOB = " + ebob);
        System.out.println("ƏKOB = " + ekob);
    }
}

