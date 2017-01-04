package StrategyPattern;

public class Main {

    public static void main(String[] args) {
        Context context = new Context();
        context.setStrategy(new OperationAdd());
        System.out.println("15 + 15 = "+context.executeStrategy(15, 15));

        context.setStrategy(new OperationSubstract());
        System.out.println("30 - 15 = "+context.executeStrategy(30, 15));
    }
}
