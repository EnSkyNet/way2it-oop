package homeworks.homework15.zooclub;

import java.util.*;

public class ClubService {
    private List<Animal> animalList;
    private Map<Person, List<Animal>> mapPerson;

    public void addPerson(Person person) {
        if (mapPerson == null) {
            mapPerson = new HashMap<>();
        }
        animalList = new ArrayList<>();
        mapPerson.put(person, animalList);
    }

    public Person newPerson() {
        System.out.println("Create new person: ");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter name: ");
        String name = scanner.next();
        System.out.print("Enter age: ");
        int age = scanner.nextInt();
        Person person = new Person(name, age);
        return person;
    }

    public void addAnimal(Animal animal) {
        if (mapPerson == null || mapPerson.isEmpty()) {
            System.out.println("ZooClub is empty!");
            System.out.println();
        } else {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter the person: ");
            String key = scanner.next();
            Person person = findPerson(key);
            animalList = mapPerson.get(person);
            animalList.add(animal);
            mapPerson.put(person, animalList);
        }
    }

    public Animal newAnimal() {
        System.out.println("Create new animal: ");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter nickname: ");
        String nickname = scanner.next();
        System.out.print("Enter type: ");
        String type = scanner.next();
        Animal animal = new Animal(nickname, type);
        return animal;
    }

    public void removePerson(String key) {
        if (mapPerson == null || mapPerson.isEmpty()) {
            System.out.println("ZooClub is empty!");
            System.out.println();
        } else {
            Person person = findPerson(key);
            mapPerson.remove(person);
        }
    }

    public void removeAnimal(String key, String nickName) {
        if (mapPerson == null || mapPerson.isEmpty()) {
            System.out.println("ZooClub is empty!");
            System.out.println();
        } else {
            Person person = findPerson(key);
            animalList = mapPerson.get(person);
            animalList.removeIf(animal -> animal.getNickname().equals(nickName));
            animalList.toString();
            mapPerson.put(person, animalList);
        }
    }


    public void showClub() {
        if (mapPerson == null || mapPerson.isEmpty()) {
            System.out.println("ZooClub is empty!");
            System.out.println();
        } else {
            System.out.println("ZooClub consists of: ");
            for (Map.Entry<Person, List<Animal>> m : mapPerson.entrySet()) {
                System.out.print(m.getKey().getName() + ": ");
                if (m.getValue() == null || m.getValue().isEmpty()) {
                    System.out.println(" don`t have animal presently.");
                } else {
                    for (Animal s : m.getValue()) {
                        System.out.print(s.getTypeAnimal() + " " + s.getNickname() + " ");
                    }
                    System.out.println();
                }
            }
        }
    }

    private Person findPerson(String key) {
        Person person;
        for (Map.Entry<Person, List<Animal>> m : mapPerson.entrySet()) {
            if (m.getKey().getName().equals(key)) {
                return person = m.getKey();
            }
        }
        return null;
    }
}
