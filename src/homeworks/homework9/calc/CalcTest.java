package homeworks.homework9.calc;

import java.util.Arrays;

public class CalcTest {
    public static void main(String[] args) throws IllegalAccessException {
        Methods methods = new Methods();
        double tempOne = -10;
        double tempTwo = -10;
        try {
            System.out.println(tempOne + " * " + tempTwo + " = " + methods.addition(tempOne, tempTwo));
        } catch (IllegalArgumentException e) {
            System.out.println(e);
        }

        tempOne = 0;
        tempTwo = -10;
        try {
            methods.division(tempOne, tempTwo);
            System.out.println(tempOne + " * " + tempTwo + " = ");
        } catch (ArithmeticException e) {
            System.out.println(e);
        }

        tempOne = -10;
        tempTwo = 0;
        try {
            System.out.println(tempOne + " * " + tempTwo + " = " + methods.division(tempOne, tempTwo));
        } catch (ArithmeticException e) {
            System.out.println(e);
        }

        tempOne = 0;
        tempTwo = 0;
        try {
            System.out.println(tempOne + " * " + tempTwo + " = " + methods.multiplication(tempOne, tempTwo));
        } catch (IllegalAccessException e) {
            System.out.println(e);
        }

        tempOne = 10;
        tempTwo = 10;
        try {
            System.out.println(tempOne + " * " + tempTwo + " = " + methods.subtraction(tempOne, tempTwo));
        } catch (MyExceptions e) {
            e.printStackTrace();
        }
    }
}
