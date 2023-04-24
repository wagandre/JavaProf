package Lessons.lesson2.task1;

public class Fruit {

   protected String color;

    public Fruit(String color) {
        this.color = color;
    }

    public Fruit(int size){
        System.out.println("вызван конструктор fruit with size");
    }

    public Fruit(){
       System.out.println("вызван конструктор fruit");


   }

   public void printInfo(){
       System.out.println("It's fruit");
   }





}
