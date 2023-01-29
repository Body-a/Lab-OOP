package lab_rob_5;

public class Dispatch {
    Bakery bakery = new Bakery(29, 34, 12, 100000);
    Cooker cooker = new Cooker("Іван", 26, 6);
    Delivery delivery = new Delivery("Sprinter", 12, 10000);

    Bakery b;

    void choice(int i){
        if (i == 1){
            b = bakery;
            b.info();
        }else if (i == 2){
            b = cooker;
            b.info();
        } else if (i == 3){
            b = delivery;
            b.info();
        }
    }
}
