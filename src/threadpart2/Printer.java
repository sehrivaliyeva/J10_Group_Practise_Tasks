package threadpart2;

public class Printer {
   public synchronized void  print(String text){
       System.out.println(Thread.currentThread().getName()+"bu thread cap etdi bu yazini"+text);

   }
}
