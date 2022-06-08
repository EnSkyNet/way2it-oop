package homeworks.homework15.zooclub;

import java.util.*;

public class ZooClubTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ClubService clubService = new ClubService();
        int choise = 6;
        while (choise > 0) {
            System.out.println("Menu by zooClub:");
            System.out.println(" 1. Add new person to zooClub.");
            System.out.println(" 2. Add new animal to person.");
            System.out.println(" 3. Delete animal from person.");
            System.out.println(" 4. Delete person from zooClub.");
            System.out.println(" 5. Show zooClub persons with his animals.");
            System.out.println(" 0. Exit.");
            System.out.print(" Enter your choice: ");
            choise = scanner.nextInt();
            switch (choise) {
                case 1:
                    clubService.addPerson();
                    break;
                case 2:
                    clubService.addAnimal();
                    break;
                case 3:
                    clubService.removeAnimal();
                    break;
                case 4:
                    clubService.removePerson();
                    break;
                case 5:
                    clubService.showClub();
                    break;
                default:
                    break;
            }
        }
    }
}
