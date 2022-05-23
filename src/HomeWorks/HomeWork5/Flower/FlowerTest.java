package HomeWorks.HomeWork5.Flower;

import java.util.Arrays;

public class FlowerTest {
    public static void main(String[] args) {
        double sum = 0;
        Rose rose = new Rose("red", 10, 9);
        Tulip tulip = new Tulip("white", 7, 5);
        Daisy daisy = new Daisy("blue", 8, 15);
        Flower[] flowers = new Flower[]{rose, tulip, daisy};
        for (Flower f : flowers) {
            sum = sum + f.getPrice();
        }
        System.out.println("Your bouquet is composed from:");
        System.out.println(rose.getQuantity() + " " + rose.getColor() + " roses,");
        System.out.println(tulip.getQuantity() + " " + tulip.getColor() + " tulips,");
        System.out.println(daisy.getQuantity() + " " + daisy.getColor() + " daisys.");
        System.out.println("Your price is: " + sum);

    }
}
