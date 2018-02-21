import java.util.Stack;

/**
 * Created by User on 21.02.2018.
 */
public class Task {
    private String assignedTo;
    private State state;

    public Task() {
        this.assignedTo = "";
        this.state = new Opened(this);
    }

    public String getAssignedTo() {
        return assignedTo;
    }

    public void assignTo(String assignedTo) {
        this.assignedTo=assignedTo;
        System.out.println("assignedTo "+assignedTo);}

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "Task{" +
                "assignedTo='" + assignedTo + '\'' +
                ", state=" + state +
                '}';
    }

    public void close() {
        state.close();
    }

    public void open() {
        state.open();
    }

    public void resolve() {
        state.resolve();
    }

    public void reopen() {
        state.reopen();
    }




}
