package HomeWorks.HomeWork5.Warrior;

public class WarriorTest {
    public static void main(String[] args) {
        Arbalest arbalest = new Arbalest(10, 8);
        Spear spear = new Spear(10, 12);
        Sword sword = new Sword(10, 13);
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
        int k;
        int attackWarrior;
        int protectionWarrior;
        while (quantity != 1) {
            for (int i = 0; i < warriors.length; i++) {
                while (warriors[i] == null) {
                    i++;
                    if (i == warriors.length) {
                        i = 0;
                    }
                }
                attackWarrior = i;
                k = i + 1;
                if (i == warriors.length - 1) {
                    k = 0;
                }
                while (warriors[k] == null) {
                    k++;
                    if (k == warriors.length) {
                        k = 0;
                    }
                }
                protectionWarrior = k;
                System.out.println("Warrior " + (attackWarrior + 1) + " attack warrior " + (protectionWarrior + 1));
                warriors[protectionWarrior].attack(warriors[attackWarrior].getDamage());
                System.out.println("Warrior " + (protectionWarrior + 1) + " have health " + warriors[protectionWarrior].getHealth());

                if (warriors[protectionWarrior].getHealth() <= 0) {
                    System.out.println("Warrior " + (protectionWarrior + 1) + " killed!");
                    warriors[protectionWarrior] = null;
                    quantity--;
                    //}
                    System.out.println();
                    break;
                }
                System.out.println();
            }
        }
        System.out.println("---------------------------");
        for (int i = 0; i < warriors.length; i++) {
            if (warriors[i] != null) {
                System.out.println("Warriors " + (i + 1) + " WIN!!!");
                System.out.println("---------------------------");
            }
        }
    }
}