package tasks;

//4.Verilmiş String-in palindrom olub-olmadığını yoxlamaq üçün Deque
// istifadə edən bir metod yazın. (Palindrom: sağdan və soldan eyni oxunan söz,
// məsələn "ata" və ya "ana")
//
//
//Input: String word
//Output: Boolean

import java.util.ArrayDeque;
import java.util.Deque;

public class Task4 {
    public static void main(String[] args) {
        String word = "anzfn;sjf;iajsfna";
        isPolindrome(word);



    }
    static void isPolindrome(String word){
        Deque<Character> queue = new ArrayDeque<>();

        for (char c : word.toCharArray()) {
            queue.addLast(c);
        }
        for(int i = 0; i < word.length()/2; i++){
            if(queue.removeFirst() != queue.removeLast()){
                System.out.println("Palindrom deyil");
                return;

            }
        }
        System.out.println("Palindrom");
    }
}
