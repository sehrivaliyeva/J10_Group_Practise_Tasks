package dateandthreadpart1;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class Test2 {
    public static void main(String[] args) {
        System.out.println(LocalDateTime.now());

        System.out.println(LocalDateTime.of(2026, Month.JANUARY, 15, 21, 23, 59));
        System.out.println(LocalDateTime.now().plusHours(2));
        System.out.println(LocalDateTime.now().toLocalDate());
        System.out.println(LocalDateTime.now().toLocalTime());
        LocalDateTime forattedDateTime =  LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm");
        System.out.println(formatter.format(forattedDateTime));
        LocalDateTime date2 = LocalDateTime.now();
        LocalDateTime date3 = LocalDateTime.of(2025, Month.JANUARY, 15, 21, 23, 59);
        System.out.println(Duration.between(date3, date2).toDays());
    }
}
