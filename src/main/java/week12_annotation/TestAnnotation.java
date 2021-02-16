package week12_annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD})
public @interface TestAnnotation{

    int ver();
    String name();
    String[] arr();

    public enum SolarSystem{
        SUN,MERCURY,VENUS,EARTH,MARS,JUPITER,SATURN,URANUS,NEPTUNE
    }
    SolarSystem solarSystem() default SolarSystem.EARTH;

}
