import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Matt", "London", 36, 15, Position.MANAGER));
        employees.add(new Employee("Ivan", "Lviv", 55, 27, Position.MANAGER));
        employees.add(new Employee("Mikel", "Marseille", 36, 13, Position.MANAGER));
        employees.add(new Employee("Merry", "London", 25, 6, Position.WORKER));
        employees.add(new Employee("Merry", "London", 25, 6, Position.WORKER));
        employees.add(new Employee("John", "Liverpool", 22, 1, Position.WORKER));
        employees.add(new Employee("Robert", "Manchester", 45, 18, Position.MANAGER));
        employees.add(new Employee("Tom ", "London", 37, 19, Position.DIRECTOR));
        employees.add(new Employee("Eva", "Krakow", 29, 6, Position.WORKER));
        employees.add(new Employee("Jared", "Manchester", 38, 14, Position.WORKER));
        employees.add(new Employee("Jared", "Manchester", 38, 14, Position.WORKER));
        employees.add(new Employee("Andriy", "Ternopil", 23, 4, Position.WORKER));
        employees.add(new Employee("Marta", "Poltava", 33, 10, Position.DIRECTOR));
        employees.add(new Employee("Emma", "Chicago", 22, 3, Position.WORKER));
        employees.add(new Employee("Emilia", "London", 24, 7, Position.WORKER));
        employees.add(new Employee("Emilia", "London", 24, 7, Position.WORKER));

//task1
        employees.stream().skip(employees.size() - 4).forEach(s -> System.out.println(s));
        //task2
        employees.stream().filter((p) -> p.getName().startsWith("M")
                && (p.getPosition() == Position.DIRECTOR || p.getPosition() == Position.MANAGER))
                .forEach(s -> System.out.println(s));
        //task3
        employees.stream().filter(p -> p.getPosition() == Position.MANAGER)
                .map(s -> s.getName()).forEach(s -> System.out.println(s));
        //task4
        employees.stream().distinct().filter(p -> p.getPosition() == Position.WORKER && p.getWorkExperience() > 5)
                .forEach(s -> System.out.println(s));
        //task5
        List<Employee> list = employees.stream().filter((s) -> s.getNativeCity().equalsIgnoreCase("LoNDON"))
                .collect(Collectors.toList());
        for (Employee e : list) {
            System.out.println(e);
        }
        //task6
        System.out.println(employees.stream().filter(s -> s.getAge() > 30).count());
        //task7
        System.out.println(employees.stream().mapToInt(s -> s.getWorkExperience()).average());
        //task8
        employees.stream().forEach(s -> {
            s.setWorkExperience(s.getWorkExperience() + 1);
            System.out.println(s);
        });
        //task9
        employees.stream().filter(s -> !s.getNativeCity().equalsIgnoreCase("manchester")
                && (s.getAge() <= 35 && s.getAge() >= 25)).forEach(s -> System.out.println(s));
        //task10

        employees.stream().sorted(Comparator.comparing(Employee::getAge)).forEach(s -> System.out.println(s));

    }

}

