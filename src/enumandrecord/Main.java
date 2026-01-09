package enumandrecord;

public class Main {
    public static void main(String[] args) {
        Seasons.SPRING.method();
        Seasons.WINTER.method();
        Seasons.WINTER.printDescription();
        Seasons.AUTUMN.printDescription();
        System.out.println(Seasons.SPRING.ordinal());

        Seasons[] enums = Seasons.values();
        for (Seasons season : enums) {
            System.out.println(season);
        }

        System.out.println(Seasons.valueOf("WINTER"));

        MyClass myClass = new MyClass(2, "Apple");
        System.out.println(myClass);
    }
}
