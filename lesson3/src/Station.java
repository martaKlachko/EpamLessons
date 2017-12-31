import java.time.LocalDateTime;

/**
 * Created by User on 27.12.2017.
 */
public class Station {
    private String city;


    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Station station = (Station) o;

        return city.equals(station.city);
    }

    @Override
    public int hashCode() {
        return city.hashCode();
    }

    public Station(String city) {
        this.city = city;

    }

    @Override
    public String toString() {
        return  city.toString();
    }
}
