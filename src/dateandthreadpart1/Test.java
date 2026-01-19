package dateandthreadpart1;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.util.Locale;

public class Test {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        LocalDate date1=LocalDate.of(1997, Month.AUGUST, 9);
        System.out.println(date1);
        System.out.println(date.getMonth());
        System.out.println(date.getYear());
        System.out.println(date.getDayOfWeek());
        System.out.println(date.getDayOfMonth());
        //System.out.println(date = date.plusDays(21));
        //System.out.println(date = date.minusMonths(3));
        System.out.println(date.getDayOfWeek().equals(DayOfWeek.SUNDAY));
        System.out.println(Period.between(date, date1));
    }
}
