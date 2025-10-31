package lesson7;

public class Task3 {
    public static void main(String[] args) {
        String input = "Hello!";
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            if ((i + 1) % 3 != 0) {
                result.append((char) (input.charAt(i) + 2));
            }
        }

        System.out.println(result);
    }
}
