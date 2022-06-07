package homeworks.homework9.sum;

import java.util.Arrays;
import java.util.Scanner;

public class SumTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        double tempOne = scanner.nextDouble();
        System.out.print("Enter second number: ");
        double tempTwo = scanner.nextDouble();
        System.out.println();
        Number numberOne = new Number();
        Number numberTwo = new Number();
        try {
            numberOne.setNumber(tempOne);
            numberTwo.setNumber(tempTwo);
            System.out.println(tempOne + " + " + tempTwo + " = " + (tempOne + tempTwo));
        } catch (IncorrectNumberException er) {
            er.printStackTrace();;
        }
    }
}
