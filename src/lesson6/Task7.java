package lesson6;

public class Task7 {
    public static void main(String[] args) {
        String word = "ababaabab";
        String mySubstring = "aba";
        int count = 0;

        int end = mySubstring.length();//3 //4
        for (int i = 0; end <= word.length(); i++) {
            String sub = word.substring(i, end++);
            if (sub.equals(mySubstring)) {
                count++;
            }
        }
        System.out.println(count);

    }
}

