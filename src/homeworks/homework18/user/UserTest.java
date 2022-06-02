package homeworks.homework18.user;

import java.util.*;

public class UserTest {
    public static void main(String[] args) {
        //Set<User> userSet = new HashSet<>();
        User userOne = new User("Pavlo", 25);
        User userTwo = new User("Stepan", 15);
        User userThree = new User("Nazar", 20);

        Set<User> userLinked = new LinkedHashSet<>();
        userLinked.add(userOne);
        userLinked.add(userTwo);
        userLinked.add(userThree);
        System.out.println("LinkedHashSet list:");
        for (User u :userLinked){
            System.out.println(u.getName() + " " + u.getAge());
        }

        Set<User> userSet = new HashSet<>();
        userSet.add(userOne);
        userSet.add(userTwo);
        userSet.add(userThree);
        System.out.println();
        System.out.println("HashSet list:");
        for (User u :userSet){
            System.out.println(u.getName() + " " + u.getAge());
        }


        TreeSet userTreeSet = new TreeSet();
        userTreeSet.add(userOne);
        userTreeSet.add(userTwo);
        userTreeSet.add(userThree);
        System.out.println();
        System.out.println("TreeSet list:");
        System.out.println(userTreeSet);
    }
}
