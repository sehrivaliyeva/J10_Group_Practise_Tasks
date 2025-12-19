package tasks;

import java.util.LinkedList;
import java.util.Queue;

public class Task2 {
    //2. Sadə növbə simulyatoru yaradın.
    // İnsanlar növbəyə qoşulur və müəyyən vaxtdan sonra növbədən çıxırlar.
    // Enqueue və dequeue əməliyyatlarını əks etdirən metodlar yazın.
    //Input: Queue<String> customerQueue
    //Output: Növbə əməliyyatlarından sonrakı vəziyyət

    public static void enqueue(Queue<String> customerQueue,String customerName) {
       customerQueue.offer(customerName);
        System.out.println(customerName+"  siraya elave olundu");

    }
    public static void dequeue(Queue<String> customerQueue)  {
        if(customerQueue.isEmpty()){
            System.out.println(" novbe boshdur");
        }
        else {
            System.out.println("siradan cixildi" + " " + customerQueue.remove());
        }
    }

    public static void main(String[] args) {
            Queue<String> customerQueue = new LinkedList<>();
            enqueue(customerQueue,"Ali");
            enqueue(customerQueue,"Veli");
            enqueue(customerQueue,"Aysel");
            enqueue(customerQueue,"Nermin");
            enqueue(customerQueue,"Murad");
            enqueue(customerQueue,"Ilkin");
            dequeue(customerQueue);
            dequeue(customerQueue);
            dequeue(customerQueue);
            dequeue(customerQueue);

            System.out.println(customerQueue);
    }

}
