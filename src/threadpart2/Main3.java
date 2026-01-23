package threadpart2;

public class Main3 {
    public static void main(String[] args) throws InterruptedException {
        SafeList safeList = new SafeList();

        Thread thread1 = new Thread(() -> {safeList.add(3);});
        Thread thread2 = new Thread(() -> {safeList.add(4);});
        Thread thread3 = new Thread(() -> {safeList.add(5);});
        Thread thread4 = new Thread(() -> {safeList.add(6);});
        Thread thread5 = new Thread(() -> {safeList.add(7);});
        Thread thread6 = new Thread(() -> {safeList.add(8);});
        Thread thread7 = new Thread(() -> {safeList.add(9);});
        Thread thread8 = new Thread(() -> {safeList.add(10);});
        Thread thread9 = new Thread(() -> {safeList.add(11);});
        Thread thread10 = new Thread(() -> {safeList.add(12);});

        thread1.setPriority(10);
        thread2.setPriority(9);
        thread3.setPriority(8);
        thread4.setPriority(7);
        thread5.setPriority(6);
        thread6.setPriority(5);
        thread7.setPriority(4);
        thread8.setPriority(3);
        thread9.setPriority(2);
        thread10.setPriority(1);



        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        thread5.start();
        thread6.start();
        thread7.start();
        thread8.start();
        thread9.start();
        thread10.start();

        thread1.join();
        thread2.join();
        thread3.join();
        thread4.join();
        thread5.join();
        thread6.join();
        thread7.join();
        thread8.join();
        thread9.join();
        thread10.join();



        System.out.println(safeList.list.size());
        System.out.println(safeList.list);
    }

}
