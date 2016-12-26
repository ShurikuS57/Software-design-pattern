package DecoratorPattern;

public class Sugar extends CoffeeDecorator  {

    public Sugar(ICoffee mCoffee) {
        super(mCoffee);
    }

    @Override
    public String getDescription() {
        return mCoffee.getDescription() + ", Sugar";
    }

    @Override
    public double getCost() {
        return mCoffee.getCost()+ .3;
    }
}
