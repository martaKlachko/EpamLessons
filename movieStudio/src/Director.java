/**
 * Created by User on 26.02.2018.
 */
public class Director extends Employee{
    private final String profession="Director";
    public Director(String name, Double hourlyRate) {
        super(name, hourlyRate);
    }
    @Override
    public String toString() {
        return "Director "+ getName() +
                ", hourlyRate=" + getHourlyRate()
                ;
    }

    @Override
    public String getProfession() {
        return profession;
    }
}
