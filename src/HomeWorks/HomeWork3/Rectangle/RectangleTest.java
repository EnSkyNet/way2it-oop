package HomeWorks.HomeWork3.Rectangle;

import java.util.Scanner;

public class RectangleTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Rectangle rectangle1 = new Rectangle();
        rectangle1.Rectangle();
        rectangle1.printPerimetr();
        rectangle1.printSquare();

        Rectangle rectangle2 = new Rectangle();
        System.out.print("Enter length: ");
        int length = scanner.nextInt();
        System.out.print("Enter width: ");
        int width = scanner.nextInt();
        rectangle2.Rectangle(length, width);
        rectangle2.printSquare();
        rectangle2.printPerimetr();
    }
}
