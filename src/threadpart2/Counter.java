package threadpart2;

public class Counter {
    int count = 0;

    public void increment(){
        synchronized (this) {
            count++;
            System.out.println("Counter.increment() called" + count);
        }
    }
}


