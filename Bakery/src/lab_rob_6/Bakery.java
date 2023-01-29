package lab_rob_6;

public class Bakery implements BakeryM, DeliveryShop.Add{
    int length;
    int width;
    int workers;
    int profit;

    public Bakery(int length, int width, int workers, int profit) {
        this.length = length;
        this.width = width;
        this.workers = workers;
        this.profit = profit;
    }

    public void square(){
        System.out.println(length*width);
    }
    public void profits(int e){
        System.out.println("Кількість працівників: " + workers);
        System.out.println("Прибуток: " + profit);
        System.out.println("Видатки: " + e);
    }
    public void info(){  // метод зі статичним імям
        System.out.println("Кількість працівників: " + workers);
    }
}
