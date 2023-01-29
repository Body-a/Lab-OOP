package lab_rob_2;

public class Bakery {
    int length;
    int width;
    int workers;
    int profit;

    Bakery(int length, int width, int workers, int profit) {
        this.length = length;
        this.width = width;
        this.workers = workers;
        this.profit = profit;
    }
    Bakery(int length, int width) {
        this.length = length;
        this.width = width;
    }

    Bakery() {
    }

    Bakery(int length) {
        this.length = length;
    }

    int square(){
        return length*width;
    }
    void profits(int e){
        System.out.println("Прибуток: " + profit);
        System.out.println("Видатки: " + e);
    }

    double square(double l, double w){  //перевизначений
        return l*w;
    }

    void info(){  // метод зі статичним імям
        System.out.println("Кількість працівників: " + workers);
    }

    int profitB(Bakery bakery){
        profits(40000);       //методу із класу, екземпляр якого передано в якості параметру
        return bakery.profit;
    }
}
