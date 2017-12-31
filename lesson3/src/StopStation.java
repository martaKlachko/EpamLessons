import java.time.LocalDateTime;
import java.util.Date;
import java.util.IllegalFormatException;

/**
 * Created by User on 28.12.2017.
 */
public class StopStation {
    private Station station;
    private LocalDateTime arrivalDate;
    private LocalDateTime departureDate;

    public StopStation(Station station, LocalDateTime arrivalDate, LocalDateTime departureDate) {
        this.station = station;
        if(departureDate.isAfter(arrivalDate)){
        this.arrivalDate = arrivalDate;
        this.departureDate = departureDate;}
        else {
            System.out.println("помилка створення!");//не може дата відїзду бути перед датою прибуття
        }
    }

    public Station getStation() {
        return station;
    }
    public String getStationName() {
        return station.getCity();
    }
    public void setStation(Station station) {
        this.station = station;
    }

    public LocalDateTime getArrivalDate() {
        return arrivalDate;
    }

    public void setArrivalDate(LocalDateTime arrivalDate) {
        this.arrivalDate = arrivalDate;
    }

    public LocalDateTime getDepartureDate() {
        return departureDate;
    }

    public void setDepartureDate(LocalDateTime departureDate) {
        this.departureDate = departureDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        StopStation that = (StopStation) o;

        if (!station.equals(that.station)) return false;
        if (!arrivalDate.equals(that.arrivalDate)) return false;
        return departureDate.equals(that.departureDate);
    }

    @Override
    public int hashCode() {
        int result = station.hashCode();
        result = 31 * result + arrivalDate.hashCode();
        result = 31 * result + departureDate.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "StopStation{" +
                "station=" + station +
                ", arrivalDate=" + arrivalDate +
                ", departureDate=" + departureDate +
                '}';
    }

    public StopStation(Station station, LocalDateTime arrivalDate) {
        this.station = station;
        this.arrivalDate = arrivalDate;
    }
}
