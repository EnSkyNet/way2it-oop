package homeworks.homework18.bank;

import java.util.*;

public class User {
    private String name;
    private int age;
    Set<Account> accountSet = new HashSet<>();

    public void accountSetAdd(Account account) {
        accountSet.add(account);
    }

    public void getAllAccount() {
        for (Account a : accountSet) {
            System.out.println("account id = " + a.getId());
        }
    }

    public double getSum() {
        double temp = 0;
        for (Account a : accountSet) {
            temp = temp + a.getSum();
        }
        return temp;
    }

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
