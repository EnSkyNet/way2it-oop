package homeworks.homework15.zooclub;

import java.util.*;

public class ZooClubTest {
    public static void main(String[] args) {
        Person person1 = new Person("Vasil", 45);
        Person person2 = new Person("Petro", 50);
        Animal animal11 = new Animal("Tosya", "cat");
        Animal animal12 = new Animal("Kesha", "parrot");
        Animal animal21 = new Animal("Maxi", "dog");
        Animal animal22 = new Animal("Gohsa", "parrot");
        List<Animal> animalList1 = new ArrayList<>();

        animalList1.add(animal11);
        animalList1.add(animal12);
        List<Animal> animalList2 = new ArrayList<>();
        animalList2.add(animal21);
        animalList2.add(animal22);
        Map<Person, List<Animal>> mapPerson = new HashMap<>();
        mapPerson.put(person1, animalList1);
        mapPerson.put(person2, animalList2);
        for(Map.Entry<Person,List<Animal>> m: mapPerson.entrySet()){
            System.out.print(m.getKey().getName() + ": ");
            for(Animal s: m.getValue()){
                System.out.print(s.getTypeAnimal() + " " + s.getNickname() + " ");
            }
            System.out.println();
        }
    }
}
