package threadpart2;

public class User extends Thread {
    BankAccount bankAccount;
    User( BankAccount bankAccount) {
        this.bankAccount = bankAccount;
    }
    @Override
    public void run() {
        bankAccount.withdraw(50 );
    }

}
