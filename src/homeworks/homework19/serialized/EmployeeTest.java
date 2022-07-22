package homeworks.homework19.serialized;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;

public class EmployeeTest {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Employee employee = new Employee("Nazar", 25, 1000, 5000);
        Employee employee1 = new Employee("Stepan", 35, 2000, 6000);
        Employee employee2 = new Employee("Ivan", 40, 3000, 7000);
        Employee employee3 = new Employee("Oleg", 45, 4000, 8000);
        String filename = "list.txt";
        Methods methods = new Methods();
        methods.serialize(employee, filename);
        System.out.println(methods.deserialize(filename).toString());

        Collection<Employee> employees = new ArrayList<>();
        employees.add(employee);
        employees.add(employee1);
        employees.add(employee2);
        employees.add(employee3);
        methods.serialize(employees, filename);
        System.out.println(methods.deserialize(filename).toString());

        Salary salary = new Salary();
        salary.setSalary(2500);
        methods.serialize(salary, filename);
        System.out.println(methods.deserialize(filename).toString());

    }
}