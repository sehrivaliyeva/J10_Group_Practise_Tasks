package lesson6;

public class Task4 {
    public static void main(String[] args) {
        String metn = "Java Proqramlaşdırma";
        String netice = "";
        for (int i = 0; i < metn.length(); i++) {
            if (metn.charAt(i) != ' ') netice += metn.charAt(i);
        }
        System.out.println(netice);
    }
}

