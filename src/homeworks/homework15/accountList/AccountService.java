package homeworks.homework15.accountList;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AccountService {
    private Person person;
    private Account account;
    private List<Account> accountList;
    Map<Person, List<Account>> map;

    public void addPerson(Person person) {
        if (map == null) {
            map = new HashMap<>();
            accountList = new ArrayList<>();
        }
        map.put(person, accountList);
    }

    public void addAccount(String key, Account account) {
        person = findPerson(key);
        accountList.add(account);
        map.put(person, accountList);
    }

    public void removeAccount(String key) {
        person = findPerson(key);
        map.put(person, null);
    }

    public void removePerson(String key) {
        person = findPerson(key);
        map.remove(person);
    }

    public void showPerson() {
        for (Map.Entry<Person, List<Account>> m : map.entrySet()) {
            System.out.print("Name: " + m.getKey().getName());
            if (m.getValue() != null) {
                for(Account a : m.getValue()){
                    System.out.print(", account " + a.getAccount());
                }
            }
            System.out.println();
        }
    }

    private Person findPerson(String key) {
        for (Map.Entry<Person, List<Account>> m : map.entrySet()) {
            if (m.getKey().getName().equals(key)) {
                return person = m.getKey();
            }
        }
        return null;
    }
}