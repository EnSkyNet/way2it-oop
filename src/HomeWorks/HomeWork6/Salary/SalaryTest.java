package HomeWorks.HomeWork6.Salary;

import java.util.ArrayList;

public class SalaryTest {
    public static void main(String[] args) {
        WorkerRate workerRate = new WorkerRate(100, 150);
        WorkerFixed workerFixed = new WorkerFixed(800, 22);
        ArrayList<Salary> salary = new ArrayList<>();
        salary.add(workerRate);
        salary.add(workerFixed);
        for (Salary s : salary) {
            s.getSalary();
        }
    }
}
