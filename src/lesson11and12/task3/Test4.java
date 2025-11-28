package lesson11and12.task3;

import java.io.ObjectStreamException;

public class Test4 {
    public static void main(String[] args) {
        long a = 10;
        int b = (int) a;

        short a1 = 2;
        int b1 = a1;


        CarParent car = new Car();
        car.drive();
        Car car1 = (Car) car;
        car1.drive();
    }
}
