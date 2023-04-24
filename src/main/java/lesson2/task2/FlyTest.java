package lesson2.task2;

public class FlyTest {
    public static void main(String[] args) {
        Flyable [] flyables = new Flyable[2];
        flyables[0] = new Bird();
        flyables[1] = new Airplane();

        for(Flyable flyable : flyables){
            flyable.fly();
        }

    }
}
