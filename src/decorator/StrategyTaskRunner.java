package decorator;

import container.Container;
import factory.TaskContainerFactory;
import factory.strategy.Strategy;
import task.Task;

/**
 * Task runner with a strategy.
 */
public class StrategyTaskRunner implements TaskRunner {
    private Container container;
    //private static final factory.TaskContainerFactory taskContainerFactory = new factory.TaskContainerFactory();

    public StrategyTaskRunner(Strategy strategy) {
        this.container = TaskContainerFactory.getInstance().createContainer(strategy);
    }

    /**
     * Execute one task accroding to a strategy.
     */
    @Override
    public void executeOneTask() {
        Task task = container.remove();
        task.execute();
    }

    @Override
    public void executeAll() {
        while (hasTask()){
            executeOneTask();
        }
    }

    @Override
    public void addTask(Task task) {
        container.add(task);
    }

    @Override
    public boolean hasTask() {
        return !container.isEmpty();
    }
}
