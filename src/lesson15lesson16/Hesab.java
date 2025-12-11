package lesson15lesson16;

import java.util.Scanner;

public class Hesab {
    private double balance = 1000;

    public void pulChixarma(double mebleg) throws NegativeBalanceException {
        if (mebleg > balance || mebleg < 0) {

            throw new NegativeBalanceException("uygunsuz mebleg " + balance);

        }

        balance -= mebleg;
        System.out.println("ugurla cixarildi.Qalan balans: " + balance);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Hesab hesab = new Hesab();
        System.out.print("zehmet olmasa meblegi daxil edin: ");
        int mebleg = sc.nextInt();
        try {
            hesab.pulChixarma(mebleg);
        } catch (NegativeBalanceException e) {
            throw new RuntimeException(e);
        }


    }

}
