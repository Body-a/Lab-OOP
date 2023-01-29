package lab_rob_6;



public class Main {
    public static void main(String[] args) {
        Bakery bakery = new Bakery(29, 34, 12, 100000);
        Cooker cooker = new Cooker(29, 34, 12, 100000);
        DeliveryShop deliveryShop = new DeliveryShop();

        bakery.profits(10000);
        bakery.info();
        bakery.square();

        System.out.println();

        cooker.square();
        cooker.profits(10000);

        System.out.println();

        deliveryShop.showCar();
        deliveryShop.clients();
    }
}
