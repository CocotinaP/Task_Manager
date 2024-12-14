package container;

import task.Task;

import java.util.ArrayList;
import java.util.List;

/**
 * Implement common operations on stack and queue.
 */
public abstract class AbstractSDLiniare implements Container {
    protected List<Task> tasks = new ArrayList<>();

    @Override
    public abstract Task remove();

    @Override
    public void add(Task task) {
        tasks.add(task);
    }

    @Override
    public int size() {
        return tasks.size();
    }

    @Override
    public boolean isEmpty() {
        return tasks.isEmpty();
    }
}
