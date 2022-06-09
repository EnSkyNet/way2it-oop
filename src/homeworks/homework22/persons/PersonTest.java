package homeworks.homework22.persons;

import java.util.ArrayList;
import java.util.List;

public class PersonTest {
    public static void main(String[] args) {
        Person person1 = new Person("Taras", 21);
        Person person2 = new Person("Nazar", 12);
        Person person3 = new Person("Ivan", 18);
        Person person4 = new Person("Stepan", 35);
        List<Person> personList = new ArrayList<>();
        personList.add(person1);
        personList.add(person2);
        personList.add(person3);
        personList.add(person4);



        List<Person> personAdult =new ArrayList<>();






        List<Person> nameLength =new ArrayList<>();



    }

    interface comparisonAdult{
            List adultList(List personList);
    }
}
