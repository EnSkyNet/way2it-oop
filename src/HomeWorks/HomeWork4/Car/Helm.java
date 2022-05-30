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

    @Override
    public String toString() {
        return "Helm{" +
                "radius=" + radius +
                ", season='" + season + '\'' +
                '}';
    }


    public void changeRadius() {
        this.radius = radius - 2;
        System.out.println("New radius is: " + getRadius());
    }

    public Helm(double radius, String season) {
        this.radius = radius;
        this.season = season;
    }
}
