package homeworks.homework8.seasons;

import java.time.Month;
import java.util.Scanner;

public class SeasonService {
    Months months;
    Scanner s = new Scanner(System.in);

    public void monthsAvailable() {
        String month;
        System.out.print("Enter month: ");
        month = s.nextLine().toUpperCase();
        for (Months months : Months.values()) {
            if (month.equals(month)) {
                System.out.println("This month is present!");
                break;
            }
            System.out.println("This month is absent!");
        }
    }

    public void monthsInSeason() {
        String season;
        int k = 0;
        System.out.print("Enter season: ");
        season = s.nextLine().toUpperCase();
        System.out.println("Your season: " + season + ". There are months: ");
        for (Months months : Months.values()) {
            if (months.seasons.name().equals(season)) {
                System.out.println(months);
                k++;
            }
        }
        if (k == 0) {
            System.out.println("No that season!");
        }
    }

    public void thatNumber() {
        int number;
        int k = 0;
        System.out.print("Enter number of days: ");
        number = s.nextInt();
        for (Months months : Months.values()) {
            if (months.days == number) {
                System.out.println(months);
                k++;
            }
        }
        if (k == 0) {
            System.out.println("No months with that number of days!");
        }
    }

    public void smallerNumber() {
        int number;
        int k = 0;
        System.out.print("Enter number of days: ");
        number = s.nextInt();
        for (Months months : Months.values()) {
            if (months.days < number) {
                System.out.println(months);
                k++;
            }
        }
        if (k == 0) {
            System.out.println("No months with smaller number of days!");
        }
    }

    public void biggerNumber() {
        int number;
        int k = 0;
        System.out.print("Enter number of days: ");
        number = s.nextInt();
        for (Months months : Months.values()) {
            if (months.days > number) {
                System.out.println(months);
                k++;
            }
        }
        if (k == 0) {
            System.out.println("No months with bigger number of days!");
        }
    }

    public void nextSeason() {
        String season;
        int k = 0;
        System.out.print("Enter season: ");
        season = s.nextLine().toUpperCase();
        System.out.println("Your season: " + season + ". The next season: ");
        for (Months months : Months.values()) {
            if (months.seasons.name().equals(season)) {
                System.out.println(months);
                k++;
                break;
            }
        }
        if (k == 0) {
            System.out.println("No that season!");
        }
    }
    public void previousSeason() {
        String season;
        int k = 0;
        System.out.print("Enter season: ");
        season = s.nextLine().toUpperCase();
        System.out.println("Your season: " + season + ". The previous season: ");
        for (Months months : Months.values()) {
            if (months.seasons.name().equals(season)) {
                System.out.println(months);
                k++;
                break;
            }
        }
        if (k == 0) {
            System.out.println("No that season!");
        }
    }

    public void evenNumberOfDays() {
        String season;
        System.out.println("There are months with an even number of days: ");
        for (Months months : Months.values()) {
            if (months.days % 2 == 0) {
                System.out.println(months);
            }
        }
    }

    public void oddNumberOfDays() {
        String season;
        System.out.println("There are months with an odd number of days: ");
        for (Months months : Months.values()) {
            if (months.days % 2 != 0) {
                System.out.println(months);
            }
        }
    }

    public void isEvenNumberOfDays() {
        String month;
        int k = 0;
        System.out.print("Enter month: ");
        month = s.nextLine().toUpperCase();
        for (Months months : Months.values()) {
            if (months.name().equals(month)) {
                if (months.days % 2 == 0) {
                    System.out.println("There is month with an even number of days");
                } else {
                    System.out.println("There is month with an odd number of days");
                }
                k++;
            }
        }
        if (k == 0) {
            System.out.println("No that month!");
        }
    }
}
