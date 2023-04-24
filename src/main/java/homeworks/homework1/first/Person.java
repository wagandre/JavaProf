package homeworks.homework1.first;

public class Person {
    protected String fullName;
    protected int age;


    public void move() {
        System.out.println(fullName + " идёт");
    }


    public void talk() {
        System.out.println(fullName + " говорит");
    }

    public Person(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    public Person() {

    }

}


