package lab_rob_2;

public class Main {
    public static void main(String[] args) {
        Bakery bakery = new Bakery(29, 34, 12, 100000);
        Bakery bakery1 = new Bakery();
        Bakery bakery2 = new Bakery(29);
        Bakery bakery3 = new Bakery(29,34);
        Cooker cooker = new Cooker("Іван", 26, 6);
        Delivery delivery = new Delivery("Sprinter", 12, 10000);

        System.out.println("Площа пекарні " + bakery.square());
        bakery.profits(40000);
        System.out.println("Площа пекарні " + bakery.square(29.0, 34.0));
        bakery.info();
        System.out.println(bakery.profitB(bakery));

        System.out.println();

        System.out.println("Імя парцівника " + cooker.showName());
        cooker.showExperience(3);
        cooker.showExperience();
        cooker.info();
        cooker.cookerDemo(2, " Мельник"); //метод посилкового типу

        System.out.println();

        System.out.println("Авто яке доставляє випічку: " + delivery.showCar());
        delivery.clearProfit(4500);
        delivery.clearProfit();
        delivery.info();
    }
}