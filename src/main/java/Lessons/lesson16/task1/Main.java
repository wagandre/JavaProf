package Lessons.lesson16.task1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Борис", 25, 3, 4.76, Gender.MALE));
        students.add(new Student("Александра", 32, 3, 4.82, Gender.FEMALE));
        students.add(new Student("Николай", 22, 4, 3.91, Gender.MALE));
        students.add(new Student("Дмитрий", 29, 1, 4.23, Gender.MALE));
        students.add(new Student("Валерия", 21, 3, 4.63, Gender.FEMALE));
        students.add(new Student("Оксана", 28, 2, 3.19, Gender.FEMALE));
        students.add(new Student("Алексей", 30, 5, 4.85, Gender.MALE));

        System.out.println("Список всех студентов : ");
        for (Student student : students) {
            System.out.println(student);
        }
        System.out.println();
        System.out.println("Отфильтрованные студенты при помощи фильтра studentfilter");

        StudentUtils.printStudents(students, new StudentFilter());
        System.out.println();

        System.out.println("Вывод студентов у которых пол женский и имя содержит букву Д");

        StudentUtils.printStudents(students, new StudentSecondFilter());
        System.out.println();

        System.out.println("Вывести студентов у которых средний балл 4.3 либо ниже и возраст 25 " +
                "либо ниже : ");
        System.out.println("студенты отфильтрованные с анонимным классом");
        StudentUtils.printStudents(students, new Filter() {
            @Override
            public boolean test(Student student) {
                return student.getAverageRate() <= 4.3 && student.getAge() <= 25;
            }
        });
        System.out.println();
        StudentUtils.printStudents(students, new Filter() {
            @Override
            public boolean test(Student student) {
                return student.getCourse() < 5 && student.getGender().equals(Gender.MALE);
            }
        });
        System.out.println();

        // вывести третьего курса с длинной имени менее 7
        StudentUtils.printStudents(students, new Filter() {
            @Override
            public boolean test(Student student) {
                return student.getCourse() == 3 && student.getName().length() < 7;
            }
        });
        System.out.println("студенты отфильтрованные при помощи лямбда выражения");
        StudentUtils.printStudents(students, x->x.getCourse() == 3 && x.getName().length() < 7);







    }
}

