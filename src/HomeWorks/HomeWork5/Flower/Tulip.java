package HomeWorks.HomeWork5.Flower;

public class Tulip extends Flower {
    private String color;
    private double price;
    private int quantity;

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Tulip(String color, double price, int quantity){
        setColor(color);
        setPrice(price);
        setQuantity(quantity);
    }
}
