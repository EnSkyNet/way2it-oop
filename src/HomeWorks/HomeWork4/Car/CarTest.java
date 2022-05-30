package HomeWorks.HomeWork4.Car;

public class CarTest {
    public static void main(String[] args) {
        Car car = new Car("Star",
                new Helm(16, "summer"),
                new Wheel(14, false),
                new Carcase(1800.0, 1800, 5000, "go"));


        System.out.println(car.toString());
        System.out.println();
        car.changeCar();
        car.getHelm().changeRadius();
        car.getCarcase().changeDrive();
        car.getWheel().changeKlaxonSignal();
    }

}
