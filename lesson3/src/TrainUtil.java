import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.*;

/**
 * Created by User on 28.12.2017.
 */
public class TrainUtil {
    //    Task#3
    //пошук майбутніх поїздів, які їдуть через дане місто і мають вільні місця (пошук по локації по буквах)
    public static void findByCityAndAvailableSeats(Train[] trains) {
        boolean flag = false;
        System.out.println("Введіть місто");
        Scanner sc = new Scanner(System.in);
        String cityName = sc.next();
        for (int i = 0; i < trains.length; i++) {


            for (StopStation st : trains[i].getStations()
                    ) {
                if (st.getStation().getCity().toLowerCase().contains(cityName.toLowerCase()) && trains[i].getAvailableSeats() > 0
                        && st.getDepartureDate().isAfter(LocalDateTime.now())
                        ) {
                    flag = true;
                    String trainName = trains[i].toString();
                    System.out.println(trainName+", вільних місць- "+trains[i].getAvailableSeats());
                    break;
                }

            }

        }
        if (!flag) {
            System.out.println("не знайдено!");
        }

        sc.close();

    }

    //    Task#2
    //парсинг дати, яку вводить користувач з консолі
    public static LocalDateTime parseDate() {
        Scanner sc = new Scanner(System.in);
        System.out.println("введіть рік");
        boolean flag = false;
        int year = 0;
        while (!flag) {
            int a = sc.nextInt();
            if (a > 2030 || a < 2016) {
                System.out.println("немає даних!!");
                return null;
            } else {
                flag = true;
                year = a;

            }
        }
        flag = false;
        System.out.println("введіть місяць у числовому форматі(1-січень, 2-лютий і т.д.)");
        int month = 0;
        while (!flag) {
            int a = sc.nextInt();
            if (a > 12 || a < 1) {
                System.out.println("невірний формат!спробуйте ще раз");
            } else {
                flag = true;
                month = a;
            }
        }
        flag = false;
        System.out.println("введіть день місяця у числовому форматі");
        int day = 0;
        while (!flag) {
            int a = sc.nextInt();
            if (a > 31 || a < 1) {
                System.out.println("невірний формат!спробуйте ще раз");
            } else {
                flag = true;
                day = a;
            }
        }
        flag = false;
        System.out.println("введіть годину відправлення");
        int hour = 0;
        while (!flag) {
            int a = sc.nextInt();
            if (a > 24 || a < 1) {
                System.out.println("невірний формат!спробуйте ще раз");
            } else {
                flag = true;
                hour = a;
            }
        }
        flag = false;
        System.out.println("введіть хвилини відправлення");
        int minutes = 0;
        while (!flag) {
            int a = sc.nextInt();
            if (a > 59 || a < 0) {
                System.out.println("невірний формат!спробуйте ще раз");
            } else {
                flag = true;
                minutes = a;
            }
        }
        LocalDate ld = LocalDate.of(year, month, day);
        LocalTime lt = LocalTime.of(hour, minutes);
        LocalDateTime ldt = LocalDateTime.of(ld, lt);
        ZoneId zone = ZoneId.of(ZoneId.SHORT_IDS.get("ECT"));
        DateTimeFormatter formatter = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.FULL).withZone(zone);
        System.out.println("Ваша дата і час віправлення: " + formatter.format(ldt));
        return ldt;

    }

    //пошук поїздів, які відправляються з даного міста після певної дати(пошук по введеній даті)
    public static void findByCityAndDate(Train[] trains) {
        System.out.println("Введіть місто відправлення");
        List<Train> availableTrains = new ArrayList<Train>();
        Scanner sc = new Scanner(System.in);
        String city = sc.next();
        LocalDateTime date = TrainUtil.parseDate();
        for (Train t : trains
                ) {
            for (StopStation st : t.getStations()
                    ) {
                if (st.getStation().getCity().toLowerCase().contains(city.toLowerCase())) {
                    availableTrains.add(t);
                }
            }
        }
        Iterator<Train> iter = availableTrains.iterator();
        while (iter.hasNext()) {
            for (StopStation st : iter.next().getStations()) {
                if (st.getDepartureDate().isBefore(date)) {
                    iter.remove();
                }
            }
        }
        if (!availableTrains.isEmpty()) {
            List<LocalDateTime> dates = new ArrayList<LocalDateTime>();
            int counter = -1;
            ZoneId zone = ZoneId.of(ZoneId.SHORT_IDS.get("ECT"));
            DateTimeFormatter formatter = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.FULL).withZone(zone);
            for (Train t : availableTrains) {
                for (int i = 0; i < t.getStations().length; i++) {
                    if (t.getStations()[i].getStation().getCity().toLowerCase().contains(city.toLowerCase())) {
                        dates.add(t.getStations()[i].getDepartureDate());
                        counter++;
                    }
                }
                System.out.println(t + ", час відправлення з м. " + city + ": " + formatter.format(dates.get(counter)));
            }
        } else {
            System.out.println("Немає поїздів!");
        }
    }

    //    Task#1
    //    пошук поїздів, які ідуть від і до заданих локацій
    public static List<Train> findByStationFromAndTo(Train[] trains) {


        List<Train> result = new ArrayList<Train>();
        System.out.println("Введіть місто відправлення");
        Scanner sc = new Scanner(System.in);
        String departureCityName = sc.next();
        Queue<Integer> places = new PriorityQueue<>();
        Queue<LocalDateTime> arrivingDates = new PriorityQueue<>();
        Queue<LocalDateTime> departureDates = new PriorityQueue<>();
        for (int i = 0; i < trains.length; i++) {


            for (StopStation st : trains[i].getStations()
                    ) {
                if (st.getStation().getCity().toLowerCase().contains(departureCityName.toLowerCase())) {
                    result.add(trains[i]);
                    places.add(i);
                    departureDates.add(st.getDepartureDate());
                    break;
                }

            }

        }
        if (result.isEmpty()) {
            System.out.println("не знайдено!");
            return null;
        }

        System.out.println("Введіть місто прибуття");
        String arrivingCityName = sc.next();


        Iterator<Train> iter = result.iterator();
        while (iter.hasNext()) {
            int counter = 0;
            Train t = iter.next();
            for (int i = 0; i < t.getStations().length; i++) {
                if (!t.getStations()[i].getStation().getCity().toLowerCase().contains(arrivingCityName.toLowerCase())) {
                    counter += 1;

                } else {
                    if (i <= places.element()) {
                        places.remove();
                        iter.remove();

                    } else {
                        arrivingDates.add(t.getStations()[i].getArrivalDate());
                    }
                    ;

                }

                if (counter == t.getStations().length) {
                    iter.remove();
                }
            }

        }

        if (result.isEmpty()) {
            System.out.println("не знайдено!");
            return null;
        } else {
            ZoneId zone = ZoneId.of(ZoneId.SHORT_IDS.get("ECT"));
            DateTimeFormatter formatter = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.FULL).withZone(zone);
            for (Train t : result
                    ) {
                System.out.println(t.toString() + ", ");
                System.out.println("відправлення з м. " + departureCityName + ": " + formatter.format(departureDates.element()) + ",");
                departureDates.remove();
                System.out.println("прибуття в м. " + arrivingCityName + ": " + formatter.format(arrivingDates.element()) + ",");
                arrivingDates.remove();

            }
            sc.close();
        }
        return result;


    }


}
