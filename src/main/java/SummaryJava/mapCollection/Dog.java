package SummaryJava.mapCollection;

public class Dog {
    int age;
    String breed;

    public Dog(int age, String breed) {
        this.age = age;
        this.breed = breed;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "age=" + age +
                ", breed='" + breed + '\'' +
                '}';
    }
}
