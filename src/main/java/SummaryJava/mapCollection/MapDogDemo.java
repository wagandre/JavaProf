package SummaryJava.mapCollection;

import java.util.HashMap;
import java.util.Map;

public class MapDogDemo {
    public static void main(String[] args) {
        Map<String,Dog> kennelClub = new HashMap<>();

        Dog dog1 = new Dog(2,"kolly");
        Dog dog2 = new Dog(3,"sam");
        Dog dog3 = new Dog(4,"rex");
        Dog dog4 = new Dog(5,"alpha");

        kennelClub.put("Reks", dog2);
        kennelClub.put("Lessy", dog1);
        kennelClub.put("Drim", dog3);
        kennelClub.put("Sok", dog4);

        System.out.println(kennelClub);

        Dog tempDog = kennelClub.get("Lessy");
        System.out.println(tempDog);

        dog2.age = 5;
        System.out.println(kennelClub);
    }
}
