package homeworks.homework16.reflection;

import java.lang.reflect.InvocationTargetException;

public class ReflectionTest {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Object person = new Person(21, "Jon");
        ReflectionService.getClassNames(person);
        ReflectionService.getConstructors(person);
        ReflectionService.getMethods(person);
        ReflectionService.getFields(person);
        ReflectionService.setNewPersonsByConstructor();
        ReflectionService.setNewPersonsByMethod();
    }
}