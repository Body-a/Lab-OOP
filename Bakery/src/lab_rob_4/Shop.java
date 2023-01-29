package lab_rob_4;

public class Shop extends Bakery{
    String name = "Хлібокомбінат";

    void information(){
        info();
        System.out.println("Назва магазину: " + name);
    }
    void test(){
        Client client = new Client();
        client.testDemo();

    }
    class Client {
        String products = "Хліб, випічка";
        void testDemo(){
            System.out.println("Клієнт купив: " + products);
            information();
        }
    }


}
