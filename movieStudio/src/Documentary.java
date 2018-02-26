import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by User on 26.02.2018.
 */

public class Documentary implements Movie{
    //for creating documentary movie we need one producer and a lot of journalists
   private  Producer producer;
    private List<Journalist> journalists;

    public Documentary(Producer producer, List<Journalist> journalists) {
        this.producer = producer;
        this.journalists = journalists;
    }

    public Producer getProducer() {
        return producer;
    }

    public void setProducer(Producer producer) {
        this.producer = producer;
    }

    public List<Journalist> getJournalists() {
        return journalists;
    }

    public void setJournalists(List<Journalist> journalists) {
        this.journalists = journalists;
    }

    public Documentary() {

    }

    @Override
    public List<Employee> findEmployees(List<Employee> allEmployees) {

        List<Employee> employees=new ArrayList<>();
        for (Employee e:allEmployees
             ) {
            if(e.getProfession().equalsIgnoreCase("producer")){
                employees.add(e);
            }
            if(e.getProfession().equalsIgnoreCase("journalist")){
                employees.add(e);
            }


        }

        return employees;
    }
}
