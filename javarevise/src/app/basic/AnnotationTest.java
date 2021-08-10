package basic;

import java.lang.annotation.Annotation;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ ElementType.TYPE, ElementType.FIELD, ElementType.METHOD })
@Retention(RetentionPolicy.RUNTIME)
@Inherited
@interface Ann {
    int[] value() default { 1, 2, 3 };
    String name() default "Nihao";
}

@Ann(value = { 1, 2, 3, 4 }, name = "hello")
public class AnnotationTest {
    @Ann
    public static void test() {

    }

    public static void main(String[] args) throws NoSuchMethodException, SecurityException {
        Annotation[] a = AnnotationTest.class.getAnnotations();
        System.out.println(AnnotationTest.class.getAnnotation(Ann.class));
        System.out.println(AnnotationTest.class.getMethod("test").getAnnotation(Ann.class).name());
        for (Annotation ann : a) {
            System.out.println(ann.toString());
        }

    }
}
