/**
 * Created by User on 21.02.2018.
 */
public class Closed implements State {
    Task task;

    public Closed(Task task) {
        this.task = task;
    }

    public void reopen(){
                task.setState(new Reopened(task));
                System.out.println("reopened");
            }
    public void assign(String assignTo) {
        task.assignTo(assignTo);
        System.out.println("assigned to "+assignTo);
    }
}
