package Lessons.lesson16.task1;

import java.util.Objects;

public class Student {
    private String name;
    private int age;
    private int course;
    private double averageRate;
    private Gender gender;

    public Student(String name, int age, int course, double averageRate, Gender gender) {
        this.name = name;
        this.age = age;
        this.course = course;
        this.averageRate = averageRate;
        this.gender = gender;

    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getCourse() {
        return course;
    }

    public double getAverageRate() {
        return averageRate;
    }

    public Gender getGender() {
        return gender;
    }

    @Override
    public String toString() {
        return String.format("Студент : имя - %s," +
                " возраст - %d, пол - %s, курс - %d,  средняя оценка - %.2f",
                 name, age,gender.getDescription(),  course,averageRate);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return course == student.course && Double.compare(student.averageRate, averageRate) == 0 && Objects.equals(name, student.name) && Objects.equals(age, student.age);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, course, averageRate);
    }
}
