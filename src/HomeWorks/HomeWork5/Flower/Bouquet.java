package HomeWorks.HomeWork5.Flower;

import java.math.BigDecimal;
import java.util.ArrayList;

public class Bouquet {
    private ArrayList<Flower> flowers;

    public Bouquet() {
        this.flowers = new ArrayList<>();
    }

    public double getBuquetCost() {
        double sum = 0;
        for (Flower f : flowers) {
            sum = (sum + f.getPrice() * f.getQuantity());
        }
        double price = BigDecimal.valueOf(sum).setScale(2, BigDecimal.ROUND_HALF_DOWN).doubleValue();
        return price;
    }

    public void setBuquet(Flower flower) {
        flowers.add(flower);
    }

}
