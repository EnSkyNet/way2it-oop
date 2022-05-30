
package HomeWorks.HomeWork3.Rectangle;

public class Rectangle {
    private int length;
    private int width;

    public void setLength(int length) {
        this.length = length;
    }

    public int getLength() {
        return length;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getWidth() {
        return width;
    }

    public void Rectangle() {
        this.length = 100;
        this.width = 50;
    }

    public void Rectangle(int length, int width) {
        setLength(length);
        setWidth(width);
    }

    public void printSquare() {
        System.out.println("The square of rectangle = " + getLength() * getWidth());
    }

    public void printPerimetr() {
        System.out.println("The perimetr of rectangle = " + (getLength() + getWidth()) * 2);
    }
}
