package max.edu;

import java.time.LocalDate;
import java.time.Month;

public class Main {

    public static void main(String[] args) {
        LocalDate date = LocalDate.of(1999, Month.APRIL , 11);
        System.out.println(date.getDayOfWeek());
        LocalDate jan = LocalDate.of(2021 , Month.JANUARY , 1);
        System.out.println(jan.plusDays(255));
    }
}
