package HomeWorks.HomeWork4.Car;

public class Helm {
    private double radius;
    private String season;

    public double getRadius() {
        return radius;
    }

    public String getSeason() {
        return season;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setSeason(String season) {
        this.season = season;
    }

    public String toString() {
        System.out.println("Now season: " + getSeason() + ". Radius of helms: " + getRadius());
        return null;
    }

    public void changeRadius() {
        this.radius = radius - 2;
        System.out.println("New radius is: " + getRadius());
    }

    public Helm(double radius, String season) {
        setRadius(radius);
        setSeason(season);
    }
}
