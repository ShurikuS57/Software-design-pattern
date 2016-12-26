package DecoratorPattern;

public class CoffeeMachine {

    public static void main(String[] args) {
        ICoffee coffee = new Sugar(new Milk(new SimpleCoffee()));

        System.out.println("Description: " + coffee.getDescription());
        System.out.println("Cost: " + coffee.getCost());

        ICoffee coffeeWhithMilk = new Milk(new SimpleCoffee());
        System.out.println("Description: " + coffeeWhithMilk.getDescription());
        System.out.println("Cost: " + coffeeWhithMilk.getCost());

    }
}
