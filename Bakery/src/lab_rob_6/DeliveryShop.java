package lab_rob_6;

public class DeliveryShop implements ShopM{

    String car = "Sprinter";
    int clients = 15;


    public void showCar(){
        System.out.println(car);
    }

    public void clients() {
        System.out.println(clients);
    }

    public interface Add {
        void info();
    }
}
