package lab_rob_1;

public class Cooker {
    String name;
    int age;
    int experience;

    public Cooker(String name, int age, int experience) {
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

}
