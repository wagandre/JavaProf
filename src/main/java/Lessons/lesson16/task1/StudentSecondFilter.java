package Lessons.lesson16.task1;

public class StudentSecondFilter implements Filter {
    @Override
    public boolean test(Student student) {
        return student.getGender().equals(Gender.FEMALE) && student.getName().toLowerCase().contains("д");

    }
}
