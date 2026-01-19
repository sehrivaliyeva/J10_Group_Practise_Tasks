package dateandthreadpart1;

public class Main {
    public static void main(String[] args) {

        Thread1 thread1 = new Thread1();
        thread1.start();
        Thread3 thread3 = new Thread3();
        Thread thread10 = new Thread(thread3);
        thread10.start();

    }

}
