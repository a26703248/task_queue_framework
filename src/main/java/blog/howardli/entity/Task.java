package blog.howardli.entity;

import java.time.LocalDate;
import java.time.LocalTime;

public class Task {

    private String taskName;

    private String taskDescription;

    private String taskType;

    private String taskStatus;

    private String taskPriority;

    private LocalDate taskDueDate;

    private LocalDate taskCreationDate;

    private LocalDate taskCompletionDate;

    private LocalTime taskCompletionTime;

    private LocalTime taskCreationTime;

    private LocalTime taskDueTime;

    private String taskCategory;

    private String taskLocation;

    public Task() {
    }

    public Task(String taskName, String taskDescription, String taskType,
                String taskStatus, String taskPriority, LocalDate taskDueDate,
                LocalDate taskCreationDate, LocalDate taskCompletionDate,
                LocalTime taskCompletionTime, LocalTime taskCreationTime,
                LocalTime taskDueTime, String taskCategory, String taskLocation) {
        this.taskName = taskName;
        this.taskDescription = taskDescription;
        this.taskType = taskType;
        this.taskStatus = taskStatus;
        this.taskPriority = taskPriority;
        this.taskDueDate = taskDueDate;
        this.taskCreationDate = taskCreationDate;
        this.taskCompletionDate = taskCompletionDate;
        this.taskCompletionTime = taskCompletionTime;
        this.taskCreationTime = taskCreationTime;
        this.taskDueTime = taskDueTime;
        this.taskCategory = taskCategory;
        this.taskLocation = taskLocation;
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public String getTaskDescription() {
        return taskDescription;
    }

    public void setTaskDescription(String taskDescription) {
        this.taskDescription = taskDescription;
    }

    public String getTaskType() {
        return taskType;
    }

    public void setTaskType(String taskType) {
        this.taskType = taskType;
    }

    public String getTaskStatus() {
        return taskStatus;
    }

    public void setTaskStatus(String taskStatus) {
        this.taskStatus = taskStatus;
    }

    public String getTaskPriority() {
        return taskPriority;
    }

    public void setTaskPriority(String taskPriority) {
        this.taskPriority = taskPriority;
    }

    public LocalDate getTaskDueDate() {
        return taskDueDate;
    }

    public void setTaskDueDate(LocalDate taskDueDate) {
        this.taskDueDate = taskDueDate;
    }

    public LocalDate getTaskCreationDate() {
        return taskCreationDate;
    }

    public void setTaskCreationDate(LocalDate taskCreationDate) {
        this.taskCreationDate = taskCreationDate;
    }

    public LocalDate getTaskCompletionDate() {
        return taskCompletionDate;
    }

    public void setTaskCompletionDate(LocalDate taskCompletionDate) {
        this.taskCompletionDate = taskCompletionDate;
    }

    public LocalTime getTaskCompletionTime() {
        return taskCompletionTime;
    }

    public void setTaskCompletionTime(LocalTime taskCompletionTime) {
        this.taskCompletionTime = taskCompletionTime;
    }

    public LocalTime getTaskCreationTime() {
        return taskCreationTime;
    }

    public void setTaskCreationTime(LocalTime taskCreationTime) {
        this.taskCreationTime = taskCreationTime;
    }

    public LocalTime getTaskDueTime() {
        return taskDueTime;
    }

    public void setTaskDueTime(LocalTime taskDueTime) {
        this.taskDueTime = taskDueTime;
    }

    public String getTaskCategory() {
        return taskCategory;
    }

    public void setTaskCategory(String taskCategory) {
        this.taskCategory = taskCategory;
    }

    public String getTaskLocation() {
        return taskLocation;
    }

    public void setTaskLocation(String taskLocation) {
        this.taskLocation = taskLocation;
    }
}
