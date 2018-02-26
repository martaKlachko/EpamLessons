import java.util.ArrayList;
import java.util.List;

/**
 * Created by User on 26.02.2018.
 */
public class Comedy implements Movie {
    //for creating comedy movie we need one producer, one Screenwriter and one director
    private  Producer producer;
    private Screenwriter screenwriter;
    private Director director;

    public Comedy() {
    }

    public Comedy(Producer producer, Screenwriter screenwriter, Director director) {
        this.producer = producer;
        this.screenwriter = screenwriter;
        this.director = director;
    }

    public Producer getProducer() {
        return producer;
    }

    public void setProducer(Producer producer) {
        this.producer = producer;
    }

    public Screenwriter getScreenwriter() {
        return screenwriter;
    }

    public void setScreenwriter(Screenwriter screenwriter) {
        this.screenwriter = screenwriter;
    }

    public Director getDirector() {
        return director;
    }

    public void setDirector(Director director) {
        this.director = director;
    }

    @Override
    public List<Employee> findEmployees(List<Employee> allEmployees) {

        List<Employee> employees=new ArrayList<>();
        for (Employee e:allEmployees
                ) {
            if(e.getProfession().equalsIgnoreCase("producer")){
                employees.add(e);
            }
            if(e.getProfession().equalsIgnoreCase("screenwriter")){
                employees.add(e);
            }
            if(e.getProfession().equalsIgnoreCase("director")){
                employees.add(e);
            }

        }
        return employees;
    }
}

