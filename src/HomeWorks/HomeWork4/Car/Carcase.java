package HomeWorks.HomeWork4.Car;

public class Carcase {
    private double width;
    private double height;
    private double length;
    private String drive;

    public double getHeight() {
        return height;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public String toString() {
        System.out.println("Car size: " + getWidth() + "x" + getLength() + "x" + getHeight());
        return null;
    }

    public String changeDrive() {
        this.drive = (drive == "go") ? "Stop" : "go";
        return null;
    }
}
