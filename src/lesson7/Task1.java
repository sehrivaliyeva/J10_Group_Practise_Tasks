package lesson7;

public class Task1 {
    public static void main(String[] args) {
        char c = 'A';
        int level = 4;

        for (int i = 0; i < level; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print((char)(c+i));
            }
            System.out.println();
        }
    }
}
