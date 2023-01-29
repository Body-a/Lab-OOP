package lab_rob_2;

public class Delivery {
    String car;
    int countDeliveries;
    int profit;

    Delivery(String car, int countDeliveries, int profit) {
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

    void clearProfit(){  //перевизначений
        System.out.println("Дохід: " + profit);
    }

    void info(){  // метод зі статичним імям
        System.out.println("Кількість доставок на день: " + countDeliveries);
    }

}
