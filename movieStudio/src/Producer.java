/**
 * Created by User on 26.02.2018.
 */
public class Producer extends Employee {
    private final String profession="Producer";
    public Producer(String name, Double hourlyRate) {
        super(name, hourlyRate);
    }
    @Override
    public String toString() {
        return "Producer "+ getName() +
                ", hourlyRate=" + getHourlyRate()
                ;
    }

    @Override
    public String getProfession() {
        return profession;
    }
}
