package Lessons.lesson16.task2;

import java.util.List;

@FunctionalInterface
public interface PersonFilter {

    void print(List<Person> person, boolean isHealthy, int age);
}
