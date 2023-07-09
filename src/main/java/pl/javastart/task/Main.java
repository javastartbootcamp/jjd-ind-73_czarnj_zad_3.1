package pl.javastart.task;

public class Main {

    public static void main(String[] args) {
        Phone phone1 = new Phone("Samsung", "Galaxy S6", "Black");

        Phone phone2 = new Phone("iPhone", "X", "Pink");

        System.out.printf("Phone1: %s %s %s\n", phone1.brand, phone1.model, phone1.color);
        System.out.printf("Phone2: %s %s %s\n", phone2.brand, phone2.model, phone2.color);
    }
}
