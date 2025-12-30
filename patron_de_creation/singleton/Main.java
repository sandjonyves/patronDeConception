package patron_de_creation.singleton;
public class Main{
    public static void main(String[] args) {

        Singleton singleton = Singleton.getInstance();
        singleton.displayI();

        Singleton singleton1 = Singleton.getInstance(10, 20);
        singleton1.display();

        Singleton singleton2 = Singleton.getInstance(10, 20, 30);
        singleton2.display2();

        System.out.println("Sum of 10 and 20: " + singleton1.sum(10, 20));
        System.out.println("Average of 10 and 20: " + singleton1.average(10, 20));

        System.out.println("Sum of 10, 20 and 30: " + singleton2.sum2(10, 20, 30));
        System.out.println("Average of 10, 20 and 30: " + singleton2.average2(10, 20, 30));
    }
}