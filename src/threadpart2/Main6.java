package threadpart2;

public class Main6 {
    public static void main(String[] args) throws InterruptedException {

        ClassThreads classThreads = new ClassThreads();
        ClassThreads classThreads2 = new ClassThreads();
        classThreads.start();
        classThreads2.start();
        classThreads.join();
        System.out.println("Isi bitdi");
    }
}
