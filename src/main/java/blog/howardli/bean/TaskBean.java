package blog.howardli.bean;

import blog.howardli.annotation.TaskExecutor;
import blog.howardli.annotation.TaskExtractor;
import blog.howardli.entity.Task;
import org.springframework.stereotype.Component;


@Component
public class TaskBean {


    @TaskExtractor(injectObject = Task.class,
            taskProcessName = "myTaskProcess")
    public Task getTask(){
        System.out.println("get task");
        Task task = new Task();
        task.setTaskName("myTask");
        return task;
    }
}
