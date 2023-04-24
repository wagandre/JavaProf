package lesson2.task1;

public class Ananas extends Fruit {

    public Ananas(String color){
        super();
        this.color = color;



    }

    public Ananas(int size,String color)
    {

        System.out.println("called constructor ananas with color and size");


    }



    public Ananas(){
        System.out.println("вызван конструктор ананас");
    }

    @Override
    public void printInfo() {
        System.out.println("It's Ananas");
    }
}
