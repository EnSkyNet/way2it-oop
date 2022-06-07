package homeworks.homework3.rectangle;

import java.util.Scanner;

public class RectangleTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Rectangle rectangle1 = new Rectangle();
        rectangle1.Rectangle();
        rectangle1.printPerimeter();
        rectangle1.printSquare();

        Rectangle rectangle2 = new Rectangle();
        System.out.print("Enter length: ");
        int length = scanner.nextInt();
        System.out.print("Enter width: ");
        int width = scanner.nextInt();
        rectangle2.Rectangle(length, width);
        rectangle2.printSquare();
        rectangle2.printPerimeter();
    }
}
