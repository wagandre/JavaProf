package Lessons.lesson16.task2;

import java.util.List;

public class CustomFilter implements PersonFilter {
    @Override
    public void print(List<Person> people, boolean isHealthy, int age) {
        // List<Person>, boolean isHealthy, Integer id
        // find and print healthy persons with id%2==0
        // print noHealthy person with !id%2==0;
        // выборка не старше переданного возраста
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
}