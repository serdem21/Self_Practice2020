package Methods_11_2020;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Date {
    public static void main(String[] args) {

        DateTimeFormatter df = DateTimeFormatter.ofPattern("MMMM/yyyy/dd EEEE");
        LocalDate yesterday = LocalDate.of(2020, 11, 22);
        System.out.println(yesterday.format(df));

        System.out.println(yesterday.isLeapYear());

        LocalDate today = LocalDate.now();
        System.out.println("Today is: " + today);

    }

}
