package lesson24;

public class Main2 {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("salam");
            }
        });
        thread.start();
        thread.wait();
        thread.setPriority(Thread.MIN_PRIORITY);
        thread.notify();
    }

    public synchronized void method() {
        synchronized (this) {

        }
        System.out.println("salam");
    }
}
