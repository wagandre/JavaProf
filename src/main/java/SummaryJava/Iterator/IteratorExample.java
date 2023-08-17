package SummaryJava.Iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorExample {
    public static void main(String[] args) {
        ArrayList<Cat> cats = new ArrayList<>();
        Cat murzik = new Cat("Murzik");
        Cat barsik = new Cat("Barsik");
//        Cat begemot= new Cat("Begemot");
        Cat pushok = new Cat("Pushok");
        Cat dexter = new Cat("Dexter");

        cats.add(new Cat("Begemot"));
        cats.add(murzik);
        cats.add(barsik);
        cats.add(pushok);
        cats.add(dexter);

        System.out.println(cats);


        Iterator<Cat> catIterator = cats.iterator();
        while (catIterator.hasNext()) {
            System.out.println(catIterator.next());
        }
        System.out.println("------------------------------");

        catIterator = cats.iterator();

    }

}
