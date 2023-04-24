package SummaryJava.lesson1;

public class DogTest {
    public static void main(String[] args) {


        Dog dog1 = new Dog();
        dog1.voice();

        CatDog catdog = new CatDog();
        catdog.catDogVoice();
        catdog.voice();
    }
}