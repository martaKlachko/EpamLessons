/**
 * Created by User on 26.02.2018.
 */
public class Screenwriter extends Employee{
    private final String profession="Screenwriter";
    public Screenwriter(String name, Double hourlyRate) {
        super(name, hourlyRate);
    }
    @Override
    public String toString() {
        return "Screenwriter "+ getName() +
                ", hourlyRate=" + getHourlyRate()
                ;
    }

    @Override
    public String getProfession() {
        return profession;
    }
}
