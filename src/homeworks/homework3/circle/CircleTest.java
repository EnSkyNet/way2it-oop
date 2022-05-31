package homeworks.homework3.circle;

import java.util.Scanner;

public class CircleTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Circle circle = new Circle();
        System.out.print("Enter diameter: ");
        circle.setDiameter(scanner.nextDouble());
        circle.printSquare();
        circle.printLength();
    }
}
