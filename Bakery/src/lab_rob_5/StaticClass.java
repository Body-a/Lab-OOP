package lab_rob_5;

public class StaticClass {
    static int one = 34;
    static int two;
    static {
        two = 50;
    }

    static void oneM(){
        System.out.println(one);
    }
    static void twoM(){
        oneM();
        System.out.println(one + two);
    }
}
