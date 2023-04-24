package homeworks.homework1.first;

import homeworks.homework1.first.Person;

public class PersonTest {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.age = 20;
        person1.fullName = "Alex Schmidt";

        Person person2 = new Person("Andre Wagner", 22);

        System.out.println("My name is " + person1.fullName + " and I'm "  + person1.age + " years old.") ;
        System.out.println("My name is " + person2.fullName + " and I'm "  + person2.age + " years old.");



    }
}
