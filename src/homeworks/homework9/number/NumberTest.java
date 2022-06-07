package homeworks.homework9.number;

import java.util.Scanner;

public class NumberTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number: ");
        double temp = scanner.nextDouble();
        Number number = new Number();
        try {
            number.setNumber(temp);
            number.numberComparison();
        } catch (IncorrectNumberException er) {
            System.out.println(er);
        }
    }
}

