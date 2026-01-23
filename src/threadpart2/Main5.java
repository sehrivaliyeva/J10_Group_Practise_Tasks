package threadpart2;

public class Main5 {
    public static void main(String[] args) {

        Counter counter = new Counter();
        MyClasses class1 = new MyClasses(counter);
        MyClasses class2 = new MyClasses(counter);
        class1.start();
        class2.start();
    }
}
