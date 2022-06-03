package homeworks.homework18.bank;

import java.util.*;

public class UserServiceImpl<T> implements UserService<Account<T>, User> {

    HashSet<User> userSet = new HashSet<>();


    public void userSetAdd(User user) {
        userSet.add(user);
    }

    @Override
    public void printAllAccount() {
        for (User u : userSet) {
            System.out.println("Name = " + u.getName());
            u.getAllAccount();
        }
    }

    @Override
    public void printAllUser() {
        TreeSet<User> myTreeSet = new TreeSet<User>(userSet);
        System.out.println(myTreeSet);
        /*for (Object u : temp) {
            System.out.println("Name = " + u.getName() + ", age: " + u.getAge());
        }*/
    }

    @Override
    public void printTax() {
        for (User u : userSet) {
            System.out.print("Name = " + u.getName());
            System.out.println(" tax 5%: " + (int) (u.getSum() * 0.05));
        }
    }
}
