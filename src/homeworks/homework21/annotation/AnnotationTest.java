package homeworks.homework21.annotation;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.lang.module.Configuration;
import java.lang.reflect.Field;

public class AnnotationTest {
    public static void main(String[] args) {
        File file = new File("annotationFields.txt");
        try {
            getAnnotationFields(Car.class, file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void getAnnotationFields(Class<?> customClass, File file) throws FileNotFoundException {
        Field[] fields = customClass.getDeclaredFields();
        PrintStream ps = new PrintStream(file);
        for (int i = 0; i < fields.length; i++) {
            Field field = fields[i];
            if (field.getAnnotation(Info.class) instanceof Info) {
                ps.println("field of class with annotation -> [" + field + "] has name -> [" + field.getName() + "]");
                System.out.println("field of class with annotation- > [" + field + "] has name -> [" + field.getName() + "]");
            }
        }
        ps.close();
    }
}
