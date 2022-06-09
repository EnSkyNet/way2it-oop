package homeworks.homework15.account;

import java.util.*;

public class AccountService{
    Map<Person, Account> map;

    public void addPerson(Person person, Account account) {
        if (map == null) {
            map = new HashMap<>();
        }
        map.put(person, account);
    }

    public void addAccount(String key, Account account) {
        Person person = findPerson(key);
        map.put(person, account);
    }

    public void removeAccount(String key) {
        Person person = findPerson(key);
        map.put(person, null);
    }

    public void removePerson(String key) {
        Person person = findPerson(key);
        map.remove(person);
    }

    public void showPerson() {
        for (Map.Entry<Person, Account> m : map.entrySet()) {
            System.out.print("Name: " + m.getKey().getName());
            if (m.getValue() != null) {
                System.out.print(", account " + m.getValue().getAccount());
            }
            System.out.println();
        }
    }

    private Person findPerson(String key) {
        Person person;
        for (Map.Entry<Person, Account> m : map.entrySet()) {
            if (m.getKey().getName().equals(key)) {
                return person = m.getKey();
            }
        }
        return null;
    }
}