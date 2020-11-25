package Methods_11_2020;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class TimeFormat {

    public static void main(String[] args) {

    /*
    LocalDate:
        year: yyyy
        month: MM (number), MMM(three letters of month), MMMM(full name)
        days: dd
        name of day: E(three letters) , EEEE (full name)
        Month/ Day / Year
     */

        DateTimeFormatter df = DateTimeFormatter.ofPattern("MMMM/yyyy/dd EEEE");
        LocalDate today = LocalDate.now();
        System.out.println(today.format(df));

        System.out.println("==========================");

        DateTimeFormatter t1 = DateTimeFormatter.ofPattern("hh:mm a");
        LocalTime t2 = LocalTime.of(12,15,55);
        System.out.println(t2.format(t1));

        System.out.println("==========================");


        LocalDateTime t4 = LocalDateTime.of(2020, 11,24,12,50,55);
        System.out.println(t4.format(df));

        System.out.println("==========================");


        LocalDate tomorrow = LocalDate.of(2020, 11,25);
        System.out.println(tomorrow.format(df));

        boolean b = today.isBefore(tomorrow);
        boolean b1 = today.isAfter(tomorrow);
        System.out.println(b);
        System.out.println(b1);

        System.out.println("==========================");
        // calculate the age
        // 2020-11-23      2020

        int currentYear = LocalDate.now().getYear();
        LocalDate birthday = LocalDate.of(1981,06,22);

        int age = currentYear-birthday.getYear();
        System.out.println(age);

        System.out.println("==========================");

        DateTimeFormatter br = DateTimeFormatter.ofPattern("hh:mm a");
        LocalTime classStarts = LocalTime.of(10, 0);
        LocalTime firstBreak = classStarts.plusMinutes(45);
        System.out.println(firstBreak);

        LocalTime secondBreak = firstBreak.plusHours(1);
        System.out.println(secondBreak);

        LocalTime thirdBreak = secondBreak.plusHours(1).plusMinutes(15);
        System.out.println(thirdBreak);

        LocalTime afternoonClass = thirdBreak.plusHours(1).plusMinutes(15);
        System.out.println("Come back at: "+afternoonClass.format(br));

    }
}
