package homeworks.homework21.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)

public @interface Info {
    String creator() default "Kulibin CB";

    String color() default "red";

    int yearOfManufacture();
}