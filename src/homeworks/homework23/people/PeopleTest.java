package homeworks.homework23.people;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class PeopleTest {
    public static void main(String[] args) {
        List<People> peopleList = Arrays.asList(new People(18, "Ivan", "man"),
                new People(45, "Olga", "woman"),
                new People(12, "John", "man"),
                new People(25, "Vitaliy", "man"),
                new People(35, "Anna", "woman"),
                new People(35, "Olga", "woman"),
                new People(55, "Andriy", "man")
        );

        System.out.println("Conscripts: ");
        peopleList.stream().filter(people -> people.getAge() >= 18 && people.getSex().equals("man")).
                forEach(people -> System.out.println("Name: " + people.getName() + ", age " + people.getAge()));
        System.out.println();

        System.out.println("Average age: " + peopleList.stream().filter(people -> people.getSex().equals("man")).mapToInt(People::getAge).average().getAsDouble());
        System.out.println();

        System.out.println("Able-bodied people: " +
                (int) peopleList.stream().filter(people -> people.getAge() >= 18)
                        .filter(people -> (people.getSex().equals("man") && people.getAge() < 60)
                                || (people.getSex().equals("woman") && people.getAge() < 55))
                        .count());
        System.out.println();

        System.out.println("Sorting in the opposite direction: ");
        peopleList.stream().sorted(Comparator.comparing(People::getName).reversed()).toList().
                forEach(people -> System.out.println("Name: " + people.getName()));
        System.out.println();

        System.out.println("Sorting by name and by age: ");
        peopleList.stream().sorted(Comparator.comparing(People::getName).thenComparing(People::getAge)).toList().
                forEach(people -> System.out.println("Name: " + people.getName() + ", age " + people.getAge()));
        System.out.println();

        System.out.println("The older people is: " + peopleList.stream().max(Comparator.comparing(People::getAge)).get().getName());
        System.out.println();

        System.out.println("The youngest people is: " + peopleList.stream().min(Comparator.comparing(People::getAge)).get().getName());
        System.out.println();

        System.out.println("The quality of man: " + peopleList.stream().filter(people -> people.getSex().equals("man")).count());
        System.out.println();

        System.out.println("The quality of woman: " + peopleList.stream().filter(people -> people.getSex().equals("woman")).count());
        System.out.println();

        System.out.println("The woman with first char in name A: ");
        peopleList.stream().filter(people -> (people.getSex().equals("woman")) && people.getName().contains("A"))
                .toList().forEach(people -> System.out.println("Name: " + people.getName()));
        System.out.println();

    }
}