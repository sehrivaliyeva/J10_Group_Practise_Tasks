package lesson21and22;

import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("Ali", 25);
        Person person2 = new Person("Murad", 15);
        Queue<Person> queue = new PriorityQueue<>();
        queue.add(person1);
        queue.add(person2);
        System.out.println(queue.peek());


    }
}
