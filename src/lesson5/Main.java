package lesson5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
//        List<String> list = new ArrayList<>();
//        list.add("first");
//        list.add("second");
//        list.add("third");
//        list.add("second");

//        String[] ar = new String[] {"first", "second"};
//        String[] ar1 = new String[] {"first", "second"};
//
//        final List<String[]> strings = Arrays.asList(ar, ar1);
//        System.out.println(strings);

//        String s1 = "Hello";
//        String s2 = "Hello";
//
//        Person p1 = new Person(1, "Taras");
//        Person p2 = new Person(1, "Taras");
//
//
//        System.out.println(s1.equals(s2));
//
//        System.out.println(p1.equals(p2));


//        List<Person> list = new ArrayList<>();
//        list.add(new Person(1, "Taras"));
//        list.add(new Person(2, "Igor"));
//        list.add(new Person(3, "Anna"));
//
//        for (Person person : list) {
//            if (person.getName().startsWith("I")) {
//                list.remove(person);
//            }
//        }
//        Iterator<Person> iterator = list.iterator();
//        while (iterator.hasNext()) {
//            final Person p = iterator.next();
//            iterator.remove();
//        }
//        System.out.println(list);

//        Set<Person> set = new HashSet<>();
//        set.add(new Person(1, "Olena"));
//        set.add(new Person(2, "Volodymyr"));
//        set.add(new Person(3, "Roman"));
//        set.add(new Person(4, "Serhiy"));
//        set.add(new Person(2, "Volodymyr"));

//        System.out.println(set);
        Map<String, Person> map = new HashMap<>();
        map.put("first", new Person(1, "Olena"));
        map.put("second", new Person(2, "Igor"));
        map.put("first", new Person(3, "Roman"));


        System.out.println(map);



    }
}
