package lesson1.task1;

public class DogTest {
    public static void main(String[] args) {
        Dog dog1 = new Dog();
        dog1.bark();
        dog1.setAge(-2.5);
        System.out.println(dog1.getAge());

        Dog dog = new Dog(4,"Max","green");
        System.out.println(dog.getAge());



    }
}
