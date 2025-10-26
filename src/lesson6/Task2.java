package lesson6;

public class Task2 {
    public static void main(String[] args) {
        String soz = "Hello";
        String ters = "";
        for (int i = soz.length() - 1; i >= 0; i--) {
            ters += soz.charAt(i);
        }
        System.out.println(ters);
    }
}

