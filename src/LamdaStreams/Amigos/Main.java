package LamdaStreams.Amigos;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Person> people = getPeople();
//filtering
//        List<Person> females;
//        females = people.stream()
//                .filter(person -> person.getGender().equals(Gender.Female))
//                .collect(Collectors.toList());
//        people.forEach(System.out::println);
//sorting
        List<Person> sorted;
                sorted= people.stream()
                .sorted(Comparator.comparing(Person::getAge).thenComparing(Person::getGender))
                .collect(Collectors.toList());
        sorted.forEach(System.out::println);

        //allMatch
        boolean allMatch = people.stream()
                .allMatch(person -> person.getAge()<5);
        System.out.println();
        System.out.println(allMatch);



        people.stream()
                .max(Comparator.comparing(Person::getAge))
                        .ifPresent(System.out::println);

        people.stream()
                .min(Comparator.comparing(Person::getAge))
                .ifPresent(System.out::println);

        //grouping

        Map<Gender, List<Person>> groupByGender = people.stream()
                .collect(Collectors.groupingBy(Person::getGender));
                        groupByGender.forEach((gender,people1) -> {
                            System.out.println();
                            System.out.println(gender);
                            people1.forEach(System.out::println);
                            System.out.println();

                        });
                        //oldest
        Optional<String> oldestMember = people.stream()
                .filter(person -> person.getGender().equals(Gender.Female))
                .max(Comparator.comparing(Person::getAge))
                .map(Person::getName);
        oldestMember.ifPresent(System.out::println);
    }


    private static List<Person> getPeople() {
       return List.of(
                new Person("Precious", 33, Gender.Female),
                new Person("Joy", 20, Gender.Female),
                new Person("Victoria", 42, Gender.Female),
                new Person("Wisdom", 45, Gender.Male),
                new Person("Junior", 21, Gender.Male)
        );


    }

}