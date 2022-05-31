package homeworks.homework3.circle;

public class Circle {
    private double radius;
    private double diameter;

    public double getDiameter() {
        return diameter;
    }

    public double getRadius() {
        return radius;
    }

    public void setDiameter(double diameter) {
        this.diameter = diameter;
        setRadius();
    }

    private void setRadius() {
        this.radius = diameter / 2;
    }

    public void printSquare() {
        System.out.println("The square of circle = " + 3.14 * (diameter / 2) * (diameter / 2));
    }

    public void printLength() {
        System.out.println("The length of circle = " + 3.14 * radius * 2);
    }
}