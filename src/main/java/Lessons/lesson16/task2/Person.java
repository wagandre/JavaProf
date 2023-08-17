package Lessons.lesson16.task2;

import java.util.Objects;

public class Person {
    private String name;
    private Integer id;

    private int age;

    private boolean isHealthy;

    public Person(String name, Integer id, boolean isHealthy, int age) {
        this.name = name;
        this.id = id;
        this.isHealthy = isHealthy;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public Integer getId() {
        return id;
    }

    public boolean isHealthy() {
        return isHealthy;
    }

    public int getAge() {
        return age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && isHealthy == person.isHealthy && Objects.equals(name, person.name) && Objects.equals(id, person.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, id, age, isHealthy);
    }

    @Override
    public String toString() {
        return String.format("%s, id -  %d, возраст - %d, %s",
                name, id,  age, isHealthy ? "здоров" : "требуется лечение");
    }
}
