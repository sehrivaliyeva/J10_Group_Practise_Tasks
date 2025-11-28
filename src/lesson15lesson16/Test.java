package lesson15lesson16;

import java.io.IOException;

public class Test {
    public static void main(String[] args) {
       /* try {
            System.out.println(5 / 0);
        } catch (ArithmeticException e) {
            System.err.println( e.getMessage());
        }*/

    }

    public static void method(int yash) {
        if (yash < 0) {
            try {
                throw new Exception("yash");
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }

    }
}
