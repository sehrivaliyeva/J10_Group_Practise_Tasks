package lesson21and22;

import java.util.PriorityQueue;

public class Task5 {
    public static void main(String[] args) {

        PriorityQueue<Patient> patients = new PriorityQueue<>();

        patients.add(new Patient("Ali", 2));
        patients.add(new Patient("Veli", 1));
        patients.add(new Patient("Aysel", 3));
        patients.add(new Patient("Kamran", 1));

        System.out.println("Xəstələr prioritetə görə qəbul olunur:");

        while (!patients.isEmpty()) {
            System.out.println(patients.poll());
        }
    }
}
