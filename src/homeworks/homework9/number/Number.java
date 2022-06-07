package homeworks.homework9.number;

public class Number {
    private double number;

    public void numberComparison() {
        if (number % 2 == 0) {
            System.out.println("You enter even number = " + number);
        } else {
            System.out.println("You enter odd number = " + number);
        }
    }

    public double getNumber() {
        return number;
    }

    public void setNumber(double number) throws IncorrectNumberException {
        if (number % 1 == 0) {
            this.number = number;
        } else {
            throw new IncorrectNumberException();
        }
    }
}

