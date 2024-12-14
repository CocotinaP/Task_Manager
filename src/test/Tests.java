package test;

import decorator.DelayTaskRunner;
import decorator.PrinterTaskRunner;
import decorator.StrategyTaskRunner;
import decorator.TaskRunner;
import factory.strategy.Strategy;
import task.MessageTask;
import task.Task;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 * Tests.
 */
public class Tests {
    private Task task1 = new MessageTask("1", "Tema mate", "Termina tema la mate", "mama", "me", LocalDateTime.now());
    private Task task2 = new MessageTask("2", "Curatenie", "Fa curetenie in camera", "mama", "me", LocalDateTime.now());
    private Task task3 = new MessageTask("3", "Proiect fizica", "Materia si antimateria", "profesor", "me", LocalDateTime.now());
    private Task task4 = new MessageTask("4", "Plimbare", "Plimbare in parc", "Ina", "me", LocalDateTime.now());
    private Task task5 = new MessageTask("5", "Somn", "Ora de culcare: 10:30", "me", "me", LocalDateTime.now());
    private static Tests tests;

    private Tests(){};

    /**
     * Write a test program that creates a vector (array)
     * of 5 tasks of type MessageTask and displays them on the screen with a certain format.
     */
    public void testEx4(){
        System.out.println("\nTesting Ex4 started...\n");
        List<Task> tasks = new ArrayList<Task>();
        tasks.add(task1);
        tasks.add(task2);
        tasks.add(task3);
        tasks.add(task4);
        tasks.add(task5);
        for (Task task : tasks) {
            System.out.println(task);
        }
        System.out.println("\nTesting Ex4 finished...");
    }

    /**
     * Write a test program that creates a vector of tasks of type MessageTask and executes them,
     * via an object of type StrategyTaskRunner, using the strategy specified as a parameter in the command line.
     * @param strategy the startegy.
     */
    public void testEx10(String strategy){
        System.out.println("\nTesting Ex10 started...\n");
        TaskRunner taskRunner = new StrategyTaskRunner(Strategy.valueOf(strategy));
        taskRunner.addTask(task1);
        taskRunner.addTask(task2);
        taskRunner.addTask(task3);
        taskRunner.addTask(task4);
        taskRunner.addTask(task5);
        taskRunner.executeAll();
        System.out.println("\nTesting Ex10 finished...");
    }

    /**
     * Write a test program that creates a vector of tasks of type MessageTask and executes them,
     * initially via an object of type StrategyTaskRunner then via an object of type
     * PrinterTaskRunner (decorator), using the strategy specified as a parameter on the command line.
     * @param strategy
     */
    public void testEx13(String strategy){
        System.out.println("\nTesting Ex13 started...\n");
        TaskRunner taskRunner = new PrinterTaskRunner(new StrategyTaskRunner(Strategy.valueOf(strategy)));
        taskRunner.addTask(task1);
        taskRunner.addTask(task2);
        taskRunner.addTask(task3);
        taskRunner.addTask(task4);
        taskRunner.addTask(task5);
        taskRunner.executeAll();
        System.out.println("\nTesting Ex13 finished...");
    }

    /**
     * Write a test program that creates a vector of tasks of type MessageTask and executes them,
     * initially via an object of type StrategyTaskRunner then via an object of type
     * DelayTaskRunner (decorator) then via an object of type PrinterTaskRunner (decorator),
     * using the strategy specified as a parameter on the command line.
     */
    public void testEx14(String strategy){
        System.out.println("\nTesting Ex14 started...\n");
        TaskRunner taskRunner = new PrinterTaskRunner(new DelayTaskRunner(new StrategyTaskRunner(Strategy.valueOf(strategy))));
        taskRunner.addTask(task1);
        taskRunner.addTask(task2);
        taskRunner.addTask(task3);
        taskRunner.addTask(task4);
        taskRunner.addTask(task5);
        taskRunner.executeAll();
        System.out.println("\nTesting Ex14 finished...");
    }

    /**
     *
     * @return the instance for Tests class.
     */
    public static Tests getInstance(){
        if (tests == null) {
            tests = new Tests();
        }
        return tests;
    }
}
