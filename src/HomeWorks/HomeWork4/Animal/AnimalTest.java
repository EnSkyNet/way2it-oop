package HomeWorks.HomeWork4.Animal;

import java.util.Scanner;

public class AnimalTest {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.animalSet();
        animal.printAnimal();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter name, speed, age: ");
        String name = scanner.next();
        int speed = scanner.nextInt();
        int age = scanner.nextInt();
        animal.animalSet(name, speed, age);
        animal.printAnimal();
    }
}
