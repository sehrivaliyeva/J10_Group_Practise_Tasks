package lesson20;

public class MyClass {
    public static void main(String[] args) {
        Dog<String> dog = new Dog<>();
        dog.name = "dog";

        Dog<? super Integer> dog1 = new Dog<>();
        Dog<? extends Integer> dog2 = new Dog<>();
        Dog<?> dog3 = new Dog<>();

    }

    public static void test(Animal animal) {

    }
}
