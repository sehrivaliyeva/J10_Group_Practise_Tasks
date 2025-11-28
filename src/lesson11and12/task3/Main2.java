package lesson11and12.task3;

public class Main2 {
    public static void main(String[] args) {
        MyInterface myInterface=new MyInterface() {
            @Override
            public void m1() {

            }

            @Override
            public void m2() {

            }
        };

        FunctionalInter functionalInter=()-> {System.out.println("salam");
        };
    }
}
