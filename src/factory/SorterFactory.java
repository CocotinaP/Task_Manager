package factory;

import factory.strategy.SortStrategy;
import sorting.AbstractSorter;
import sorting.BubbleSort;
import sorting.MergeSort;

/**
 * Sorter factory.
 */
public class SorterFactory {
    /**
     * Return a sort type.
     * @param sortStrategy - the strategy of sorting
     * @return the sort type corresponding to the startegy.
     */
    public AbstractSorter getSorter(SortStrategy sortStrategy) {
        return switch (sortStrategy) {
            case MERGESORT -> new MergeSort();
            case BUBBLESORT -> new BubbleSort();
            default -> null;
        };
    }
}
