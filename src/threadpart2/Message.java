package threadpart2;

public class Message {
    public synchronized void show(){
        System.out.println();
        System.out.println(Thread.currentThread().getName() + "-den show methodu isledi");

    }
}
