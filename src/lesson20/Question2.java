package lesson20;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> names = new ArrayList<>();

        System.out.println("PRESS ENTER AFTER FINISHING INPUT");

        while(true){
            System.out.print("Ad daxil edin: ");
            String name = sc.nextLine();
            if(name.isEmpty())break;
            names.add(name);
        }
        sortByAlphabet(names);
        showMoreSize(5,names);

    }
    static void sortByAlphabet(List<String> names){
        Collections.sort(names);
        System.out.println(names);
    }

    static  void showMoreSize(int size, List<String> names){
        System.out.println("Ölçüsü " + size +" böyük olan adlar");
        for (String name : names) {
            if(name.length()>size){
                System.out.println(name);
            }
        }
    }
}
