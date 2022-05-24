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

    public String getDrive() {
        return drive;
    }

    public void setDrive(String drive) {
        this.drive = drive;
    }

    public String toString() {
        System.out.println("Car size: " + getWidth() + " x " + getLength() + " x " + getHeight());
        return null;
    }

    public String changeDrive() {
        this.drive = (drive == "go") ? "Stop" : "go";
        System.out.println("Your car is " + getDrive());
        return null;
    }

    public Carcase(double width, double height, double length, String drive) {
        setHeight(height);
        setLength(length);
        setWidth(width);
        setDrive(drive);
    }
}
