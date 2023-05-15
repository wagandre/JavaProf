package Lessons.lesson4.task1;

public class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        System.out.println("Конструктор вызываем...");
        this.name = name;
    }
}
