package lesson11and12.task3;

public class CurrentAccount extends Account{
    public CurrentAccount(String accountNumber, double balance) {
        super(accountNumber, balance);
    }

    @Override
    void calculateInterest() {
        System.out.println("Faiz hesablandi = 0%");
    }
}
