package lesson7;

public class Task5 {
    public static void main(String[] args) {
        String input = "abc";
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            result.append((char) (input.charAt(i) + (i + 1)));
        }

        System.out.println(result);
    }
}
