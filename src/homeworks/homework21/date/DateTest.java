package homeworks.homework21.date;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.util.Date;

public class DateTest {
    public static void main(String[] args) {

        Date date = new Date();
        System.out.println("Old Date format is:");
        System.out.println(date.toString());

        System.out.println();
        System.out.println("New LocalDate format is:");
        System.out.println(convertToLocalDate(date).toString());

        System.out.println();
        System.out.println("New LocalTime format is:");
        System.out.println(convertToLocalTime(date).toString());

        System.out.println();
        System.out.println("New LocalDateTime format is:");
        System.out.println(convertToLocalDateTime(date).toString());
    }

    public static LocalDate convertToLocalDate(Date dateToConvert) {
        return dateToConvert.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
    }

    public static LocalTime convertToLocalTime(Date dateToConvert) {
        return dateToConvert.toInstant().atZone(ZoneId.systemDefault()).toLocalTime();
    }

    public static LocalDateTime convertToLocalDateTime(Date dateToConvert) {
        return dateToConvert.toInstant().atZone(ZoneId.systemDefault()).toLocalDateTime();
    }
}
