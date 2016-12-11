package Singleton;

public class Singletontry3 {

    private Singletontry3(){}

    private static final Singletontry3 instance = new Singletontry3();

    public static Singletontry3 getInstance(){ return instance; }

    public void demoMessage(){System.out.println("DEMO"); }
}
