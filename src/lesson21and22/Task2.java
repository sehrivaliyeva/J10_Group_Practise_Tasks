package lesson21and22;

import java.util.LinkedList;
import java.util.Queue;

public class Task2 {
    public static void enqueue(Queue<String> customerQueue, String customer) {
        customerQueue.add(customer);
        System.out.println(customer + " novbeye qosuldu");
    }

    public static void dequeue(Queue<String> customerQueue) {
        if (customerQueue.isEmpty()) {
            System.out.println("Novbe bosdur");
        } else {
            String removedCustomer = customerQueue.remove();
            System.out.println(removedCustomer + " novbedan cixildi");
        }

    }

    public static void main(String[] args) {
        Queue<String> customerQueue = new LinkedList<>();

        enqueue(customerQueue, "Ali");
        enqueue(customerQueue, "Veli");
        enqueue(customerQueue, "Aysel");

        dequeue(customerQueue);
        dequeue(customerQueue);

        System.out.println("Növbənin son vəziyyəti: " + customerQueue);


    }
}
