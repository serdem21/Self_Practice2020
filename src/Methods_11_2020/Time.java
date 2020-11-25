package Methods_11_2020;

import java.time.LocalDateTime;
import java.time.LocalTime;

public class Time {
    public static void main(String[] args) {

        LocalTime t1 = LocalTime.of(5,25,40);
        System.out.println(t1);

        LocalTime t2 = LocalTime.now();
        System.out.println(t2);

        LocalDateTime t3 = LocalDateTime.of(2020, 11,  23, 11, 50);

        System.out.println( t3);
    }
}
