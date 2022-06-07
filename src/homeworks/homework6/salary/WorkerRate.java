package homeworks.homework6.salary;

public class WorkerRate implements Salary {
    private int price;
    private int hour;

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public WorkerRate(int price, int hour) {
        this.hour = hour;
        this.price = price;
    }

    @Override
    public void getSalary() {
        System.out.println("Rate salary from this month: " + getHour() * getPrice());
    }
}
