package pl.javastart.task;

public class Main {

    public static void main(String[] args) {
        Phone phone1 = new Phone();
        phone1.brand = "Samsung";
        phone1.model = "Galaxy S6";
        phone1.color = "Black";

        Phone phone2 = new Phone();
        phone2.brand = "iPhone";
        phone2.model = "X";
        phone2.color = "Pink";

        System.out.printf("Phone1: %s %s %s\n", phone1.brand, phone1.model, phone1.color);
        System.out.printf("Phone2: %s %s %s\n", phone2.brand, phone2.model, phone2.color);
    }
}
