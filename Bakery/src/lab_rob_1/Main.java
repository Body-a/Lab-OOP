package lab_rob_1;

public class Main {
    public static void main(String[] args) {
        Bakery bakery = new Bakery(29, 34, 12, 100000);
        Cooker cooker = new Cooker("Іван", 26, 6);
        Delivery delivery = new Delivery("Sprinter", 12, 10000);

        System.out.println("Площа пекарні " + bakery.square());
        bakery.profits(40000);

        System.out.println();

        System.out.println("Імя парцівника " + cooker.showName());
        cooker.showExperience(3);

        System.out.println();

        System.out.println("Авто яке доставляє випічку: " + delivery.showCar());
        delivery.clearProfit(4500);
    }
}