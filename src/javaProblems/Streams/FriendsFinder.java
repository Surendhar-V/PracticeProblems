package javaProblems.Streams;

import java.util.*;
import java.util.stream.*;

class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

class AgeCategory {
    int age;
    long count;
    List<String> names;

    public AgeCategory(int age, long count, List<String> names) {
        this.age = age;
        this.count = count;
        this.names = names;
    }

    @Override
    public String toString() {
        return "Age: " + age + ", Count: " + count + ", Names: " + names;
    }
}

public class FriendsFinder {
    public static void main(String[] args) {
        List<Person> persons = Arrays.asList(
                new Person("John", 30),
                new Person("Jane", 25),
                new Person("Bob", 30),
                new Person("Alice", 25),
                new Person("Eve", 30)
        );

        Map<Integer, List<String>> ageToNames = persons.stream()
                .collect(Collectors.groupingBy(
                        Person::getAge,
                        Collectors.mapping(Person::getName, Collectors.toList())
                ));

        System.out.println(ageToNames);




        List<AgeCategory> ageCategories = ageToNames.entrySet().stream()
                .map(entry -> new AgeCategory(
                        entry.getKey(),
                        entry.getValue().size(),
                        entry.getValue()
                ))
                .collect(Collectors.toList());

        System.out.println(ageCategories);
    }
}
