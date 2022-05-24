package HomeWorks.HomeWork6.Salary;

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
        setHour(hour);
        setPrice(price);
    }

    @Override
    public void getSalary() {
        System.out.println("Rate salary from this month: " + getHour() * getPrice());
    }
}
