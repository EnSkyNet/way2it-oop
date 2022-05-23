package HomeWorks.HomeWork4.Car;

public class Car {

    private String driverName;
    private String company;

    private Helm helm;
    private Wheel wheel;
    private Carcase carcase;

    public void Car(Helm helm) {
        this.helm = helm;
    }

    public Helm getHelm() {
        return helm;
    }

    public Carcase getCarcase() {
        return carcase;
    }

    public String getCompany() {
        return company;
    }

    public String getDriverName() {
        return driverName;
    }

    public void setCarcase(Carcase carcase) {
        this.carcase = carcase;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public void setDriverName(String driverName) {
        this.driverName = driverName;
    }

    public void setHelm(Helm helm) {
        this.helm = helm;
    }

    public void setWheel(Wheel wheel) {
        this.wheel = wheel;
    }

    public Wheel getWheel() {
        return wheel;
    }

    public String toString() {
        helm.toString();
        wheel.toString();
        carcase.toString();
        return null;
    }
}
