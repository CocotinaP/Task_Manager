package container;

import task.Task;

public class QueueContainer extends AbstractSDLiniare {
    @Override
    public Task remove() {
        if (tasks.isEmpty()){
            return null;
        }
        return tasks.remove(0);
    }
}
