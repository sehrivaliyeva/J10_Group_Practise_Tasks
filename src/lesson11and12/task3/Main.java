package lesson11and12.task3;

public class Main {
    public static void main(String[] args) {

        Account [] accounts = new Account[2];
        CurrentAccount account1 = new CurrentAccount("123456",100);
        SavingsAccount account2 = new SavingsAccount("654321",200);

        accounts[0] = account1;
        accounts[1] = account2;

        for (Account a : accounts  ) {
            a.deposit("USD",300);
            a.withdraw();
        }
    }
}
