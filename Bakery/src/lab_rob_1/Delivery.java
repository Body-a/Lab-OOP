package lab_rob_1;

public class Delivery {
    String car;
    int countDeliveries;
    int profit;

    public Delivery(String car, int countDeliveries, int profit) {
        this.car = car;
        this.countDeliveries = countDeliveries;
        this.profit = profit;
    }

    String showCar(){
        return car;
    }

    void clearProfit(int e){
        int a = profit - e;
        System.out.println("Чистий дохід: " + a);
    }

}
