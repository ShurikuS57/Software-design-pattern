package DecoratorPattern;

public abstract class CoffeeDecorator implements ICoffee {

    public ICoffee mCoffee;

    public CoffeeDecorator(ICoffee mCoffee) {
        this.mCoffee = mCoffee;
    }

    @Override
    public String getDescription() {
        return mCoffee.getDescription();
    }

    @Override
    public double getCost() {
        return mCoffee.getCost();
    }
}
