package SummaryJava.Iterator;

public class Cat {
    private String name;

    public String getName() {
        return name;
    }

    public Cat(String name) {
        this.name = name;


    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                '}';
    }
}
