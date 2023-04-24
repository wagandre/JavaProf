package homeworks.homework1.second;

public class PhoneTest {
    public static void main(String[] args) {
        Phone phone1 = new Phone();
        phone1.model = "Samsung";
        phone1.number = 8_888_888;
        phone1.weight = 250.50;


        Phone phone2 = new Phone();
        phone2.model = "Sony";
        phone2.number = 8_888_887;
        phone2.weight = 250.70;


        Phone phone3 = new Phone();
        phone3.model = "Huawei";
        phone3.number = 8_888_886;
        phone3.weight = 250.60;


        System.out.println("Model: " + phone1.model + ", Number: " + phone1.number +  ", Weight:" + phone1.weight);
        System.out.println("Model: " + phone2.model + ", Number: " + phone2.number +  ", Weight:" + phone2.weight);
        System.out.println("Model: " + phone3.model + ", Number: " + phone3.number +  ", Weight:" + phone3.weight);


        phone1.receiveCall("Andre");
        phone1.getNumber(phone1.number);

        phone2.receiveCall("Alex");
        phone2.getNumber(phone2.number);

        phone3.receiveCall("Max");
        phone3.getNumber(phone3.number);




    }
}
