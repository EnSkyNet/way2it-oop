package homeworks.homework4.car;

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

    @Override
    public String toString() {
        return "Carcase{" +
                "width=" + width +
                ", height=" + height +
                ", length=" + length +
                ", drive='" + drive + '\'' +
                '}';
    }

    public String changeDrive() {
        this.drive = (drive.equals("go")) ? "Stop" : "go";
        System.out.println("Your car is " + getDrive());
        return null;
    }

    public Carcase(double width, double height, double length, String drive) {
        this.height = height;
        this.length = length;
        this.width = width;
        this.drive = drive;
    }
}
