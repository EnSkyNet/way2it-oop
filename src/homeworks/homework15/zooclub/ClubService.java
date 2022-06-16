package homeworks.homework15.zooclub;

import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;

public class ClubService {
    private Map<Person, List<Animal>> mapPerson;

    public void addPerson(Person person) {
        if (mapPerson == null) {
            mapPerson = new HashMap<>();
        }
        List<Animal> animalList = new ArrayList<>();
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

    public void addAnimal(Animal animal) throws Exception {
        if (mapPerson == null || mapPerson.isEmpty()) {
            System.out.println("ZooClub is empty!");
            System.out.println();
        } else {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter the person: ");
            String key = scanner.next();
            mapPerson.get(findPerson(key)).add(animal);
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

    public void removePerson(String key) throws Exception {
        if (mapPerson == null || mapPerson.isEmpty()) {
            System.out.println("ZooClub is empty!");
            System.out.println();
        } else {
            mapPerson.remove(findPerson(key));
        }
    }

    public void removeAnimal(String key, String nickName) throws Exception {
        if (mapPerson == null || mapPerson.isEmpty()) {
            System.out.println("ZooClub is empty!");
            System.out.println();
        } else {
            mapPerson.get(findPerson(key)).removeIf(animal -> animal.getNickname().equals(nickName));
        }
    }


    public void showClub() {
        if (mapPerson == null || mapPerson.isEmpty()) {
            System.out.println("ZooClub is empty!");
            System.out.println();
        } else {
            System.out.println("ZooClub consists of: ");
            /*for (Map.Entry<Person, List<Animal>> m : mapPerson.entrySet()) {
                System.out.print(m.getKey().getName() + ": ");
                if (m.getValue() == null || m.getValue().isEmpty()) {
                    System.out.println(" don`t have animal presently.");
                } else {
                    for (Animal s : m.getValue()) {
                        System.out.print(s.getTypeAnimal() + " " + s.getNickname() + " ");
                    }
                    System.out.println();
                }*/
            mapPerson.entrySet()
                    .stream()
                    .peek(k -> System.out.print(k.getKey().getName() + ": "))
                    .peek(v -> v.getValue()
                            .stream()
                            .forEach(s -> System.out.print(s.getTypeAnimal() + " " + s.getNickname() + " ")))
                    .forEach(t -> System.out.println());
            System.out.println();
        }
    }


    private Person findPerson(String name) throws Exception {
        /*for (Map.Entry<Person, List<Animal>> m : mapPerson.entrySet()) {
            if (m.getKey().getName().equals(key)) {
                return m.getKey();
            }
        }
        return null;*/
        return mapPerson.entrySet()
                .stream()
                .filter(k -> k.getKey().getName().equals(name))
                .findFirst()
                .orElseThrow(() -> new IncorectPersonException("Person " + name + " not found"))
                .getKey();
    }
}
