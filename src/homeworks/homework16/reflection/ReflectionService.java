package homeworks.homework16.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectionService {
    public static void getClassNames(Object person) {
        Class<?> personClass = person.getClass();
        System.out.println("*** Class ***");
        System.out.println(personClass);
        System.out.println();
    }

    public static void getConstructors(Object person) {
        Constructor[] cons = person.getClass().getConstructors();
        ReflectionService.printList("Constructors", cons);
    }

    public static void getMethods(Object person) {
        Method[] meths = person.getClass().getDeclaredMethods();
        ReflectionService.printList("Methods", meths);
    }

    public static void getFields(Object person) {
        Field[] fields = person.getClass().getDeclaredFields();
        ReflectionService.printList("Fields", fields);
    }

    public static void setNewPersonsByConstructor() throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        System.out.println("*** Class creation ***");
        Class<?> personClassConstruct = Class.forName("homeworks.homework16.reflection.Person");
        Constructor<?> cons1 = personClassConstruct.getConstructor();
        Constructor<?> cons2 = personClassConstruct.getConstructor(int.class, String.class);

        Person person1 = (Person) cons1.newInstance();
        Person person2 = (Person) cons2.newInstance(25, "Oleg");

        System.out.println(person1);
        System.out.println(person2);
        System.out.println();
    }

    public static void setNewPersonsByMethod() throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, IllegalAccessException, InstantiationException {
        Class<?> personClassConstruct = Class.forName("homeworks.homework16.reflection.Person");
        Constructor<?> cons = personClassConstruct.getConstructor();
        Person person = (Person) cons.newInstance();

        Method setNameMethod = personClassConstruct.getDeclaredMethod("setName", String.class);
        Method getNameMethod = personClassConstruct.getDeclaredMethod("getName", null);

        setNameMethod.setAccessible(true);
        setNameMethod.invoke(person, "Dima");
        System.out.println("*** Method execute***");
        System.out.println(getNameMethod.invoke(person));
        System.out.println(person);
    }

    public static void printList(String s, Object[] o) {
        System.out.println("*** " + s + " ***");
        for (Object obj : o) {
            System.out.println(obj.toString());
        }
        System.out.println();
    }
}
