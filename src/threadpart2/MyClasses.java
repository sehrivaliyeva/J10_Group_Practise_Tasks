package threadpart2;

public class MyClasses extends  Thread{
   Counter counter;
   public MyClasses(Counter counter) {
        this.counter = counter;
   }
    public void run(){
        counter.increment();
    }
}
