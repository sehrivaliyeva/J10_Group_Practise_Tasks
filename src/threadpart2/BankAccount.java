package threadpart2;

public class BankAccount {
    double balance =100;

   public synchronized void withdraw(double amount){
       if (amount > balance){
           System.out.println("withdraw failed");
       }else balance = balance-amount;
       System.out.println(balance+"- balans");
   }


}
