package lesson6;

import lesson4.Car;
import lesson4.CarType;
import lesson4.Engine;

import java.text.ParseException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) throws ParseException {
//        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
//        Date date = simpleDateFormat.parse("2020-12-19");
//        System.out.println(date);
//        SimpleDateFormat simpleDateFormat1 = new SimpleDateFormat("dd/MM/yyyy");
//        System.out.println(simpleDateFormat1.format(date));

//        LocalDate localDate = LocalDate.parse("2020/12/19", DateTimeFormatter.ofPattern("yyyy/MM/dd"));
//        System.out.println(localDate.format(DateTimeFormatter.ofPattern("yyyy/MM/dd")));

//        Set<String> stringSet = new TreeSet<>();
//        stringSet.add("third");
//        stringSet.add("second");
//        stringSet.add("first");
//        System.out.println(stringSet);

//        Set<Person> set = new TreeSet<>();
//        set.add(new Person(10, "Olena", LocalDate.of(1997, 12, 10)));
//        set.add(new Person(3, "Volodymyr", LocalDate.of(1999, 3, 20)));
//
//        set.add(new Person(7, "Roman", LocalDate.of(1996, 5, 4)));
//        set.add(new Person(3, "Iryna", LocalDate.of(1999, 3, 20)));
//
//        for (Person person : set) {
//            System.out.println(person);
//        }

//        List<Person> list = new ArrayList<>();
//        list.add(new Person(10, "Olena", LocalDate.of(1997, 12, 10)));
//        list.add(new Person(3, "Volodymyr", LocalDate.of(1999, 3, 20)));
//        list.add(new Person(7, "Roman", LocalDate.of(1996, 5, 4)));
//        list.add(new Person(3, "Iryna", LocalDate.of(1999, 3, 20)));
//
//        System.out.println("Before sort:");
//        for (Person person : list) {
//            System.out.println(person);
//        }
//        list.sort(new PersonIdComparator());

//        list.sort(new Comparator<Person>() {
//
//            @Override
//            public int compare(Person o1, Person o2) {
//                return o1.getId() - o2.getId();
//            }
//        });

//        list.sort((o1, o2) -> o1.getId() - o2.getId());
//        System.out.println("\nAfter sort:");
//        for (Person person : list) {
//            System.out.println(person);
//        }

        Map<Person, List<Car>> map = new HashMap<>();
        map.put(new Person(1, "Roman", LocalDate.of(1995, 5, 4)), new ArrayList<>());
        map.put(new Person(2, "Olena", LocalDate.of(1996, 1, 24)), new ArrayList<>());

        addCarToPerson(1,
                new Car(new Engine(2, 4), "Audi", Math.max(30000, 32000), CarType.SEDAN),
                map);
        printMap(map);
    }

    public static void addCarToPerson(int personId, Car car, Map<Person, List<Car>> map) {
        final Set<Person> set = map.keySet();
        for (Person person : set) {
            if (person.getId() == personId) {
                map.get(person).add(car);
            }
        }
    }

    public static void printMap(Map<Person, List<Car>> map) {
        final Set<Map.Entry<Person, List<Car>>> entries = map.entrySet();
        for (Map.Entry<Person, List<Car>> entry : entries) {
            System.out.println(entry.getKey() + ":");
            for (Car car : entry.getValue()) {
                System.out.println("\t" + car);
            }
        }
    }
}
