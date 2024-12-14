package decorator;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * Task runner with printer.
 */
public class PrinterTaskRunner extends AbstractTaskRunner {
    private static final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm");

    public PrinterTaskRunner(TaskRunner taskRunner) {
        super(taskRunner);
    }

    /**
     * Execute one task.
     */
    @Override
    public void executeOneTask(){
        super.executeOneTask();
        System.out.println("task.Task executed at: " + LocalDateTime.now().format(formatter));
    }
}
