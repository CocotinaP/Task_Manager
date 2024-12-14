package task;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * A task that shows a message.
 */
public class MessageTask extends Task {
    private String message;
    private String from;
    private String to;
    private LocalDateTime date;
    private static final DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");

    public MessageTask(String taskId, String description, String message, String from, String to, LocalDateTime date) {
        super(taskId, description);
        this.message = message;
        this.from = from;
        this.to = to;
        this.date = date;
    }

    public void execute() {
        System.out.println("Message= " + message + "| Date:=" + dateFormat.format(date));
    }

    @Override
    public String toString() {
        return "id=" + super.getTaskId() + "|description=" + super.getDescription() + "|message=" + message + "|from=" + from + "|to=" + to + "|date=" + dateFormat.format(date);
    }
}
