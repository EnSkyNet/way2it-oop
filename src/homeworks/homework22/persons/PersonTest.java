package homeworks.homework22.persons;

import java.util.*;
import java.util.stream.Collectors;

public class PersonTest {
    public static void main(String[] args) {
        Date date = new Date();
        Person person1 = new Person("Taras", 21);
        Person person2 = new Person("Nazar", 12);
        Person person3 = new Person("Ivan", 18);
        Person person4 = new Person("Stepan", 35);

        List<Person> personList = new ArrayList<>();
        personList.add(person1);
        personList.add(person2);
        personList.add(person3);
        personList.add(person4);
        System.out.println("List of persons: ");
        personList.forEach(person -> System.out.println("Name: " + person.getName() + ", age: " + person.getAge()));
        System.out.println();

        List<Person> adultPerson = new ArrayList<>();
        adultPerson.addAll(personList.stream().filter(person -> person.getAge() >= 18).toList());
        System.out.println("List of adult persons: ");
        adultPerson.forEach(person -> System.out.println("Name: " + person.getName() + ", age: " + person.getAge()));
        System.out.println();

        List nameLength = new ArrayList<>();
        nameLength.addAll(personList.stream().map(person -> person.getName().toString().length()).toList());
        System.out.println("List of length name: ");
        nameLength.forEach(a -> System.out.println(a));
        System.out.println();

        List<Person> setTime = new ArrayList<>();
        setTime.addAll(personList.stream().peek(person -> person.setTimestamp(date.toString())).toList());
        System.out.println("List of person wiht date: ");
        setTime.forEach(person -> System.out.println("Name: " + person.getName() + ", time: " + person.getTimestamp()));
    }
}
