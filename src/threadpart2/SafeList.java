package threadpart2;

import java.util.ArrayList;
import java.util.List;

public class SafeList {
    List<Integer> list = new ArrayList<>();
    public synchronized void add(Integer i) {
        System.out.println(Thread.currentThread().getName() + " Bu thread isleyir");
        list.add(i);
    }
}
