package lesson7;

import lesson6.Person;

@FunctionalInterface
public interface MyPredicate {

    boolean test(Person person);

}
