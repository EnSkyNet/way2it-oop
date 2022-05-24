package HomeWorks.HomeWork6.Salary;

public class WorkerFixed implements Salary {
    private int price;
    private int days;

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }

    public WorkerFixed(int price, int days) {
        setDays(days);
        setPrice(price);
    }

    @Override
    public void getSalary() {
        System.out.println("Fixed salary from this month: " + getDays() * getPrice());
    }
}
