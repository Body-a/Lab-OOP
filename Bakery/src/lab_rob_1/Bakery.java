package lab_rob_1;

public class Bakery {
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

    int square(){
        return length*width;
    }
    void profits(int e){
        System.out.println("Кількість працівників: " + workers);
        System.out.println("Прибуток: " + profit);
        System.out.println("Видатки: " + e);
    }
}
