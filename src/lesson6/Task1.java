package lesson6;

public class Task1 {
    public static void main(String[] args) {
        String soz = "Salam".toLowerCase();
        int sait = 0, samit = 0;

        for (int i = 0; i < soz.length(); i++) {
            char c = soz.charAt(i);
            if (c >= 'a' && c <= 'z') {
                if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                    sait++;
                }
                else samit++;
            }
        }
        System.out.println("Sait: " + sait + ", Samit: " + samit);
    }
}

