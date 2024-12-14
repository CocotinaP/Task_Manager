package task;

import factory.SorterFactory;
import factory.strategy.SortStrategy;

import java.util.Arrays;

/**
 * A task that sorts a list of numbers.
 */
public class SortingTask extends Task {
    private Integer[] numbers;
    private static final SorterFactory sorterFactory = new SorterFactory();
    private SortStrategy sortStrategy = null;

    public SortingTask(String taskId, String description, Integer[] numbers, SortStrategy sortStrategy) {
        super(taskId, description);
        this.numbers = numbers;
        this.sortStrategy = sortStrategy;
    }

    @Override
    public void execute() {
        sorterFactory.getSorter(sortStrategy).sort(numbers);
        System.out.println("Vectorul sortat: " + Arrays.toString(numbers));
    }

    @Override
    public String toString() {
        return "task.SortingTask: id=" + super.getTaskId() + "|descriere=" + super.getDescription() + "|numere=" + Arrays.toString(numbers);
    }
}
