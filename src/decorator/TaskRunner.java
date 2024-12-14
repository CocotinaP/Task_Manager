package decorator;

import task.Task;

/**
 * Task runner.
 */
public interface TaskRunner {
    /**
     * Execute one task from the collection of task to execute.
     */
    void executeOneTask();

    /**
     * Exexute all task from the collection of tasks.
     */
    void executeAll();

    /**
     * Add a task in the collection of tasks to execute.
     * @param task - the task to add
     */
    void addTask(Task task);

    /**
     * Check if there are tasks to execute.
     * @return true - if there are still task to be performed.
     *         false - else
     */
    boolean hasTask(); // verifica daca mai sunt task-uri de executat
}
