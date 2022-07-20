package homeworks.homework19.serialized;

import java.io.Serializable;

public class Employee implements Serializable {
    private String name;
    private int id;
    private Salary salary;
    private transient int salary2;

    public Employee(String name, int id,int salary1, int salary2) {
        salary = new Salary();
        this.name = name;
        this.id = id;
        this.salary.setSalary(salary1);
        this.salary2 = salary2;
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


    public int getSalary2() {
        return salary2;
    }

    public void setSalary2(int salary2) {
        this.salary2 = salary2;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", salary=" + salary.getSalary() +
                ", salary2=" + salary2 +
                '}';
    }
}
