import java.util.Comparator;

/**
 * Created by User on 26.02.2018.
 */
public class Employee implements Comparable<Employee> {
    private String name;
    private Double hourlyRate;

    public Employee(String name, Double hourlyRate) {
        this.name = name;
        this.hourlyRate = hourlyRate;
    }

    public Employee() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(Double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", hourlyRate=" + hourlyRate +
                '}';
    }

    String getProfession() {
        return null;
    }


    @Override
    public int compareTo(Employee o) {
        Double p2 = o.getHourlyRate();
        Double p1 = this.getHourlyRate();
        if (p1 > p2) {
            return 1;
        } else if (p1 < p2) {
            return -1;
        } else {
            return 0;
        }
    }

}

