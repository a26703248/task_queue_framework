package blog.howardli.bean;

import blog.howardli.annotation.TaskExecutor;
import blog.howardli.entity.Task;
import org.springframework.stereotype.Component;

@Component
public class TaskProcessor {

    @TaskExecutor("myTaskProcess")
    public void myTaskProcess(Task task){
        System.out.println("task name: " + task.getTaskName());
    }

}
