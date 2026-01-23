package threadpart2;

public class Main4 {
    public static void main(String[] args) {
        ThreadMessage message = new ThreadMessage();

        Thread thread1 = new Thread(message);
        Thread thread2 = new Thread(message);

        thread1.start();
        thread2.start();

    }
}
