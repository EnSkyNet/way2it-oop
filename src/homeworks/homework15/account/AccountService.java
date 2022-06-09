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
        map.put(findPerson(key), account);
    }

    public void removeAccount(String key) {
        map.put(findPerson(key), null);
    }

    public void removePerson(String key) {
        map.remove(findPerson(key));
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
        for (Map.Entry<Person, Account> m : map.entrySet()) {
            if (m.getKey().getName().equals(key)) {
                return m.getKey();
            }
        }
        return null;
    }
}