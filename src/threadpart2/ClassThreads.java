package threadpart2;

public class ClassThreads extends  Thread {
    public void run() {
        for (int i = 0; i < 15; i++) {
            System.out.println("isleyir" + i);
        }
    }
}