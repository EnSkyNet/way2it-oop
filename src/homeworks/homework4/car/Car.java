package homeworks.homework4.car;

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

    @Override
    public String toString() {
        return "Car{" +
                "\n company='" + company + '\'' +
                ",\n helm=" + helm +
                ",\n wheel=" + wheel +
                ",\n carcase=" + carcase +
                '}';
    }

    public Car(String company, Helm helm, Wheel wheel, Carcase carcase) {
        this.company = company;
        this.helm = helm;
        this.carcase = carcase;
        this.wheel = wheel;
    }

    public void changeCar() {
        System.out.println("Your car is damaged!");
    }
}
