package lesson11and12.task3;

public class SavingsAccount extends Account{
    public SavingsAccount(String accountNumber, double balance) {
        super(accountNumber, balance);
    }

    @Override
    void calculateInterest() {
        System.out.println("Faiz Hesablandi = 10%");
    }
}
