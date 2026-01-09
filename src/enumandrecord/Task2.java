package enumandrecord;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Roll daxil edin: ");
        UserRole userRole = UserRole.valueOf(sc.nextLine());

        System.out.print("Level daxil edin: ");
        int requiredLevel = sc.nextInt();

        System.out.println(checkUserRole(userRole, requiredLevel));


    }

    public static boolean checkUserRole(UserRole userRole, int requiredLevel){
        return userRole.hasPermission(requiredLevel);
    }
}
