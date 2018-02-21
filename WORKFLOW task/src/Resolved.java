/**
 * Created by User on 21.02.2018.
 */
public class Resolved implements State {
    Task task;

    public Resolved(Task task) {
        this.task = task;
    }

    public void close() {
        task.setState(new Closed(task));
        System.out.println("closed");
    }
   public void reopen(){
                task.setState(new Reopened(task));
                System.out.println(" reopened");
           }


    public void assign(String assignTo) {
        task.assignTo(assignTo);
        System.out.println("assigned to "+assignTo);
    }
}
