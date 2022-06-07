package homeworks.homework5.flower;

public class FlowerTest {
    public static void main(String[] args) {

        Rose rose = new Rose("red", 10.22, 9);
        Tulip tulip = new Tulip("white", 7.35, 5);
        Daisy daisy = new Daisy("blue", 8.25, 15);

        Bouquet bouquet = new Bouquet();
        bouquet.setBuquet(rose);
        bouquet.setBuquet(tulip);
        bouquet.setBuquet(daisy);

        System.out.println("Your bouquet is composed from:");
        System.out.println(rose.getQuantity() + " " + rose.getColor() + " roses,");
        System.out.println(tulip.getQuantity() + " " + tulip.getColor() + " tulips,");
        System.out.println(daisy.getQuantity() + " " + daisy.getColor() + " daisys.");
        System.out.println("Your price is: " + bouquet.getBuquetCost());

    }
}
