package homeworks.homework8.seasons;

import java.awt.*;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;

public class SeasonService {
    Scanner s = new Scanner(System.in);

    public void monthsAvailable(String month) {
       /* int k = 0;
        for (Months m : Months.values()) {
            if (m.name().equals(month)) {
                System.out.println("This month is present!");
                k++;
                break;
            }
        }
        if (k == 0) {
            System.out.println("This is no month!");
        }*/
        if (Arrays.stream(Months.values()).anyMatch(months -> {
            if (months.name().equals(month)) {
                System.out.println("The " + months.name() + " is available!");
                return true;
            } else {
                return false;
            }
        })) {
        } else {
            System.out.println("This is no month!");
        }
    }

    public void monthsInSeason(String season) {
        /*int k = 0;
        System.out.println("Your season: " + season + ". There are months: ");
        for (Months months : Months.values()) {
            if (months.seasons.name().equals(season)) {
                System.out.println(months);
                k++;
            }
        }
        if (k == 0) {
            System.out.println("No that season!");
        }*/
        if (Arrays.stream(Months.values()).filter(months -> {
            if (months.getSeason().name().equals(season)) {
                if (months.getSeason().name().equals(season)) {
                    System.out.println("Your season: " + season + ". There are months: " + months.name());
                }
                return true;
            } else {
                return false;
            }
        }).count() == 0) {
            System.out.print("This is no season!");
        }
    }

    public void thatNumber(int number) {
       /* int k = 0;
        for (Months months : Months.values()) {
            if (months.days == number) {
                System.out.println(months);
                k++;
            }
        }
        if (k == 0) {
            System.out.println("No months with that number of days!");
        }*/
        if (Arrays.stream(Months.values()).filter(months -> {
            if (months.getDays() == number) {
                System.out.print(months.name() + " ");
                return true;
            } else {
                return false;
            }
        }).count() == 0) {
            System.out.print("No months with that number of days!");
        }
        System.out.println();
    }

    public void smallerNumber(int number) {
        /*int k = 0;
        for (Months months : Months.values()) {
            if (months.days < number) {
                System.out.println(months);
                k++;
            }
        }
        if (k == 0) {
            System.out.println("No months with smaller number of days!");
        }*/
        /*if (Arrays.stream(Months.values()).anyMatch(days -> days.getDays() < number)) {
            Arrays.stream(Months.values()).filter(days -> days.getDays() < number).forEach(months -> System.out.print(months.name() + " "));
            System.out.println();
        } else {
            System.out.println("No months with smaller number of days!");
        }*/
        if (Arrays.stream(Months.values()).filter(months -> {
            if (months.getDays() < number) {
                System.out.print(months.name() + " ");
                return true;
            } else {
                return false;
            }
        }).count() == 0) {
            System.out.print("No months with smaller number of days!");
        }
        System.out.println();
    }

    public void biggerNumber(int number) {
        /*int k = 0;
        for (Months months : Months.values()) {
            if (months.days > number) {
                System.out.println(months);
                k++;
            }
        }
        if (k == 0) {
            System.out.println("No months with bigger number of days!");
        }*/
        if (Arrays.stream(Months.values()).filter(months -> {
            if (months.getDays() > number) {
                System.out.print(months.name() + " ");
                return true;
            } else {
                return false;
            }
        }).count() == 0) {
            System.out.print("No months with bigger number of days!");
        }
        System.out.println();
    }

    public void nextSeason(String season) {
        /*int temp = -1;
        int k = 0;
        System.out.print("Your season: " + season + ". The next season: ");
        for (Months months : Months.values()) {
            if (months.seasons.name().equals(season)) {
                temp = months.seasons.ordinal();
                k++;
                break;
            }
        }
        if (k == 0) {
            System.out.println("No that season!");
        } else {
            if (temp == 3) {
                System.out.println(Seasons.values()[0].name());
            } else {
                System.out.println(Seasons.values()[temp + 1].name());
            }

        }*/
        if (Arrays.stream(Seasons.values()).filter(seasons -> {
            if (seasons.name().equals(season)) {
                System.out.print("Your season: " + season + ". The next season: ");
                if (seasons.ordinal() == 3) {
                    System.out.println(Seasons.values()[0].name());
                } else {
                    System.out.println(Seasons.values()[seasons.ordinal() + 1].name());
                }
                return true;
            } else {
                return false;
            }
        }).count() == 0) {
            System.out.println("This is no season!");
        }
    }

    public void previousSeason(String season) {
        /*int temp = -1;
        int k = 0;
        System.out.print("Enter season: ");
        season = s.nextLine().toUpperCase();
        System.out.print("Your season: " + season + ". The previous season: ");
        for (Months months : Months.values()) {
            if (months.seasons.name().equals(season)) {
                temp = months.seasons.ordinal();
                k++;
                break;
            }
        }
        if (k == 0) {
            System.out.println("No that season!");
        } else {
            if (temp == 0) {
                System.out.println(Seasons.values()[3].name());
            } else {
                System.out.println(Seasons.values()[temp - 1].name());
            }

        }*/
        if (Arrays.stream(Seasons.values()).filter(seasons -> {
            if (seasons.name().equals(season)) {
                System.out.print("Your season: " + season + ". The previous season: ");
                if (seasons.ordinal() == 0) {
                    System.out.println(Seasons.values()[3].name());
                } else {
                    System.out.println(Seasons.values()[seasons.ordinal() - 1].name());
                }
                return true;
            } else {
                return false;
            }
        }).count() == 0) {
            System.out.println("This is no season!");
        }
    }

    public void evenNumberOfDays() {
        System.out.println("There are months with an even number of days: ");
        /*for (Months months : Months.values()) {
            if (months.days % 2 == 0) {
                System.out.println(months);
            }
        }*/
        Arrays.stream(Months.values()).filter(days -> days.getDays() % 2 == 0).forEach(months -> System.out.print(months.name() + " "));
        System.out.println();
    }

    public void oddNumberOfDays() {
        System.out.println("There are months with an odd number of days: ");
        /*for (Months months : Months.values()) {
            if (months.days % 2 != 0) {
                System.out.println(months);
            }
        }*/
        Arrays.stream(Months.values()).filter(days -> days.getDays() % 2 != 0).forEach(months -> System.out.print(months.name() + " "));
        System.out.println();
    }

    public void isEvenNumberOfDays(String month) {
        /*int k = 0;
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
        }*/
        if (Arrays.stream(Months.values()).filter(months -> {
            if (months.name().equals(month)) {
                if (months.getDays() % 2 == 0) {
                    System.out.println("The " + months.name() + " have an even number of days");
                } else {
                    System.out.println("The " + months.name() + " have an odd number of days");
                }
                return true;
            } else {
                return false;
            }
        }).count() == 0) {
            System.out.println("This is no month!");
        }
    }
}