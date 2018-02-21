/**
 * Created by User on 21.02.2018.
 */
public class Main {
    public static void main(String[] args) {
        Task task=new Task();
        task.close();
        task.assignTo("vv");
        task.reopen();
        task.resolve();
        task.close();
    }
}
