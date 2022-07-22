package homeworks.homework19.serialized;

import java.io.Serializable;

public class Employee implements Serializable {
    private String name;
    private int id;
    private Salary salary = new Salary();;
    private transient Salary salaryTransient  = new Salary();

    public Employee(String name, int id, int salary1, int salary2) {
        this.name = name;
        this.id = id;
        this.salary.setSalary(salary1);
        this.salaryTransient.setSalary(salary2);
        if (salaryTransient == null) {
            salaryTransient.setSalary(0);}
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        if (this.salaryTransient == null) {
            salaryTransient  = new Salary();
            salaryTransient.setSalary(0);
        }
        return "Employee{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", salary=" + salary.getSalary() +
                ", salaryTransient=" + salaryTransient.getSalary() +
                '}';
    }
}
