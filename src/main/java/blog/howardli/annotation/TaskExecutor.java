package blog.howardli.annotation;


import java.lang.annotation.Retention;
import java.lang.annotation.Target;

@Target({java.lang.annotation.ElementType.METHOD})
@Retention(java.lang.annotation.RetentionPolicy.RUNTIME)
public @interface TaskExecutor {

    String value();

    int order() default 0;

}
