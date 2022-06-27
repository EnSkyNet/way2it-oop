package homeworks.homework21.annotation;

public class Car {
    @Info(creator = "YK", yearOfManufacture = 2023)
    private String carBrand;
    @Info(yearOfManufacture = 2024)
    private int yearOfManufacture;
    private int engineCapacity;
    @Info(color = "Blue", yearOfManufacture = 2025)
    private String color;
    @Info(yearOfManufacture = 2026)
    private String type;

    public Car(String carBrand, int engineCapacity, String type) {
        this.carBrand = carBrand;
        this.engineCapacity = engineCapacity;
        this.type = type;
    }

    public String getCarBrand() {
        return carBrand;
    }

    public void setCarBrand(String carBrand) {
        this.carBrand = carBrand;
    }

    public int getYearOfManufacture() {
        return yearOfManufacture;
    }

    public void setYearOfManufacture(int yearOfManufacture) {
        this.yearOfManufacture = yearOfManufacture;
    }

    public int getEngineCapacity() {
        return engineCapacity;
    }

    public void setEngineCapacity(int engineCapacity) {
        this.engineCapacity = engineCapacity;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Car [carBrand = " + getCarBrand() + ", manufactured: " + getYearOfManufacture()
                + ", engine capacity: " + getEngineCapacity()
        + ", color is " + getColor()
        + ", type - " + getType() + "]";
    }
}
