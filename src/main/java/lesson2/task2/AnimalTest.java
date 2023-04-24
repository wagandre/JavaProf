package lesson2.task2;

public class AnimalTest {
    public static void main(String[] args) {
       Cat [] cats = new Cat[3];
       cats[0] = new Cat();

       LandAnimal[] landanimal = new LandAnimal[3];
       landanimal[0] = new Cat();
       landanimal[1] = new Dog();
       landanimal[2] = new Cow();

       for(LandAnimal animal : landanimal ){
           animal.voice();

       }
    }
}
