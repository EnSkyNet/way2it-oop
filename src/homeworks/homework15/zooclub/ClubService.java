package homeworks.homework15.zooclub;

import java.util.*;

public class ClubService {
    private Person person;
    private Animal animal;
    private List<Animal> animalList;
    private Map<Person, List<Animal>> mapPerson;

    public void addPerson() {
        if (mapPerson == null) {
            mapPerson = new HashMap<>();
        }
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter name: ");
        String name = scanner.next();
        System.out.print("Enter age: ");
        int age = scanner.nextInt();
        person = new Person(name, age);
        animalList = new ArrayList<>();
        mapPerson.put(person, animalList);
    }

    public void addAnimal() {
        if (mapPerson == null || mapPerson.isEmpty()) {
            System.out.println("ZooClub is empty!");
            System.out.println();
        } else {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Chose the person: ");
            int choise;
            for (Map.Entry<Person, List<Animal>> m : mapPerson.entrySet()) {
                System.out.print(m.getKey().getName() + ": ");
                System.out.println("This person - yes(1), next person (2)");
                choise = scanner.nextInt();
                if (choise == 1) {
                    System.out.print("Enter nickname: ");
                    String nickname = scanner.next();
                    System.out.print("Enter type: ");
                    String type = scanner.next();
                    animal = new Animal(nickname, type);
                    person = m.getKey();
                    animalList = m.getValue();
                    animalList.add(animal);
                    mapPerson.put(person, animalList);
                    break;
                }
            }
        }
    }

    public void removePerson() {
        if (mapPerson == null || mapPerson.isEmpty()) {
            System.out.println("ZooClub is empty!");
            System.out.println();
        } else {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Chose the person: ");
            int choise;
            for (Map.Entry<Person, List<Animal>> m : mapPerson.entrySet()) {
                System.out.print(m.getKey().getName() + ": ");
                System.out.println("This person - yes(1), next person (2)");
                choise = scanner.nextInt();
                if (choise == 1) {
                    mapPerson.remove(person);
                    break;
                }
            }
        }
    }

    public void removeAnimal() {
        if (mapPerson == null || mapPerson.isEmpty()) {
            System.out.println("ZooClub is empty!");
            System.out.println();
        } else {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Chose the person: ");
            int choise;
            int choise2;
            for (Map.Entry<Person, List<Animal>> m : mapPerson.entrySet()) {
                System.out.print(m.getKey().getName() + ": ");
                System.out.println("This person - yes(1), next person (2)");
                choise = scanner.nextInt();
                if (choise == 1) {
                    person = m.getKey();
                    int index = 0;
                    for (Animal s : m.getValue()) {
                        animalList = m.getValue();
                        System.out.print(s.getTypeAnimal() + " " + s.getNickname() + " ");
                        System.out.println("This animal - yes(1), next animal (2)");
                        choise2 = scanner.nextInt();
                        if (choise2 == 1) {
                            animalList.remove(index);
                            animalList.toString();
                            mapPerson.put(person, animalList);
                            break;
                        }
                        index++;
                    }
                }
            }
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
}
