package lesson6;

public class Task5 {
    public static void main(String[] args) {
        String cumle = "Bu bir test cümləsidir";
        String[] sozler = cumle.split(" ");
        String uzun = sozler[0];

        for (int i = 1; i < sozler.length; i++) {
            if (sozler[i].length() > uzun.length()) {
                uzun = sozler[i];
            }
        }
        System.out.println("Ən uzun söz: " + uzun);
    }
}

