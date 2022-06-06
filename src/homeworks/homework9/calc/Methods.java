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

    public double addition(double one, double two) throws IllegalAccessException {

        double result = 0;
        if (comparison(one, two)) {
            result = one + two;
        }
        return result;
    }

    public double multiplication(double one, double two) throws IllegalAccessException {
        double result = 0;
        if (comparison(one, two)) {
            result = one * two;
        }
        return result;
    }

    public double division(double one, double two) throws IllegalAccessException {
        double result = 0;
        if (comparison(one, two)) {
            result = one / two;
        }
        return result;
    }

    public double subtraction(double one, double two) throws IllegalAccessException {
        double result = 0;
        if (comparison(one, two)) {
            result = one - two;
        }
        return result;
    }

}
