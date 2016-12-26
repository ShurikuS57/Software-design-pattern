package DecoratorPattern;

public class Milk extends CoffeeDecorator{

    public Milk(ICoffee mCoffee) {
        super(mCoffee);
    }

    @Override
    public String getDescription() {
        return mCoffee.getDescription() + ", Milk";
    }

    @Override
    public double getCost() {
        return mCoffee.getCost() + .25;
    }
}
