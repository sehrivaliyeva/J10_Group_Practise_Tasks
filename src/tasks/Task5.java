package tasks;

import java.util.PriorityQueue;

public class Task5 {
    //5. Xəstəxana təcili yardım şöbəsi üçün bir prioritet növbəsi yaradan
    // və xəstələri prioritetə görə sıralayan bir proqram yazın.
    // (1= təcili, 2 = orta, 3 = gözləyə bilər)
    //Input: PriorityQueue<Patient> patients
    //Output: Prioritetə görə sıralanmış xəstələr
    public static void main(String[] args) {
        Patient patient1 = new Patient("Ali", 3);
        Patient patient2 = new Patient("Veli", 2);
        Patient patient3 = new Patient("Aysel", 1);
        PriorityQueue<Patient> priorityQueue = new PriorityQueue<>();
        priorityQueue.add(patient1);
        priorityQueue.add(patient2);
        priorityQueue.add(patient3);
        System.out.println(priorityQueue);

    }


}

