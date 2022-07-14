package homeworks.homework16.reflection;

public class Person {
    private int age;
    private String name;

   public Person() {
    }

    public Person(int age,String name) {
        this.age = age;
        this.name = name;
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
        return "Person{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
