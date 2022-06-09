package homeworks.homework15.accountList;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AccountListService {
    Map<Person, List<Account>> map;

    public void addPerson(Person person) {
        if (map == null) {
            map = new HashMap<>();
        }
        List<Account> accountList = new ArrayList<>();
        map.put(person, accountList);
    }

    public void addAccount(String key, Account account) {
        map.get(findPerson(key)).add(account);
    }

    public void removeAccount(String key, Account account) {
        map.get(findPerson(key)).remove(account);
    }

    public void removePerson(String key) {
        map.remove(findPerson(key));
    }

    public void showPerson() {
        for (Map.Entry<Person, List<Account>> m : map.entrySet()) {
            System.out.print("Name: " + m.getKey().getName());
            if (m.getValue() != null) {
                for (Account a : m.getValue()) {
                    System.out.print(", account " + a.getAccount());
                }
            }
            System.out.println();
        }
    }

    private Person findPerson(String key) {
        for (Map.Entry<Person, List<Account>> m : map.entrySet()) {
            if (m.getKey().getName().equals(key)) {
                return m.getKey();
            }
        }
        return null;
    }
}