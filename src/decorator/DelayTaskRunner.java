package decorator;

/**
 * Task runner with delay.
 */
public class DelayTaskRunner extends AbstractTaskRunner {
    public DelayTaskRunner(TaskRunner taskRunner) {
        super(taskRunner);
    }

    /**
     * Execute one task with delay.
     */
    @Override
    public void executeOneTask(){
        try{
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        super.executeOneTask();
    }
}
