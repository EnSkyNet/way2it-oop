package homeworks.homework15.account;


import java.util.*;

public class AccountService {

    private Person person;
    private Account account;
    Map<Person, Account> map;

    public void addPerson(Person person, Account account) {
        if (map == null) {
            map = new HashMap<>();
        }
        map.put(person, account);
    }

    public void addAccount(Account account){


    }

    public void removePerson(Person person) {
        map.remove(person);
    }

    public void showPerson() {
        for (Map.Entry<Person, Account> m : map.entrySet()) {
            System.out.println("Name: " + m.getKey() + " account" + m.getValue());
        }
    }

}
