package OFFICE_HOURS.Practice_11_27_2020;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class breakTime {

    public static void main(String[] args) {

        DateTimeFormatter tf = DateTimeFormatter.ofPattern("h:mm a");
        LocalTime breakTime = LocalTime.now().plusMinutes(10);
        System.out.println("come back at: " + breakTime.format(tf));


    }
}
