package lesson6;

public class Task3 {
    public static void main(String[] args) {
        String soz = "veten".toLowerCase();
        String ters = "";
        for (int i = soz.length()-1; i >= 0; i--) ters += soz.charAt(i);
        if (soz.equals(ters)) System.out.println(true);
        else System.out.println(false);
        System.out.println(soz);
        System.out.println(ters);
    }
}

