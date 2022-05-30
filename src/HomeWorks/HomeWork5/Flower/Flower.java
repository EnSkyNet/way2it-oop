package HomeWorks.HomeWork5.Flower;

public class Flower {
    private String color;
    private double price;
    private int quantity;

    public Flower(String color, double price, int quantity) {
        this.color = color;
        this.price = price;
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getColor() {
        return color;
    }


}
