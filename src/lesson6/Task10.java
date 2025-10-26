package lesson6;

public class Task10 {
    public static void main(String[] args) {
        String metn = "HELLO";
        String acar = "KEY";
        String sifreli = "";

        for (int i = 0; i < metn.length(); i++) {
            char m = metn.charAt(i);
            char k = acar.charAt(i % acar.length());
            char yeni = (char) ((m + k - 2 * 'A') % 26 + 'A');
            sifreli += yeni;
        }
        System.out.println("Şifrələnmiş: " + sifreli);
    }
}

