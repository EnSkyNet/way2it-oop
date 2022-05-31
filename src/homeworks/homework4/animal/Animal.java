package homeworks.homework4.animal;

public class Animal {
    private String name;
    private int speed;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void animalSet() {
        setName("Leopard");
        setSpeed(90);
        setAge(15);
    }

    public void animalSet(String name, int speed, int age) {
        this.name = name;
        this.speed = speed;
        this.age = age;
    }

    public void printAnimal() {
        System.out.println("Name = " + getName() + ", Speed = " + getSpeed() + "km/h, Age = " + getAge() + "year old.");
    }
}
