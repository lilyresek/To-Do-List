/**
 * The Task class that is used by ToDoApp with getter and setter methods to
 * assist the program.
 *
 * @author Lily Resek
 *
 */
public final class Task {

    /**
     * Open String field.
     */
    private String name;

    /**
     * Open boolean field.
     */
    private boolean complete;

    /**
     * Constructor method.
     *
     * @param name
     *            The name of the task passed in.
     */
    public Task(String name) {
        this.name = name;
        this.complete = false;
    }

    /**
     * Gets the name of the task being sent in.
     *
     * @return The name of the task.
     */
    public String getTaskName() {
        return this.name;
    }

    /**
     * Reports whether the task has been completed.
     *
     * @return true if the task has been completed, false if not.
     */
    public boolean isComplete() {
        return this.complete;
    }

    /**
     * Setter method to adjust whether a task is done.
     *
     * @param complete
     *            The boolean value of whether the task is done.
     */
    public void setComplete(boolean complete) {
        this.complete = complete;
    }

    /**
     * Alters the task list depending on whether the task has been completed.
     *
     * @return The updated line for a completed task.
     */
    @Override
    public String toString() {
        String taskBar = "[ ] " + this.name;
        if (this.complete) {
            taskBar = "[X] " + this.name;
        }
        return taskBar;
    }

}
