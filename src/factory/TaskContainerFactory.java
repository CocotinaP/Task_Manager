package factory;

import container.Container;
import container.QueueContainer;
import container.StackContainer;
import factory.strategy.Strategy;

public class TaskContainerFactory implements Factory {
    private static TaskContainerFactory instance;

    private TaskContainerFactory(){};

    @Override
    public Container createContainer(Strategy strategy) {
        return switch (strategy) {
            case FIFO -> new StackContainer();
            case LIFO -> new QueueContainer();
            default -> null;
        };
    }

    public static TaskContainerFactory getInstance(){
        if(instance == null){
            instance = new TaskContainerFactory();
        }
        return instance;
    }
}
