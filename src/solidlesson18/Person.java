package solidlesson18;

public class Person {
    Payment payment;

    public static void odenilecekMebleg(Payment payment) {
        payment.pay();
    }

    public static void main(String[] args) {
        odenilecekMebleg(new CashPayment());
    }
}
