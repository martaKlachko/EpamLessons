import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created by User on 26.02.2018.
 */
public class Main {
    public static void main(String[] args) {
        List<Employee> allEmployees = new ArrayList<>();
        allEmployees.add(new Journalist("Kolia Kolia", 5322.0));
        allEmployees.add(new Producer("Vova Vova", 2344.4));
        allEmployees.add(new Journalist("Ira Ira", 2450.0));
        allEmployees.add(new Producer("Olya Olya", 2453.0));
        allEmployees.add(new Screenwriter("Bohdan Bohdan", 23423.0));
        allEmployees.add(new Journalist("Nastya Nastya", 3243.0));

        Movie documentaryMovie = new Documentary();
        List<Employee> documentaryEmployees = documentaryMovie.findEmployees(allEmployees);
        Collections.sort(documentaryEmployees);

        for (Employee e : documentaryEmployees
                ) {
            System.out.println(e);
        }

    }
}
