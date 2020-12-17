package lesson7;

import lesson6.Person;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {

//        final Predicate<Person> personPredicate = new Predicate<Person>() {
//            @Override
//            public boolean test(Person person) {
//                return person.getName().startsWith("O");
//            }
//        };

//        (input parameters) -> {method body}
//        Person person = new Person(10, "Olena", LocalDate.of(1997, 12, 10));
//
//        final Predicate<Person> personPredicate = p -> p.getName().startsWith("O");
//        System.out.println(personPredicate.test(person));
//
//        Consumer<Person> personConsumer = p -> System.out.println(p);
//        personConsumer.accept(person);
//
//
//        Supplier<Person> personSupplier = () -> new Person(2, "Oleksandr", LocalDate.of(1993, 11, 11));
//        personConsumer.accept(personSupplier.get());
//
//
//        Function<Person, String> personFunction = p -> {
//            final String s = p.getId() + ": " + p.getName();
//            return s.toUpperCase();
//        };
//
//        Function<Person, String> personToNameFunction = Person::getName;
//        System.out.println(personFunction.apply(person));

        List<Person> list = new ArrayList<>();
        list.add(new Person(10, "Olena", LocalDate.of(1997, 12, 10)));
        list.add(new Person(3, "Volodymyr", LocalDate.of(1999, 3, 20)));
        list.add(new Person(7, "Roman", LocalDate.of(1996, 5, 4)));
        list.add(new Person(3, "Iryna", LocalDate.of(1999, 3, 20)));


        //1. Вивести всі елементи на екран
//        list.forEach(System.out::println);

        //2. Створити колекцію імен персонів
//        final List<String> names = list.stream()
//                .map(Person::getName)
//                .collect(Collectors.toList());
//        System.out.println(names);

        //3. Посортувати колекцію по айді
//        final List<Person> sortedPersons = list.stream()
//                .sorted(Comparator.comparingInt(Person::getId))
//                .collect(Collectors.toList());
//        sortedPersons.forEach(System.out::println);
//        //4. Відфільтрувати усіх хто народився у 1999 році
//        final List<Person> persons1999 = list.stream()
//                .filter(person -> person.getBirthDate().getYear() == 1999)
//                .collect(Collectors.toList());
//        persons1999.forEach(System.out::println);

        //5. Відфільтрувати усіх хто народився у 1999 році і повернути їхні айдішки
//        final List<Integer> ids1999 = list.stream()
//                .filter(person -> person.getBirthDate().getYear() == 1999)
//                .map(Person::getId)
//                .collect(Collectors.toList());
//        System.out.println(ids1999);

        // 6.Вибрати три перших та повернути їх в зворотньому порядку
//        final List<Person> collect = list.stream()
//                .limit(3).sorted((o1, o2) -> o2.getName().compareTo(o1.getName()))
//                .collect(Collectors.toList());
//        collect.forEach(System.out::println);

        //найти средний возраст и вывести 2 листа с годами
        // 1. с годами меньше среднего возраста
        // 2. второй лист с годами выше среднего)))
//        final double averageAge = list.stream().mapToInt(person -> {
//            final LocalDate birthDate = person.getBirthDate();
//            final LocalDate now = LocalDate.now();
//            return now.getYear() - birthDate.getYear();
//        }).average().getAsDouble();
//
//        final List<Person> elders = list.stream().filter(person -> {
//            final LocalDate birthDate = person.getBirthDate();
//            final LocalDate now = LocalDate.now();
//            return now.getYear() - birthDate.getYear() > averageAge;
//        }).collect(Collectors.toList());
//        final List<Person> youngOnes = list.stream().filter(person -> {
//            final LocalDate birthDate = person.getBirthDate();
//            final LocalDate now = LocalDate.now();
//            return now.getYear() - birthDate.getYear() <= averageAge;
//        }).collect(Collectors.toList());
//
//        elders.forEach(System.out::println);
//        System.out.println("-000");
//        youngOnes.forEach(System.out::println);

//        final String s1 = list.stream().map(Person::getName).reduce((s, s2) -> s + " " + s2).get();
//        System.out.println(s1);

        Optional.of(new Person(1, "Andriy", LocalDate.now()))
                .ifPresent(person -> System.out.println(person));

    }

}
