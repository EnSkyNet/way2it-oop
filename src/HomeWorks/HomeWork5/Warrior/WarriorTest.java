package HomeWorks.HomeWork5.Warrior;

import java.util.Arrays;

public class WarriorTest {
    public static void main(String[] args) {
        Arbalest arbalest = new Arbalest(15, 15);
        Spear spear = new Spear(20, 10);
        Sword sword = new Sword(18, 12);
//
        Warrior[] warriors = new Warrior[]{arbalest, spear, sword};
        for (int i = 0; i < warriors.length; i++) {
            System.out.println("Warrior " + (i + 1) + " is " + warriors[i].status());
        }
        System.out.println();
        System.out.println("Fight!!!");
        System.out.println();
        fight(warriors);


    }

    public static void fight(Warrior[] warriors) {
        int quantity = warriors.length;
        int k=1;
        while (quantity != 1) {
            for (int i = 0; i < warriors.length; i++) {
                if (warriors[i] == null) {
                    break;
                } else {

                            System.out.println("Warrior " + (i + 1) + " atack warrior " + (i + 2));
                            warriors[i+2].attack(warriors[i].getDamage());
                            System.out.println("Warrior " + (j + 1) + " have healht " + warriors[j].getHealth());
                            if (warriors[j].getHealth() <= 0) {
                                System.out.println("Warrior " + (j + 1) + " killed!");
                                warriors[j] = null;
                                quantity--;
                            }

                            System.out.println();
                            break;
                        }
                       // break;
                    }
                    System.out.println();
                }
            }
        }
        for (int i = 0; i < warriors.length; i++) {
            if (warriors[i] == null) {
                break;
            }
            System.out.println("Warriors " + (i + 1) + " WIN!!!");
        }
    }

}