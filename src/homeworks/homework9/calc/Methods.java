package homeworks.homework9.calc;

public class Methods {

    private boolean comparison(double one, double two) throws IllegalAccessException {
        if (one < 0 && two < 0) {
            throw new IllegalArgumentException("You enter two numbers less zer!");
        } else if ((one == 0 && two != 0) || (one != 0 && two == 0)) {
            throw new ArithmeticException("You enter one number by zero!");
        } else if (one == 0 && two == 0) {
            throw new IllegalAccessException("You enter two numbers by zero!");
        } else if (one > 0 && two > 0) {
            throw new MyExceptions("You enter invalid numbers!");
        } else {
            return true;
        }
    }

    public void addition(double one, double two) throws IllegalAccessException {

        if (comparison(one, two)) {
            System.out.println(one + " + " + two + " = " + (one + two));
        }
    }

    public void multiplication(double one, double two) throws IllegalAccessException {
        if (comparison(one, two)) {
            System.out.println(one + " * " + two + " = " + (one * two));
        }
    }

    public void division(double one, double two) throws IllegalAccessException {
        if (comparison(one, two)) {
            System.out.println(one + " / " + two + " = " + (one / two));
        }
    }

    public void subtraction(double one, double two) throws IllegalAccessException {
        if (comparison(one, two)) {
            System.out.println(one + " - " + two + " = " + (one - two));
        }
    }
}
