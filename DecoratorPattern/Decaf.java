package DecoratorPattern;

public class Decaf extends Beverage{

    public Decaf() {
        description = "House Blend Coffee";
    }

    public double cost() {
        return .89;
    }
}