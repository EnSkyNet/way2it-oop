package homeworks.homework9.sum;

public class Number {
    private double number;

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