package lab_rob_2;

public class Cooker {
    String name;
    int age;
    int experience;

    Cooker(String name, int age, int experience) {
        this.name = name;
        this.age = age;
        this.experience = experience;
    }

    String showName(){
        return name;
    }

    void showExperience(int c){
        System.out.println("Досвід парцівника: " + experience);
        System.out.println("Кількість пройдених додаткових курсів: " + c);
    }
    void showExperience(){  //перевизначений
        System.out.println("Досвід парцівника: " + experience);

    }

    void info(){  // метод зі статичним імям
        System.out.println("Вік працівника: " + age);
    }

    Cooker cookerDemo(int i, String s){
        Cooker cooker = new Cooker(name + s, age + i, experience + i); //метод посилкового типу
        return cooker;
    }

}
