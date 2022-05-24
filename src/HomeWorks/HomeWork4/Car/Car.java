package HomeWorks.HomeWork4.Car;

public class Car {

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

    public void setCarcase(Carcase carcase) {
        this.carcase = carcase;
    }

    public void setCompany(String company) {
        this.company = company;
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
        System.out.println("Your company: " + getCompany());
        helm.toString();
        wheel.toString();
        carcase.toString();
        return null;
    }

    public Car(String company,Helm helm, Wheel wheel, Carcase carcase) {
        setCompany(company);
        setHelm(helm);
        setCarcase(carcase);
        setWheel(wheel);
    }
    public void changeCar(){
        System.out.println("Your car is damaged!");
    };

}
