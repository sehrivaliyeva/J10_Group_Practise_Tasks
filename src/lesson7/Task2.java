package lesson7;

public class Task2 {
    public static void main(String[] args) {
        String s1 = "salam";
        String s2 = "dunya";
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < s1.length() || i < s2.length(); i++) {
            if (i < s1.length()) result.append(s1.charAt(i));
            if (i < s2.length()) result.append(s2.charAt(s2.length() - 1 - i));
        }

        System.out.println(result);
        }


    }
