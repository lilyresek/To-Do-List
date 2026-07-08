import components.sequence.Sequence;
import components.sequence.Sequence1L;
import components.simplereader.SimpleReader;
import components.simplereader.SimpleReader1L;
import components.simplewriter.SimpleWriter;
import components.simplewriter.SimpleWriter1L;

/**
 * This program runs the to-do list application that the user interacts with while also making calls to the Task class to assist throughout.
 *
 * @author Lily Resek
 *
 */
public final class ToDoApp {

    /**
     * No argument constructor--private to prevent instantiation.
     */
    private ToDoApp() {
    }

    /**
     * Main method that prompts the user with choices for their to do list.
     *
     * @param args
     *            the command line arguments
     */
    public static void main(String[] args) {
        SimpleReader in = new SimpleReader1L();
        SimpleWriter out = new SimpleWriter1L();
        /*
         * Put your main program code here; it may call myMethod as shown
         */
        out.println(
                "1. Add a task\n2. View List\n3. Complete Task\n4. Delete Task\n5. Quit");
        out.println("What would you like to do?");
        int response = in.nextInteger();
        Sequence<Task> listTasks = new Sequence1L<>();
        while (response != 5) {
            if (response == 1) {
                out.println("Enter your task: ");
                String taskName = in.nextLine();
                Task task = new Task(taskName);
                listTasks.add(listTasks.length(), task);
                out.print("Added!");
            } else if (response == 2) {
                out.println("\n===== To Do List ======");
                for (int i = 0; i < listTasks.length(); i++) {
                    Task list = listTasks.entry(i);
                    out.println(list);
                }
            } else if (response == 3) {
                out.println("What task would you like to complete?");
                String complete = in.nextLine();
                for (int i = 0; i < listTasks.length(); i++) {
                    Task item = listTasks.entry(i);
                    if (complete.equals(item.getTaskName())) {
                        item.setComplete(true);
                        out.println("Marked as completed!");
                    }
                }
            } else if (response == 4) {
                out.println("What task would you like to remove?");
                String remove = in.nextLine();
                for (int i = 0; i < listTasks.length(); i++) {
                    Task item = listTasks.entry(i);
                    if (remove.equals(item.getTaskName())) {
                        listTasks.remove(i);
                        i--;
                    } else {
                        out.println("Task has been removed!");
                    }
                }
            } else {
                out.println("That is an invalid choice, please enter another number.");
            }

            out.println(
                    "\n1. Add a task\n2. View List\n3. Complete Task\n4. Delete Task\n5. Quit");
            response = in.nextInteger();
        }
        /*
         * Close input and output streams
         */
        in.close();
        out.close();
    }

}
