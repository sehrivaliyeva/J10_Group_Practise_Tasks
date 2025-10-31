package lesson7;

public class Task4 { public static void main(String[] args) {
    String input = "aaabbbccdddaa";
    StringBuilder result = new StringBuilder();

    int count = 1;
    for (int i = 1; i <= input.length(); i++) {
        if (i < input.length() && input.charAt(i) == input.charAt(i - 1)) {
            count++;
        } else {
            result.append(input.charAt(i - 1)).append(count);
            count = 1;
        }
    }

    System.out.println(result);
}
}
