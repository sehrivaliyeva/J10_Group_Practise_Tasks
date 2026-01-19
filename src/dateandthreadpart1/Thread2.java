package dateandthreadpart1;

public class Thread2 {
    public static void main(String[] args) {

        Runnable runnable =  () -> {
            for (int i = 1; i <= 10; i += 2) {
                System.out.println(i);
            }
        };
       Thread thread1 = new Thread(runnable);
       thread1.start();


    }
}