package homeworks.homework18.user;

import java.util.Comparator;

public class User implements Comparable {
    private String name;
    private int age;

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

    @Override
    public String toString() {
        return name + " " + age + "\n";
    }

    @Override
    public int compareTo(Object o) {
        User user = (User) o;
        if (this.age > user.age) {
            return 1;
        } else if (this.age < user.age) {
            return -1;
        } else {
            return this.name.compareTo(user.name);
        }
    }
}
