package lesson11and12.task3;

public abstract class Account {
    private String accountNumber;
    protected double balance;

    public Account(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void deposit(int amount) {
        balance += amount;
        System.out.println("Deposit elave olundu");
    }

    public void withdraw() {
        System.out.println("Withdraw cash");
    }

    abstract void calculateInterest();

    public void deposit(String cuncurrency, int amount) {
        if (cuncurrency.equals("USD")) {
            balance += amount * 1.70;
            System.out.println("balance artdi" + balance);
        } else {
            System.out.println(balance += amount);
        }
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}