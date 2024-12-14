package factory;

import container.Container;
import factory.strategy.Strategy;

/**
 * Factory.
 */
public interface Factory {
    /**
     * Create a new container.
     * @param strategy the strategy of conatiner.
     * @return the container corresponding to the strategy
     */
    Container createContainer(Strategy strategy);
}
