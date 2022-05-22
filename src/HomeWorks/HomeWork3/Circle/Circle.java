package HomeWorks.HomeWork3.Circle;

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
    }

    public void setDiameter(int diameter) {
        this.diameter = (double) diameter;
    }

    public void setRadius() {
        this.radius = diameter / 2;
    }

    public void Square(double diameter) {
        System.out.println("The square of circle = " + 3.14 * (diameter / 2) * (diameter / 2));
    }

    public void Length(double radius) {
        System.out.println("The length of circle = " + 3.14 * radius * 2);
    }

}