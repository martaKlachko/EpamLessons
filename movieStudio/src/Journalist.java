import java.util.List;

/**
 * Created by User on 26.02.2018.
 */
public class Journalist extends Employee {
    private final String profession="Journalist";
    public Journalist(String name, Double hourlyRate) {
        super(name, hourlyRate);
    }

    @Override
    public String toString() {
        return "Journalist "+ getName() +
                ", hourlyRate=" + getHourlyRate()
               ;
    }

    @Override
    public String getProfession() {
        return profession;
    }
}
