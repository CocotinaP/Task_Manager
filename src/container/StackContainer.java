package container;

import task.Task;

public class StackContainer extends AbstractSDLiniare {

    @Override
    public Task remove() {
       if (tasks.isEmpty()) {
           return null;
       }
       return tasks.remove(tasks.size() - 1);
    }
}
