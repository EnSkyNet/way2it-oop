package homeworks.homework9.calc;

import java.util.Arrays;

public class CalcTest {
    public static void main(String[] args) throws IllegalAccessException {
        Methods methods = new Methods();
        double tempOne = -10;
        double tempTwo = -10;
        try {
            methods.addition(tempOne, tempTwo);
        } catch (IllegalArgumentException e) {
            System.out.println(e);
        }

        tempOne = 0;
        tempTwo = -10;
        try {
            methods.division(tempOne, tempTwo);
        } catch (ArithmeticException e) {
            System.out.println(e);
        }

        tempOne = -10;
        tempTwo = 0;
        try {
            methods.division(tempOne, tempTwo);
        } catch (ArithmeticException e) {
            System.out.println(e);
        }

        tempOne = 0;
        tempTwo = 0;
        try {
            methods.multiplication(tempOne, tempTwo);
        } catch (IllegalAccessException e) {
            System.out.println(e);
        }

        tempOne = 10;
        tempTwo = 10;
        try {
            methods.multiplication(tempOne, tempTwo);
        } catch (MyExceptions e) {
            System.out.println(e);
        }
    }
}
