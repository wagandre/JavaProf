package lesson2.task1;

public class FruitTest {
    public static void main(String[] args) {
        Fruit fruit = new Fruit();
        fruit.color = "black";

        System.out.println(fruit.color);
        fruit.printInfo();

        Ananas ananas = new Ananas();
        ananas.color = "yellow";

        System.out.println(ananas.color);
        ananas.printInfo();

        System.out.println("создаем фрукт");
        Fruit fruit1 = new Fruit();

        System.out.println("создаём ананас");
        Ananas ananas1 = new Ananas();


        Ananas ananas3 = new Ananas(4,"green");




    }
}
