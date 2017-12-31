
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

/**
 * Created by User on 27.12.2017.
 */
public class Train {

    private String name;
    private StopStation[] stations;
    private int trainNumber;
    private int availableSeats;

    public int getAvailableSeats() {
        return availableSeats;
    }

    public void setAvailableSeats(int availableSeats) {
        this.availableSeats = availableSeats;
    }

    public Train(String name, StopStation[] stations, int trainNumber, int availableSeats) {
        this.name = name;
        this.stations = stations;
        this.trainNumber = trainNumber;
        this.availableSeats = availableSeats;
    }

    public StopStation[] getStations() {
        return stations;
    }

    public void setStations(StopStation[] stations) {
        this.stations = stations;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTrainNumber() {
        return trainNumber;
    }

    public void setTrainNumber(int trainNumber) {
        this.trainNumber = trainNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Train train = (Train) o;

        if (trainNumber != train.trainNumber) return false;
        return name.equals(train.name);
    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + trainNumber;
        return result;
    }

    public Train(StopStation[] stations, int trainNumber, int availableSeats) {
        this.stations = stations;
        this.name = stations[0].getStation().toString() + " - " + stations[stations.length - 1].getStation().toString();
        this.trainNumber=trainNumber;
        this.availableSeats=availableSeats;
    }



    @Override
    public String toString() {
        return trainNumber + ", " + name;
    }
}
