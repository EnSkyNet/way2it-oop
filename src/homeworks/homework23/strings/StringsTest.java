package homeworks.homework23.strings;

import homeworks.homework23.people.People;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StringsTest {
    public static void main(String[] args) {
        List<String> stringList = Arrays.asList("One", "Two", "Three", "Four", "Five", "One");

        System.out.println("One meet: " + stringList.stream().filter(s->s.equals("One")).count());
        System.out.println("First element of list: " + stringList.stream().findFirst().orElse("0"));
        System.out.println("Last element of list: " + stringList.stream().reduce((e1, e2)->e2).orElse("empty"));
        System.out.println("Find Three in list: " + stringList.stream().filter("Three"::equals).findFirst().get());
        System.out.println("The third element of list: " + stringList.stream().skip(2).findFirst().get());
        System.out.println("The second and third elements of list: " + stringList.stream().skip(1).limit(2).toList());
        System.out.println("List with size of words more then 3: " + stringList.stream().filter(s->s.length()>3).toList());
        System.out.println("List without doubles: " + stringList.stream().distinct().toList());
        System.out.println("Find One in list: " + stringList.stream().anyMatch("One"::equals));
        System.out.println("Char o in all elements of list: " + stringList.stream().allMatch("o"::equals));
        System.out.println("Add _1 for elements of list: " + stringList.stream().map(s -> s+"_1").toList());
        System.out.println("Sorted list without doubles: " + stringList.stream().distinct().sorted().collect(Collectors.toList()));
    }
}
