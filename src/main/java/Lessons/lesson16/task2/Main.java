package Lessons.lesson16.task2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // List<Person>, boolean isHealthy, Integer id
        // find and print healthy persons with id%2==0
        // print noHealthy person with !id%2==0;
        // выборка не старше переданного возраста
        List<Person> people = new ArrayList<>();
        people.add(new Person("Alexander", 2, true, 10));
        people.add(new Person("Alex", 6, true, 20));
        people.add(new Person("Olga", 56, true, 30));
        people.add(new Person("Semen", 8, false, 40));
        people.add(new Person("Vova", 145, true, 50));
        people.add(new Person("Olena", 1252, false, 11));
        people.add(new Person("Peter", 112, true, 22));
        people.add(new Person("Sam", 1333, false, 33));
        people.add(new Person("Dog", 111, true, 44));
        people.add(new Person("Vlad", 122, true, 55));

        CustomFilter customFilter = new CustomFilter();

        System.out.println("First SELECT");
        customFilter.print(people, true, 40);

        System.out.println("second SELECT");
        customFilter.print(people, false, 20);


        PersonFilter filter3 = new PersonFilter() {
            @Override
            public void print(List<Person> list, boolean isHealthy, int age) {
                for (Person person : people) {
                    if (isHealthy) {
                        if (person.isHealthy() && person.getId() % 2 == 0 && person.getAge() <= age) {
                            System.out.println(person);
                        }
                    } else {
                        if (!person.isHealthy() && person.getId() != 0 && person.getAge() <= age) {
                            System.out.println(person);
                        }
                    }

                }
            }
        };
        System.out.println("third SELECT");
        filter3.print(people,true, 40 );

        PersonFilter filter4 = (x,y,z) -> {

            for (Person person : x) {
                if (y) {
                    if (person.isHealthy() && person.getId() % 2 == 0 && person.getAge() <= z) {
                        System.out.println(person);
                    }
                } else {
                    if (!person.isHealthy() && person.getId() != 0 && person.getAge() <= z) {
                        System.out.println(person);
                    }
                }

            }

    };




        System.out.println("Lambda SELECT");
        filter4.print(people, true,40);




        }
    }
