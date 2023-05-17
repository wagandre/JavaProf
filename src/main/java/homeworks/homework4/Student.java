package homeworks.homework4;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private String name;
    private String surname;

    private int courseNumber;

    private double averageMark;


    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getCourseNumber() {
        return courseNumber;
    }

    public double getAverageMark() {
        return averageMark;
    }

    public Student(String name, String surname, int courseNumber, double averageMark) {
        this.name = name;
        this.surname = surname;
        this.courseNumber = courseNumber;
        this.averageMark = averageMark;




    }
}
