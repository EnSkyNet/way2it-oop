package HomeWorks.HomeWork4.Car;

public class CarTest {
    public static void main(String[] args) {
        Car car = new Car();
        Carcase carcase = new Carcase();
        carcase.setHeight(180);
        //carcase.toString();

        car.setCarcase(carcase);
        car.toString();

    }

}
