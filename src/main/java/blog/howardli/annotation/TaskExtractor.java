package blog.howardli.annotation;


import java.lang.annotation.Retention;
import java.lang.annotation.Target;

@Target({java.lang.annotation.ElementType.METHOD})
@Retention(java.lang.annotation.RetentionPolicy.RUNTIME)
public @interface TaskExtractor {

    Class<?> injectObject();

    String taskProcessName();

    int intervals() default 1000;

}
