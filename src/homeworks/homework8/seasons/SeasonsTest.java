package homeworks.homework8.seasons;

import java.util.Scanner;

public class SeasonsTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
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
                    service.monthsAvailable();
                    break;
                case "2":
                    service.monthsInSeason();
                    break;
                case "3":
                    service.thatNumber();
                    break;
                case "4":
                    service.smallerNumber();
                    break;
                case "5":
                    service.biggerNumber();
                    break;
                case "6":
                    service.nextSeason();
                    break;
                case "7":
                    service.previousSeason();
                    break;
                case "8":
                    service.evenNumberOfDays();
                    break;
                case "9":
                    service.oddNumberOfDays();
                    break;
                case "10":
                    service.isEvenNumberOfDays();
                    break;
                default:
                    break;
            }
        }
    }
}
