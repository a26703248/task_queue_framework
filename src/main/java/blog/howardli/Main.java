package blog.howardli;


import blog.howardli.annotation.TaskExtractor;
import blog.howardli.bean.TaskBean;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;


@ComponentScan
@EnableAspectJAutoProxy
public class Main {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Main.class);
        context.getBean(TaskBean.class).getTask();
    }

}
