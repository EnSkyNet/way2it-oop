package homeworks.homework8.seasons;

import java.util.Scanner;

public class SeasonsTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Scanner s = new Scanner(System.in);
        String month;
        String season;
        int number;
        SeasonService service = new SeasonService();
        String chose = "11";
        while (!chose.equals("0")) {
            System.out.println();
            System.out.println("1 - Is the month available?");
            System.out.println("2 - All months in entered season");
            System.out.println("3 - All months with that number of days");
            System.out.println("4 - All months with smaller number of days");
            System.out.println("5 - All months with bigger number of days");
            System.out.println("6 - Next season");
            System.out.println("7 - Previous season");
            System.out.println("8 - All month with an even number of days");
            System.out.println("9 - All month with an odd number of days");
            System.out.println("10 - Have this month an even number of days?");
            System.out.println("0 - EXIT");
            System.out.println();
            System.out.print("Enter chose: ");
            chose = scan.next();
            switch (chose) {
                case "1":
                    System.out.print("Enter month: ");
                    month = s.nextLine().toUpperCase();
                    service.monthsAvailable(month);
                    break;
                case "2":
                    System.out.print("Enter season: ");
                    season = s.nextLine().toUpperCase();
                    service.monthsInSeason(season);
                    break;
                case "3":
                    System.out.print("Enter number of days: ");
                    number = s.nextInt();
                    service.thatNumber(number);
                    break;
                case "4":
                    System.out.print("Enter number of days: ");
                    number = s.nextInt();
                    service.smallerNumber(number);
                    break;
                case "5":
                    System.out.print("Enter number of days: ");
                    number = s.nextInt();
                    service.biggerNumber(number);
                    break;
                case "6":
                    System.out.print("Enter season: ");
                    season = s.nextLine().toUpperCase();
                    service.nextSeason(season);
                    break;
                case "7":
                    System.out.print("Enter season: ");
                    season = s.nextLine().toUpperCase();
                    service.previousSeason(season);
                    break;
                case "8":
                    service.evenNumberOfDays();
                    break;
                case "9":
                    service.oddNumberOfDays();
                    break;
                case "10":
                    System.out.print("Enter month: ");
                    month = s.nextLine().toUpperCase();
                    service.isEvenNumberOfDays(month);
                    break;
                default:
                    break;
            }
        }
    }
}
