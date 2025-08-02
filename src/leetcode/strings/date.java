package leetcode.strings;


import java.time.*;
import java.time.temporal.*;

public class date {

    public static void main(String[] args) {
        // Example 1
        String date1 = "2019-06-29";
        String date2 = "2019-06-30";

        // Calculate and print the number of days
        System.out.println("Number of days: " + daysBetween(date1, date2));

        // Example 2
        String date3 = "2020-01-15";
        String date4 = "2019-12-31";

        // Calculate and print the number of days
        System.out.println("Number of days: " + daysBetween(date3, date4));
    }

    public static int daysBetween(String date1, String date2) {
        // Parse the strings into LocalDate
        LocalDate startDate = LocalDate.parse(date1);
        LocalDate endDate = LocalDate.parse(date2);

        // Calculate the number of days between the two dates
        return Math.abs((i`nt) ChronoUnit.DAYS.between(startDate, endDate));
    }
}
