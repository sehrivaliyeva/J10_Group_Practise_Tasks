package lesson6;

public class Task9 {
    public static void main(String[] args) {
        String soz = "abcxyz";
        String yeni = "";

        for (int i = 0; i < soz.length(); i++) {
            char c = soz.charAt(i);
            if (c == 'z') yeni += 'a';
            else yeni += (char)(c + 1);
        }
        System.out.println(yeni);
    }
}

