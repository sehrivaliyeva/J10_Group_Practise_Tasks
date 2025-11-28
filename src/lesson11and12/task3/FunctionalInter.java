package lesson11and12.task3;

public interface FunctionalInter {
    void m3();

   default void m4(){
        System.out.println("m4");
        m5();
    }

    private int m5(){
        System.out.println("salam");
        return 1;
    }

}
