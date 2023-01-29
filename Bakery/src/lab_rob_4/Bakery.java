package lab_rob_4;

public class Bakery {
    private int length;
    private int width;
    private int workers;
    private int profit;

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







    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        int l = length*2;
        this.length = l;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getWorkers() {
        return workers;
    }

    public void setWorkers(int workers) {
        this.workers = workers;
    }

    public int getProfit() {
        return profit;
    }

    public void setProfit(int profit) {
        this.profit = profit;
    }
}
