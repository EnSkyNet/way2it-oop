package homeworks.homework15.zooclub;

import java.util.*;

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
        return new Person(name, age);
    }

    public void addAnimal(Animal animal) {
        if (mapPerson == null || mapPerson.isEmpty()) {
            System.out.println("ZooClub is empty!");
        } else {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter the person: ");
            String key = scanner.next();
            if (findPerson(key) != null) {
                mapPerson.get(findPerson(key)).add(animal);
            } else {
                System.out.println(key + " is absent at ZooClub!");
            }
        }
    }

    public Animal newAnimal() {
        System.out.println("Create new animal: ");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter nickname: ");
        String nickname = scanner.next();
        System.out.print("Enter type: ");
        String type = scanner.next();
        return new Animal(nickname, type);
    }

    public void removePerson(String key) {
        if (mapPerson == null || mapPerson.isEmpty()) {
            System.out.println("ZooClub is empty!");
        } else if (findPerson(key) != null) {
            mapPerson.remove(findPerson(key));
        } else {
            System.out.println(key + " is absent at ZooClub!");
        }
    }

    public void removeAnimal(String key, String nickName) {
        if (mapPerson == null || mapPerson.isEmpty()) {
            System.out.println("ZooClub is empty!");
        } else if (findPerson(key) != null) {
            mapPerson.get(findPerson(key)).removeIf(animal -> animal.getNickname().equals(nickName));
        }else {
            System.out.println(key + " is absent at ZooClub!");
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
            mapPerson.forEach((key, value) -> {
                System.out.print(key.getName() + ": ");
                value.forEach(v -> System.out.print(v.getTypeAnimal() + " " + v.getNickname()));
                System.out.println();
            });
        }
    }

    private Person findPerson(String name) {
        /*for (Map.Entry<Person, List<Animal>> m : mapPerson.entrySet()) {
            if (m.getKey().getName().equals(key)) {
                return m.getKey();
            }
        }
        return null;*/
        return mapPerson.entrySet()
                .stream()
                .filter(k -> k.getKey().getName().equals(name))
                .findFirst().map(Map.Entry::getKey).orElse(null);
    }
}