package lab_rob_4;

public class Cooker extends Bakery{
    private String name;
    private int age;
    private int experience;

    Cooker(String name, int age, int experience) {
        this.name = name;
        this.age = age;
        this.experience = experience;
    }

    public Cooker() {

    }

    private String showName(){
        return name;
    }

    private void showExperience(int c){
        System.out.println("Досвід парцівника: " + experience);
        System.out.println("Кількість пройдених додаткових курсів: " + c);
    }
    private void showExperience(){  //перевизначений
        System.out.println("Досвід парцівника: " + experience);

    }

    public void info(){  // метод зі статичним імям
        System.out.println("Вік працівника: " + age);
    }

    private Cooker cookerDemo(int i, String s){
        Cooker cooker = new Cooker(name + s, age + i, experience + i); //метод посилкового типу
        return cooker;
    }
    String showNameDemo(){
        return showName();
    }
    void showExperienceDemo(){
        showExperience(4);
    }
    void showExperienceDemo1(){
        showExperience();
    }
    void infoDemo(){
        info();
    }
    Cooker cookerDemo1(){
        return cookerDemo(2, " Мельник");
    }

    void someMethod(){
        System.out.println(age);
        System.out.println(square());
    }






    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        int e = experience*2;
        this.experience = e;
    }
}
