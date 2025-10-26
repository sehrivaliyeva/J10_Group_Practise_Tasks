package lesson6;

public class Task6 {
    public static void main(String[] args) {
        String soz = "programming";
        String yeni = "";

        for (int i = 0; i < soz.length(); i++) {
            char c = soz.charAt(i);
            if (!yeni.contains(String.valueOf(c))) yeni += c;
        }
        System.out.println(yeni);
    }
}

