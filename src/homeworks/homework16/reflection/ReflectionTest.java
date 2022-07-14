package homeworks.homework16.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectionTest {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Object person = new Person(21, "Jon");
        Class<?> personClass = person.getClass();
        System.out.println("*** Class ***");
        System.out.println(personClass);
        System.out.println();

        Constructor[] cons = personClass.getConstructors();
        printList("Constructors", cons);

        Method[] meths = personClass.getDeclaredMethods();
        printList("Methods", meths);

        Field[] fields = personClass.getDeclaredFields();
        printList("Fields", fields);

        System.out.println("*** Class creation ***");
        Class<?> personClassConstruct = Class.forName("homeworks.homework16.reflection.Person");
        Constructor<?> cons1 = personClassConstruct.getConstructor();
        Constructor<?> cons2 = personClassConstruct.getConstructor(int.class, String.class);

        Person person1 = (Person) cons1.newInstance();
        Person person2 = (Person) cons2.newInstance(25, "Oleg");

        System.out.println(person1);
        System.out.println(person2);
        System.out.println();

        System.out.println("*** Method execute***");
        Method setNameMethod = personClassConstruct.getDeclaredMethod("setName", String.class);
        Method getNameMethod = personClassConstruct.getDeclaredMethod("getName", null);


        setNameMethod.setAccessible(true);
        setNameMethod.invoke(person1, "Dima");
        System.out.println(getNameMethod.invoke(person1));
        System.out.println(person1);    
    }

    static void printList(String s, Object[] o) {
        System.out.println("*** " + s + " ***");
        for (int i = 0; i < o.length; i++) {
            System.out.println(o[i].toString());
        }
        System.out.println();
    }
}