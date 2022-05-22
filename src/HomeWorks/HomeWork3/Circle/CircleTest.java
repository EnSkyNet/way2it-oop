package HomeWorks.HomeWork3.Circle;

import java.util.Scanner;

public class CircleTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Circle circle = new Circle();
        System.out.print("Enter diameter: ");
        circle.setDiameter(scanner.nextDouble());
        circle.setRadius();
        circle.Square(circle.getDiameter());
        circle.Length(circle.getRadius());
    }
}
