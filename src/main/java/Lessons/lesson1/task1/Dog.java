package Lessons.lesson1.task1;

public class Dog {
    private String color;
    private  String breed;
    private  double age;




    public Dog(double age,String breed,String color){
        if (age < 0){
            System.out.println("Возраст не может быть меньше нуля!");
            age = 0;}

            this.age = age;
        this.breed = breed;
        this.color = color;

    }
    public Dog(){}

    public Dog(String breed) {
        this.breed = breed;
    }

    public double getAge(){
        return age;
    }

    public void setAge(double age){
        if(age< 0){
            System.out.println("Возраст не может быть меньше нуля!");
        age = 0;
        }
        this.age = age;
    }


    void bark(){
        System.out.println("Гав!");
    }

    void sleep(){
        System.out.println("Хочу спать!");

    }
    void eat(){
        System.out.println("Хочу есть!");
    }




}
