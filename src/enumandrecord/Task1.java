package enumandrecord;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        System.out.print("Statusu daxil edin: ");
        Scanner scanner = new Scanner(System.in);
        String status = scanner.nextLine();
        OrderStatus orderStatus = OrderStatus.NEW;
        System.out.println(enumStatus(status, orderStatus));


    }
    public static OrderStatus enumStatus(String status, OrderStatus orderStatus ) throws IllegalArgumentException{
            if(OrderStatus.valueOf(status)== orderStatus ) {
                orderStatus.printDescription();
                System.out.println(orderStatus.isFinalStatus());
                return orderStatus;
            }
            else throw new IllegalArgumentException("Status yanlisdir");
    };
}
