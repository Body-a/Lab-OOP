package lab_rob_6;


public class Cooker extends Bakery {

    public Cooker(int length, int width, int workers, int profit) {
        super(length, width, workers, profit);
    }


    public void square() {
        System.out.println(length*width);
    }
    public void profits(int e){
        System.out.println("Кількість працівників: " + workers);
        System.out.println("Прибуток: " + profit);
        System.out.println("Видатки: " + e);
    }

}
