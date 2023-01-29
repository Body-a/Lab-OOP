package lab_rob_5;

public class Delivery extends Cooker {
    private String car;
    private int countDeliveries;
    private int profit;

    Delivery(String car, int countDeliveries, int profit) {
        super();
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

    @Override
    public void info(){  // метод зі статичним імям
        System.out.println("Кількість доставок на день: " + countDeliveries);
    } //перевантажений метод

    void otherClasses(){
        System.out.println("Досвід парцівника: " + super.getExperience());
        System.out.println("Кількість працівників: " + super.getWorkers());
    }

    void methodTwo(){
        System.out.println(profit);
         showExperienceDemo1();
    }






    public String getCar() {
        return car;
    }

    public void setCar(String car) {
        this.car = car;
    }

    public int getCountDeliveries() {
        return countDeliveries;
    }

    public void setCountDeliveries(int countDeliveries) {
        int c = countDeliveries*2;
        this.countDeliveries = c;
    }

    public int getProfit() {
        return profit;
    }

    public void setProfit(int profit) {
        this.profit = profit;
    }
}
