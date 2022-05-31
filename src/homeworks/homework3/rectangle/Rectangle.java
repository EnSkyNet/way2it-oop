
package homeworks.homework3.rectangle;

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
        this.length = length;
        this.width = width;
    }

    public void printSquare() {
        System.out.println("The square of rectangle = " + length * width);
    }

    public void printPerimeter() {
        System.out.println("The perimeter of rectangle = " + (length + width) * 2);
    }
}
