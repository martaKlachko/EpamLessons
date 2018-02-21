/**
 * Created by User on 21.02.2018.
 */
public class Reopened implements State {
    Task task;

    public Reopened(Task task) {
        this.task = task;
    }

    public void resolve() {
        task.setState(new Resolved(task));
        System.out.println(" resolved");
    }

    ;

    public void close() {
        task.setState(new Closed(task));
        System.out.println(" closed");
    }



    public void assign(String assignTo) {
        task.assignTo(assignTo);
        System.out.println("assigned to "+assignTo);
    }
}
