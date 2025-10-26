package lesson6;

public class Task8 {
    public static void main(String[] args) {
        String soz = "example.txt";
        String prefix = "ex";
        String suffix = "txt";

        boolean baslayir = soz.startsWith(prefix);
        boolean bitir = soz.endsWith(suffix);

        System.out.println("Prefix uyğundur: " + baslayir + ", Suffix uyğundur: " + bitir);
    }
}

