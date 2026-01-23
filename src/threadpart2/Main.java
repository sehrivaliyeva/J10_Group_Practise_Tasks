package threadpart2;

public class Main {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();
        User withdrawFromUser1 = new User(bankAccount);
        User withdrawFromUser2 = new User(bankAccount);
        withdrawFromUser1.start();
        withdrawFromUser2.start();


    }
}
