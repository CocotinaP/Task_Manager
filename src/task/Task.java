package task;

import java.util.Objects;

/**
 * Task.
 */
public abstract class Task {
    private String taskId;
    private String description;

    public Task(String taskId, String description) {
        this.taskId = taskId;
        this.description = description;
    }

    public String getTaskId() {
        return taskId;
    }

    public String getDescription() {
        return description;
    }

    void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "task.Task{" +
                "id='" + taskId + '\'' +
                ", descriere='" + description + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Task task = (Task) o;
        return Objects.equals(taskId, task.taskId) && Objects.equals(description, task.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(taskId, description);
    }

    /**
     * Execute task.
     */
    public abstract void execute();
}
