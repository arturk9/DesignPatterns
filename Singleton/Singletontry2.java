package Singleton;

/**
 * Created by artur on 11.12.16.
 */
public class Singletontry2 {

    private Singletontry2(){}

    private static final Singletontry2 instance = new Singletontry2();

    public static Singletontry2 getInstance(){
        return instance;
    }

    public void demoMessage(){
        System.out.println("Demo message");
    }
}
