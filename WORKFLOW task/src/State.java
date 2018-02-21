/**
 * Created by User on 21.02.2018.
 */
public interface State {
    default void open(){
                System.out.println("opening is not allowed");
            }
    default void resolve(){
                System.out.println("resolving is not allowed");
            }
    default void reopen(){
                System.out.println("reopening is not allowed");
            }
    default void close(){
               System.out.println("closing is not allowed");
            }
    default void assign(String assignTo){
                System.out.println("assigning is not allowed");
            }
}
