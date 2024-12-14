package container;

import task.Task;

/**
 * Task container.
 */
public interface Container {
    /**
     * Remove a task.
     * @return the removed task
     */
    Task remove();

    /**
     * Add a new task.
     * @param task to add
     */
    void add(Task task);

    /**
     *
     * @return number of task
     */
    int size();

    /**
     * Check if the container is empty.
     * @return true - if the container is empy
     *         false - else
     */
    boolean isEmpty();
}
