import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * Created by User on 27.12.2017.
 */
public class Main {
    public static void main(String[] args) {
        Station st1=new Station("Львів");
        Station st2=new Station("Київ");
        Station st3=new Station("Чернівці");
        Station st4=new Station("Одеса");
        Station st5=new Station("Донецьк");
        Station st6=new Station("Тернопіль");
        Station st7=new Station("Рівне");
        Station st8=new Station("Луцьк");
        Station st9=new Station("Нововолинськ");
        Station st10=new Station("Фастів");
        Station st11=new Station("Полтава");
        Station st12=new Station("Умань");
        Station st13=new Station("Чернігів");
        Station st14=new Station("Кропивницький");
        Station st15=new Station("Хмельницький");
        StopStation sst1 = new StopStation(st3, LocalDateTime.of(2018, 2, 28, 12, 30),
                LocalDateTime.of(2018, 2, 28, 13, 30));
        StopStation sst2 = new StopStation(st7, LocalDateTime.of(2017, 8, 12, 12, 30),
                LocalDateTime.of(2017, 8, 12, 13, 30));
        StopStation sst3 = new StopStation(st12, LocalDateTime.of(2017, 8, 12, 12, 30),
                LocalDateTime.of(2017, 8, 12, 13, 30));
        StopStation sst4 = new StopStation(st4, LocalDateTime.of(2018, 2, 16, 12, 30),
                LocalDateTime.of(2018, 2, 16, 13, 30));
        StopStation sst5 = new StopStation(st6, LocalDateTime.of(2018, 3, 22, 4, 30),
                LocalDateTime.of(2018, 3, 22, 5, 30));
        StopStation sst6 = new StopStation(st5, LocalDateTime.of(2018, 5, 8, 5, 30),
                LocalDateTime.of(2018, 5, 8, 6, 30));
        StopStation sst7 = new StopStation(st15, LocalDateTime.of(2018, 6, 15, 6, 30),
                LocalDateTime.of(2018, 6, 15, 7, 30));
        StopStation sst8 = new StopStation(st13, LocalDateTime.of(2018, 8, 21, 7, 30),
                LocalDateTime.of(2018, 8, 21, 8, 30));
        StopStation sst9 = new StopStation(st10, LocalDateTime.of(2018, 3, 11, 8, 30),
                LocalDateTime.of(2018, 3, 11, 9, 30));
        StopStation sst10 = new StopStation(st8, LocalDateTime.of(2018, 11, 22, 9, 30),
                LocalDateTime.of(2018, 11, 22, 10, 30));
        StopStation sst11 = new StopStation(st9, LocalDateTime.of(2018, 1, 12, 10, 30),
                LocalDateTime.of(2018, 1, 12, 11, 6));
        StopStation sst12 = new StopStation(st11, LocalDateTime.of(2018, 6, 14, 11, 30),
                LocalDateTime.of(2018, 6, 14, 12, 30));
        StopStation sst13 = new StopStation(st14, LocalDateTime.of(2018, 4, 1, 12, 30),
                LocalDateTime.of(2018, 4, 1, 13, 30));
        StopStation sst14 = new StopStation(st7, LocalDateTime.of(2018, 6, 6, 13, 30),
                LocalDateTime.of(2018, 6, 6, 14, 30));
        StopStation sst15 = new StopStation(st11, LocalDateTime.of(2018, 8, 9, 14, 30),
                LocalDateTime.of(2018, 8, 9, 15, 30));
        StopStation sst16 = new StopStation(st2, LocalDateTime.of(2018, 10, 3, 15, 30),
                LocalDateTime.of(2018, 10, 3, 16, 30));
        StopStation sst17 = new StopStation(st4, LocalDateTime.of(2018, 12, 27, 16, 30),
                LocalDateTime.of(2018, 12, 27, 17, 30));
        StopStation sst18 = new StopStation(st15, LocalDateTime.of(2018, 7, 29, 17, 30),
                LocalDateTime.of(2018, 7, 29, 18, 30));
        StopStation sst19 = new StopStation(st1, LocalDateTime.of(2018, 7, 30, 18, 30),
                LocalDateTime.of(2018, 7, 30, 19, 30));
        StopStation sst20 = new StopStation(st6, LocalDateTime.of(2018, 8, 2, 19, 30),
                LocalDateTime.of(2018, 8, 2, 20, 30));
        StopStation sst21 = new StopStation(st9, LocalDateTime.of(2018, 3, 4, 20, 30),
                LocalDateTime.of(2018, 3, 4, 21, 30));
        StopStation sst22 = new StopStation(st8, LocalDateTime.of(2018, 2, 13, 21, 30),
                LocalDateTime.of(2018, 2, 13, 22, 30));
        StopStation sst23 = new StopStation(st7, LocalDateTime.of(2018, 1, 21, 22, 30),
                LocalDateTime.of(2018, 1, 21, 23, 30));
        StopStation sst24 = new StopStation(st12, LocalDateTime.of(2019, 5, 18, 16, 30),
                LocalDateTime.of(2019, 5, 18, 17, 30));
        StopStation sst25 = new StopStation(st1, LocalDateTime.of(2018, 5, 13, 0, 30),
                LocalDateTime.of(2018, 5, 13, 1, 30));



        Train train1 = new Train(new StopStation[]{sst1, sst4, sst16, sst5, sst20, sst6}, 378, 23);
        Train train2 = new Train(new StopStation[]{sst4, sst2, sst17, sst6, sst21, sst4}, 662,24);
        Train train3 = new Train(new StopStation[]{sst1, sst2, sst18, sst7, sst22, sst5, sst1}, 374,5);
        Train train4 = new Train(new StopStation[]{sst8, sst5, sst19, sst8, sst23}, 935,22);
        Train train5 = new Train(new StopStation[]{sst9, sst6, sst20, sst9, sst24, sst6}, 114,12);
        Train train6 = new Train(new StopStation[]{sst2, sst7, sst21, sst10}, 222,14);
        Train train7 = new Train(new StopStation[]{sst12, sst8, sst22, sst12, sst13,}, 230,7);
        Train train8 = new Train(new StopStation[]{sst14, sst9, sst23, sst12, sst13, sst7,}, 384,0);
        Train train9 = new Train(new StopStation[]{sst6, sst10, sst24, sst14, sst14, sst8, sst22}, 385,2);
        Train train10 = new Train(new StopStation[]{sst10, sst11, sst25, sst15, }, 666,0);
        Train train11 = new Train(new StopStation[]{sst12, sst12, sst1, sst16, sst25}, 999,0);
        Train train12 = new Train(new StopStation[]{sst11, sst13, sst2, sst17, sst16, sst9}, 111,7);
        Train train13 = new Train(new StopStation[]{sst7, sst14, sst3, sst18, sst12, sst10, sst23}, 222,3);
        Train train14 = new Train(new StopStation[]{sst6, sst15, sst4, sst19, sst12}, 333,1);
        Train[] trains = new Train[]{train1,train2,train3,train4,train5,train6,train7,train8,train9,train10,train11,train12,train13,train14};


        TrainUtil.findByCityAndAvailableSeats(trains);
        TrainUtil.findByStationFromAndTo(trains);
        TrainUtil.findByCityAndDate(trains);
    }

}
