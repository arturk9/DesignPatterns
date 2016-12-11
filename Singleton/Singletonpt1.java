package Singleton;

public class Singletonpt1 {

    private static final Singletonpt1 instance = new Singletonpt1();

    private Singletonpt1(){};

    public static Singletonpt1 getInstance(){
        return instance;
    }

    public void showMessage(){
        System.out.println("Hello world!");
    }
}
