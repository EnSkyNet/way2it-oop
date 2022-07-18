package homeworks.homework16.reflection;

public class Person {
    private int age;
    private String name;

    private static int count = 0;

    public Person() {
        count++;
    }

    public Person(int age, String name) {
        this.age = age;
        this.name = name;
        count++;
    }

    public int getAge() {
        return age;
    }


    private void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    private void setName(String name) {
        this.name = name;
    }


    @Override
    public String toString() {
        return "Person" + count + " {" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
